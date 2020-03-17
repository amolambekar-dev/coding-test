package com.taxisystem;

public class Route {
	
	private String source;
	
	private String destination;
	
	private Long distance;

	
	//private FareCalculator fareCalculator;
	
	public Route(String source, String destination) {
		this.source=source;
		this.destination=destination;
		this.distance= RouteCache.ROUTE_CACHE.get(source+"-"+destination);
	
		
	}

	public String getSource() {
		return source;
	}

	public String getDestination() {
		return destination;
	}

	public Long getDistance() {
		return distance;
	}
	
	
	
	

}
