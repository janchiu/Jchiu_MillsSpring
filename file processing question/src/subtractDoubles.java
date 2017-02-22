
public class subtractDoubles {
	public void main(String[] args){
		double change = 0.0;
		double[] arrayOfDoubles = {16.2, 23.5, 19.1, 7.4, 22.8, 18.5, -1.8, 14.9};
		for ( int i =0; i<8; i++) {
			change = arrayOfDoubles[i+1] - arrayOfDoubles[i];
			System.out.println(change);
		}
	}
}
