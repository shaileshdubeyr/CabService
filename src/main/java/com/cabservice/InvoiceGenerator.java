package com.cabservice;

public class InvoiceGenerator {

    public double calculateFare(double distance , int time ) {
        final int THE_DISTANCE_OF_EACH_KM = 10;
        return  distance * THE_DISTANCE_OF_EACH_KM + time;
    }
}
