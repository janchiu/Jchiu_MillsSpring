package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private int rows = 20;
	private int cols = 12;
	//2d array for rows and columns
	Cell [][] arr1 = new EmptyCell[rows][cols];	
	public Spreadsheet () {
		
	}
	
	public String processCommand(String command)
	{	
		
		if(command == "clear" ){
			return command; // return the grid 
		}
		 // clear A1 = clears a particular cell 
		
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
	

/*
	public String getGridText()
	{
		String[] letters = {"A","B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
		System.out.print("          ");
		for( int k = 0; k<12; k++){
			System.out.print("|"+letters[k] + "         ");
		}
		System.out.println();
		
		for( int i = 1; i<20; i++){
			if(i<=9){
			System.out.print(i+"  "); 
			}
			if(i>=10){
			System.out.print(i+" ");
			}
			for ( int j = 0; j<12; j++ ){
			System.out.print("|" + arr1[i][j].abbreviatedCellText());
			}
			System.out.println();
		}
		return "";
		//abbreviatedCellText();
	}
}
*/
	/*
	public  String getGridText()
	{
		String alphabet= "ABCDEFGHIJKL";
		String firstline;
		String grid="";
		//12
		//first row 
		firstline= (print3());
		for (int i=0; i<=11;i++){
			firstline+=("|" + alphabet.charAt(i)+ print9());
		}
		firstline+= ("\n");
		for (int i=1; i<=20; i++){
			if (i<10){
				grid+= (i + print2()+ "\n");
				for (int j=1; j<=12;i++){
					grid+=("|" + print10());
				}
			}
			if (i>=10){
				grid+=(i + " " + "\n");
				for (int k=1; k<=12;i++){
					grid+=("|" + print10());
			}
			
		}
	}
		return firstline + grid;
}
	
	public String print9(){
		return ("         ");
	}

	public String print3(){
		return ("   ");
	}
	public String print2(){
		return("  ");
		
	}
	public String print10(){
		return("          ");
	}
	*/
	public String getGridText()
	{
		 
		String topLetter = "   |";
		for(char i = 'A'; i<='L'; i++){
			topLetter += i + "         |";
		}
		String numbers = "\n";
		for(int i = 0;i < 20;i++){
			if(i<9){
				numbers += (i+1);
				numbers += "  |";
				for(int j = 0; j<12;j++){
					numbers += arr1[i][j].abbreviatedCellText() + "|";
				}
				numbers +="\n";
			}else{
				numbers += (i+1);
				numbers += " |";
				for(int j = 0; j<12;j++){
					numbers += arr1[i][j].abbreviatedCellText() + "|";
				}
				numbers +="\n";
			}
		}
		return topLetter + numbers;
	}

	public void clear(){
		//clear the entire grid
		for(int i = 0; i<20;i++){
			for(int j = 0;j<12;j++){
				arr1 [i][j] = new EmptyCell();
			}
		}
}
}