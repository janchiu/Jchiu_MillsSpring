package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private int rows = 20;
	private int cols = 12;
	//2d array for rows and columns
	private int [][] arr1 = new int[rows][cols];
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
		return "";
		for( int i = 0; )
		//System.out.println
		//abbreviatedCellText();
	}

}