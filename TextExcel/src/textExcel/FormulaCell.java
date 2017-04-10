package textExcel;

public class FormulaCell extends RealCell{
	Spreadsheet original;
	
	public FormulaCell(String value, Spreadsheet sheet){
		super(value);
		original = sheet;
	}


	
	public String cellContents(){
		return "FormulaCell";
	}
}

