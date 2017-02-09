
public class StudentAdvanceTicket extends AdvanceTicket {

	public StudentAdvanceTicket(int Ticket, int days) {
		super(Ticket, days);
	}
	public double getPrice() {
		return (super.getPrice())/2.0;
	}

}
