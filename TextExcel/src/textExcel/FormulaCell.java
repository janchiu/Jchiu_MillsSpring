package textExcel;

public class FormulaCell extends RealCell {
	@Override
	public String abbreviatedCellText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fullCellText() {
		return super.fullCellText();
	}
	
	public FormulaCell (String enteredForm){
		super(enteredForm);
	}

}
