package com.bridgelabz.cabinvoicegenerator;

public class InvoiceGenerator {
	private static final COST_PER_KILOMETER=10;
	private static final COST_PER_TIME=1;
	private static final double MINIMUM_FARE = 10;
	
	InvoiceGenerator invoicegenerator = new InvoiceGenerator();
	public double calculateFare(double distance,int time) {
		double totalfare= distance * MINIMUM_FARE + time;
		if(totalfare<MINIMUM_FARE)
			return MINIMUM_FARE;
		return totalfare;
	}
	
		public double calculateFare(Ride[] rides) {
			double totalfare =0;
			for(Ride ride: rides) {
				totalfare += this.calculateFare(ride.distance,ride.time);
			}
			return totalfare;
		}
		
		public InvoiceSummary calculateFare1(Ride[] rides) {
			double totalFare=0;
			for(Ride ride: rides) {
				totalFare += this.calculateFare(ride.distance,ride.time);
			}
			return new InvoiceSummary(rides.length,totalFare);
		}
		
		
}




