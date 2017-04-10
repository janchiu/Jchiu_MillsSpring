package textExcel;

public class ValueCell extends RealCell 
	{

		public ValueCell(String inputValue){
			super(inputValue);
		}

		public String cellContents(){
			return "ValueCell";
		}
	}