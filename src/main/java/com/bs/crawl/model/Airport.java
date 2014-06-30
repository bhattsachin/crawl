package com.bs.crawl.model;

/**
 * Airport codes as enum
 * Contains only top 40 as per this information
 * <p>
 * http://www.world-airport-codes.com/us-top-40-airports.html
 * <p>
 * @author root
 *
 */
public enum Airport {
	ATL("Atlanta", "Hartsfield Jackson Atlanta International"),
	ORD("Chicago","Chicago O'Hare International"),
	LAX("Los Angeles","Los Angeles International"),
	DFW("Dallas-Fort Worth","Dallas Fort Worth International"),
	DEN("Denver","Denver International"),
	JFK("New York","John F Kennedy International"),
	SFO("San Francisco","San Francisco International"),
	CLT("Charlotte","Charlotte Douglas International"),
	LAS("Las Vegas","McCarran International"),
	PHX("Phoenix","Phoenix Sky Harbor International");
	
	public String city;
	public String airport;
	
	private Airport(String city, String airport){
		this.city = city;
		this.airport = airport;
	}
	
	

}
