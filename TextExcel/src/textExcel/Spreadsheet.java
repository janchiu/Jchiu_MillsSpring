
package textExcel;

import java.io.*;
import java.util.Scanner;


public class Spreadsheet implements Grid{
	Cell[][] data;
	private int row = 20;
	private int column = 12;
	
	public Spreadsheet(){
		clear(); // 
	}

	@Override
	public String processCommand(String command){
		String[] splitWords = command.split(" ", 3);

		if(command.equals("")){
			return "";
		}
		else if(splitWords.length == 2 && splitWords[0].toLowerCase().equals("clear")){
			clearLocation(new SpreadsheetLocation(splitWords[1]));
			return getGridText();
		}
		else if(splitWords.length == 3 && splitWords[2].startsWith("\"")){
			String word = splitWords[2].substring(1, splitWords[2].length() - 1);
			setCell(new SpreadsheetLocation(splitWords[0]), new TextCell(word));
			return getGridText();
		} else if(splitWords.length == 1 && !splitWords[0].equalsIgnoreCase("clear")){
			String value = this.getCell(new SpreadsheetLocation(command)).fullCellText();
			if(value.endsWith(".0")){
				value = getCell(new SpreadsheetLocation(command)).fullCellText().substring(0, value.length() - 2);
			}
			return value;
		} else if(splitWords.length == 3 && splitWords[1].equals("=")){
			if(splitWords[2].indexOf("%")!= -1){
				String inputNumber = splitWords[2].substring(0, splitWords[2].length() - 1);
				setCell(new SpreadsheetLocation(splitWords[0]), new PercentCell(inputNumber));
				return getGridText();
			} else if(splitWords[2].startsWith("(")){
				setCell(new SpreadsheetLocation(splitWords[0]), new FormulaCell(splitWords[2], this));
				return getGridText();
			
			}else{
				String value = splitWords[2];
				setCell(new SpreadsheetLocation(splitWords[0]), new ValueCell(value));
				return getGridText();
			}
		
		}	else if(splitWords.length == 1 && splitWords[0].toLowerCase().equals("clear")){
			clear();
			return getGridText();
		}
		return "";
	}


	public void clear(){
		data = new Cell[row][column];
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				data[i][j] = new EmptyCell();
			}
		}
	}

	public void clearLocation(SpreadsheetLocation location){
		setCell(location, new EmptyCell());
	}
	
	public int getRows(){
		return data.length;
	}

	public int getCols(){
		return data[0].length;
	}

		public Cell getCell(Location loc){
		return data[loc.getRow()][loc.getCol()];
	}
	
	public void setCell(SpreadsheetLocation cellLoc, Cell value) {
		data[cellLoc.getRow()][cellLoc.getCol()] = value;
	}
	

	public String getGridText()
	{
	
		String lettersOnTop = "   |";
		
	 		String[] letters = {"A","B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
			
	 		for( int k = 0; k<12; k++){
	 			lettersOnTop += letters[k] + "         |";
	 		}
	 		String number = "\n";
	 		
		for(int i = 0;i < 20;i++){
			if(i<9){
				number += (i+1)+"  |";
				for(int j = 0; j<12;j++){
					number += data[i][j].abbreviatedCellText() + "|";
				}
				number +="\n";
			}else{
				number += (i+1)+" |";
				for(int j = 0; j<12;j++){
					number += data[i][j].abbreviatedCellText() + "|";
				}
				number +="\n";
			}
		}
		return lettersOnTop+number;
	}

	
}