package com.cabservice;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare(){
       InvoiceGenerator invoicegenerator =  new InvoiceGenerator();
       double distance = 2.0;
       int time = 5;
      double fare =  invoicegenerator.calculateFare(distance, time);

        Assert.assertEquals(25.0,fare, 0.0);
    }
}
