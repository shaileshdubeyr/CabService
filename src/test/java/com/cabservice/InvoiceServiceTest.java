package com.cabservice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceServiceTest {
    InvoiceGenerator invoiceGenerator = null;

    @Before
    public void setup() throws Exception{
        invoiceGenerator = new InvoiceGenerator();
    }

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare(){
       double distance = 10;
       int time = 5;
      double fare =  invoiceGenerator.calculateFare(distance, time);

        Assert.assertEquals(26.0,fare, 0.0);
    }

    @Test
    public void givenLessDistanceAndTimeShouldReturnMinimumFare(){
        double distance = 0.1;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(6,fare,0.0);
    }

    @Test
    public void givenLessDistanceAndTimeShouldReturnTotleFare(){
        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(0.1, 5)
        };
        double fare = invoiceGenerator.calculateFare(rides);
        Assert.assertEquals(31,fare,0.0);

    }
}
