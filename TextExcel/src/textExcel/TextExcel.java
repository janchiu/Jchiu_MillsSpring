package textExcel;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextExcel
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Cell a = new TextCell("");
		Grid jdog = new Spreadsheet();
		System.out.println(a.abbreviatedCellText());
		jdog.processCommand("C6 = hggdhrudtdrdfhyduyt");
		System.out.println(jdog.processCommand("C6"));
		System.out.println(jdog.processCommand("C6 = \"hggdhrudtdrdfhyduyt\""));
		//TestsALL.Helper th = new TestsALL.Helper();
        //System.out.println(th.getText());
		
		Scanner input = new Scanner(System.in);
		String command = input.next();
		while(!command.equals("quit")){
			jdog.processCommand(command);
	    	command = input.next();
		}
	    
	    input.close();
	    
	    
	}
}