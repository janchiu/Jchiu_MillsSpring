package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private int rows = 20;
	private int cols = 12;
	//2d array for rows and columns
	Cell [][] arr1 = new EmptyCell[rows][cols];
	public String processCommand(String command)
	{	
		return "";
	}
	public int getRows()
	{
		return this.rows;
	}
	public int getCols()
	{
		return this.cols;
	}

	public Cell getCell(Location loc)
	{
		return null;
	}

	public String getGridText()
	{
		String[] letters = {"A","B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
		for( int k = 0; k<12; k++){
			System.out.print(letters[k] + "  ");
		}
		System.out.println();
		for( int i = 1; i<20; i++){
			System.out.print(i+"  ");
			for ( int j = 0; j<12; j++ ){
			System.out.print("|         |");
			}
			System.out.println();
		}
		return "";
		//System.out.println
		//abbreviatedCellText();
	}

}