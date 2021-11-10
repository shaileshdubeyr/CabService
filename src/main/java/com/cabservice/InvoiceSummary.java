package com.cabservice;

public class InvoiceSummary {
    private final int numberOfRide;
    private final double totalFare;
    private final double averageFare;

    public  InvoiceSummary(int numbeerOfRide, double totalFare){
        this.numberOfRide = numbeerOfRide;
        this.totalFare = totalFare;
        this.averageFare = this.totalFare/this.numberOfRide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary summary = (InvoiceSummary) o;
        return numberOfRide == summary.numberOfRide && Double.compare(summary.totalFare, totalFare) == 0 && Double.compare(summary.averageFare, averageFare) == 0;
    }

}
