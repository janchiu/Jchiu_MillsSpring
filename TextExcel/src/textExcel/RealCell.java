package textExcel;


public class RealCell implements Cell {
	private String value;
	
	public RealCell(String input){
		value = input;
	}
	
	public String truncate(String input){
		input = input.substring(0, 10);
		return input;
	}
	
	public String abbreviatedCellText(){
		return truncate(getDouble() + "          ");
	}
	
	public String fullCellText(){
		return value;
	}
	
	public double getDouble(){
		return Double.parseDouble(value);
	}
}

