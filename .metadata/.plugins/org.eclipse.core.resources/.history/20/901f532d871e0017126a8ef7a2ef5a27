 package textExcel;

public class PercentCell extends RealCell {
	
private String input;
	public PercentCell(String input){
		super(input);
		this.input = input;
	}
	
	public String abbreviatedCellText(){
		return truncate(((int) getDouble() + "%        ")); // edit 	
	}

	public String fullCellText(){
		return (getDouble()/100 + "");
	}
	
	public String cellContents(){
		return "PercentCell";
	}
	
	public double getDoubleValue(String words){
		return Double.parseDouble(input.substring(0, input.length()-1))/100;
	}
}
	
	

	