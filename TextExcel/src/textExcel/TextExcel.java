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
		String user= userInput.next();
		while(!userInput.equals("quit")){
			jdog.processCommand(user);
			user = userInput.nextLine();
		}
		//if(userInput.equals("quit")){
			//userInput.close();
		//}
	    // Add your command loop here
	}
}
