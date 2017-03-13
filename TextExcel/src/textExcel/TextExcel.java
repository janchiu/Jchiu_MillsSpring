package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner userInput = new Scanner(System.in);
		String user= userInput.next();
		Spreadsheet jdog = new Spreadsheet();
		jdog.getGridText();
		while(!userInput.equals("quit")){
			jdog.processCommand(user);
			user = userInput.nextLine();
		}
		if(userInput.equals("quit")){
			userInput.close();
		}
	   
	}
}
