
public class Tickets {
	private int Ticket;
	private double price;
	public Tickets(int Ticket){
		this.Ticket = Ticket;
	}
	public double getPrice() {
		return price;
	}
	public String toString() {
		return "Ticket number: "+ Ticket + ", Price: "+ price;
	}
}
