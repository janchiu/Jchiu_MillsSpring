package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner userInput = new Scanner(System.in);
		Spreadsheet jdog = new Spreadsheet(); 
		String[][] arr1 = new String[20][12];
		for ( int i = 0; i< arr1.length; i++) {
			for( int j = 0; j < arr1[i].length; j++){
			arr1[i][j] = userInput.nextLine(); 
			}
		}
		if(userInput = "quit"){
			
		}
	    // Add your command loop here
		userInput.close();
	}
}
