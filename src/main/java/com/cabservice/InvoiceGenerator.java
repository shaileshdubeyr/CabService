package com.cabservice;

public class InvoiceGenerator {
    final int THE_DISTANCE_OF_EACH_KM = 10;
    final int PER_MINUTE_TIME = 1;
    final int MINUMUM_FARE = 5;

    public double calculateFare(double distance , int time ) {
        double totalMinimumFare = distance * THE_DISTANCE_OF_EACH_KM + time * PER_MINUTE_TIME;

        return totalMinimumFare < MINUMUM_FARE ? MINUMUM_FARE : totalMinimumFare;
    }
    public InvoiceSummary calculateFare(Ride [] rides){
        double totalFare = 0;
        for(Ride ride : rides){
            totalFare += this.calculateFare(ride.distance, ride.time);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }
}
