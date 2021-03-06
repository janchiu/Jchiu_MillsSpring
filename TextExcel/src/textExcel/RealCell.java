package textExcel;


public class RealCell implements Cell {
	private String value;
	
	public RealCell(String input){
		value = input;
	}
	
	public String truncate(String enteredValue){ // truncates the value into 10 spaces
		enteredValue = enteredValue.substring(0, 10);
		return enteredValue;
	}
	
	public String abbreviatedCellText(){
		return truncate(getDouble() + "          ");
	}
	
	public String fullCellText(){
		return value;
	}
	
	public double getDouble(){ // finds the double value of a RealCell
		return Double.parseDouble(value);
	}
}

