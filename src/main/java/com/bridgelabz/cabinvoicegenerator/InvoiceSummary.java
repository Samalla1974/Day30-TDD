package com.bridgelabz.cabinvoicegenerator;

public class InvoiceSummary {
private final int numOfRides;
private final double totalFare;
private final double averageFare;

public invoiceSummary(int numOfRides, double totalFare) {
	this.numOfRides = numOfRides;
	this.totalFare = totalFare;
	this.numOfRides = this.totalFare/this.numOfRides;
}

@Override
public boolean equals(Object e) {
	if (this == o) return true;
	if (o == null || getClass() != o.getClass()) return false;
	InvoiceSummmary that = (InvoiceSummmary) o;
	return numOfRides == that.numOfRides &&
			Double.compare(that.totalFare, totalFare) == 0 &&
			Double.compare(that.averageFare, averageFare) == 0;	
}
	
}
