package com.taxisystem;

import java.util.HashMap;
import java.util.Map;

public class RouteCache {
	
	public  static  final Map<String,Long> ROUTE_CACHE = new HashMap<String,Long>();
	
	static {
		ROUTE_CACHE.put("PUNE-MUMBAI", 120l);
		ROUTE_CACHE.put("PUNE-NASIK", 450l);
	}
	

}
