package textExcel;

import java.io.FileNotFoundException;

import java.util.Scanner;
import textExcel.TestsALL.TestLocation;
public class TextExcel
{
	public static void main(String[] args) throws FileNotFoundException
	{
		    Spreadsheet jdog = new Spreadsheet();
		    Scanner input = new Scanner(System.in);
		    String command = input.nextLine();
		    if(command == "open myData.csv"){
		    	
		    }
		    while (!command.equals("quit")){
		    	System.out.println(jdog.processCommand(command));
		    	command = input.nextLine();
		    }
		    input.close();
	}
}

