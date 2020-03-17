package com.taxisystem;

public class FareCalculator {
	
	private Long distance;
	
	private Integer travellers;
	
	public FareCalculator(Long distance, Integer travellers) {
		
		this.distance=distance;
		this.travellers=travellers;
				
		
	}
	
	public Long fare() {
		Long fare = null;
    if(distance!=null && distance.longValue() <=100) {
		fare = Long.valueOf(750l);
		} else {
			fare =   (Long.valueOf(750+(this.distance.longValue()-100)*5)); 
			fare = Long.valueOf(fare.longValue()* travellers.intValue());
		}
		return fare;
	}

}
