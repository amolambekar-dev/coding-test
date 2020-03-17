package com.taxisystem;

public class SimpleTaxiSystem {
	
	
	
	
	
	
	public static void main(String[] args) {
		Route route = new Route("PUNE", "MUMBAI");
		Integer travellers = 2;
		FareCalculator  fareCalculator =new FareCalculator(route.getDistance(), travellers);
		Long fare = fareCalculator.fare();
		Ticket ticket = new Ticket();
		ticket.setCost(fare);
		ticket.setSource(route.getSource());
		ticket.setDestination(route.getDestination());
		ticket.setTravellers(travellers);
		ticket.setDistance(route.getDistance());
		
		System.out.println( new TicketPrinter(ticket).print());
		
		
		Route route1 = new Route("PUNE", "NASIK");
		
		FareCalculator  fareCalculator1 =new FareCalculator(route1.getDistance(), 3);
		Long fare1 = fareCalculator1.fare();
		Ticket ticket1 = new Ticket();
		ticket1.setCost(fare1);
		ticket1.setSource(route1.getSource());
		ticket1.setDestination(route1.getDestination());
		ticket1.setTravellers(3);
		ticket1.setDistance(route1.getDistance());
		
		System.out.println( new TicketPrinter(ticket1).print());
		
	}

}
