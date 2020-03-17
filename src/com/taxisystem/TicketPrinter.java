package com.taxisystem;

public class TicketPrinter {
	
	private  Ticket ticket;
	
	public TicketPrinter(Ticket ticket) {
		this.ticket=ticket;
		
	}
	
	public String print() {
		return "Taxi Ticket " + "Source: " + ticket.getSource() + " Desitnation :" + ticket.getDestination()
				+ " DIstance :" + ticket.getDistance() + " Travellers :" + ticket.getTravellers() + " Fare :"
				+ ticket.getCost();
	}

}
