package textExcel;

public class ValueCell extends RealCell 
	{
	private String answer;
	
	public ValueCell(String enteredValue){
		super(enteredValue);	
	}
	public double getDoubleValue(){
		answer = getCellContents();
		
		double doubleValue=Double.parseDouble(answer);
		return doubleValue;
	}
	public String abbreviatedCellText(){
		String answer=getCellContents();		
		double moreStuff= Double.parseDouble(answer);
		answer=moreStuff+"";
		if(answer.indexOf(".")==-1){
			answer+=(".0");
		}
		answer+="          ";
		return answer.substring(0,10);
	}
	public String fullTextCell(){
		answer=getCellContents();
		return  getDoubleValue()+"";
	}
	
	

}