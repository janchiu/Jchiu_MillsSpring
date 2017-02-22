import java.io.*;
import java.util.*;
public class subtractDoubles {
Scanner input = new Scanner(System.in);
	public void main(String[] args){
		double change = 0.0;
		double[] arrayOfDoubles = new double[8];
		for (int i =0; i<8; i++) {
			arrayOfDoubles[i] = input.nextDouble();
			change = arrayOfDoubles[i+1] - arrayOfDoubles[i];
			System.out.println(change);
		}
	}
}
