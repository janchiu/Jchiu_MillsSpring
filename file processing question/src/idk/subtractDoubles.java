package idk;
import java.io.*;
import java.util.*;
public class subtractDoubles {
	public void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("./data/weather.txt"));
		double change = 0.0;
		double[] arrayOfDoubles = new double[8];
		for(int i = 0; i<7;i++){
			arrayOfDoubles[i] = input.nextDouble();
		}
		for (int i =0; i<8; i++) {
			change = arrayOfDoubles[i+1] - arrayOfDoubles[i];
			System.out.println(arrayOfDoubles[i]+" to "+ arrayOfDoubles[i+1] + " change: "+ change);
		}
		input.close();
	}
}

