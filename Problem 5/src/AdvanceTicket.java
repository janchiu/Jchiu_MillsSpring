
public class AdvanceTicket extends Tickets{
	private int days;
	public AdvanceTicket(int days, int Ticket){
		super(Ticket);
		this.days = days;
	}
	public double getPrice(){
		if (days >= 10)
			return 30.0;
		
		else
			return 40.0;
}
}
