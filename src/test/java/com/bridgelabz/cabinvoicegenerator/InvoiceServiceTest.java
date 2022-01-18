package com.bridgelabz.cabinvoicegenerator;
import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {

	@Test
	public void givenSpeedAndDistance_ShouldReturnTrue() {
		InvoiceGenerator invoicegenerator = new InvoiceGenerator();
		double distance = 5.0;
		int time = 5;
		double totalfare= invoicegenerator.calculateFare(distance, time);
		Assert.assertEquals(distance,time);
	}
	@Test
	public void givenLessDistanceOrTime_ShouldReturnMinFare() {
		InvoiceGenerator invoicegenerator = new InvoiceGenerator();
		double distance = 5.0;
		int time = 5;
		double totalfare= invoicegenerator.calculateFare(distance, time);
		Assert.assertEquals(distance,time);	
	}

	@Test
	public void givenMultipleRide_ShouldReturnTotalFare() {
		InvoiceGenerator invoicegenerator = new InvoiceGenerator();
		Ride[] rides = {	new Ride (distance 2.0  time 2),
							new Ride (distance 3.0  time 3)
		};
		double fare= invoicegenerator.calculateFare(rides);
		Assert.assertEquals(distance,time);
	}
	@Test
	public void givenMultipleRides_ShouldReturnInvoiceSummary() {
		Ride[] rides = {	new Ride (distance 2.0  time 2),
				new Ride (distance 3.0  time 3)
        InvoiceSummary summary = new InvoiceSummary.calculateFare(rides);
		InvoiceSummary expectedInvoiceSummary =new InvoiceSummary (numOfRides, );
		Assert.assertEquals(expected InvoiceSummary,summary);
		};
}

