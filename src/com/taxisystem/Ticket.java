package com.taxisystem;

public class Ticket {
	
	private String source;
	
	private String destination;
	
	private Long cost;
	
	private Integer travellers;

	private Long distance;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Long getCost() {
		return cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	public Integer getTravellers() {
		return travellers;
	}

	public void setTravellers(Integer travellers) {
		this.travellers = travellers;
	}

	public void setDistance(Long distance) {
		this.distance= distance;
		
	}
	public Long getDistance() {
		return  distance;
		
	}
	
	
	
	
	
	

}
