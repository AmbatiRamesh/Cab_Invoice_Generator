package com.bridgelabz.cabInvoiceGenerator;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class CabInvoiceGeneratorTest {
    CabInvoiceGenerator cabInvoiceGenerator=new CabInvoiceGenerator();
    @Before
    public  void printBeforeAllMsg() {
        System.out.println("-------Welcome to the Cab Invoice Generator Program-------");
    }
    @After
    public void PrintAfterEachTestCasePass(){
        System.out.println("passed");
    }
    @Test
    public  void givenDistanceAndTime_shouldReturn_CalculateFare() {
        double distance = 10.0;
        double time = 4.0;
        double fare = cabInvoiceGenerator.travelCost(distance, time);
        assertEquals(104.0,fare,0.0 );
    }
    @Test
    public void givenMultipleRides_shouldReturn_invoiceCost() {
        Ride[] rides = { new Ride(4, 25), new Ride(10, 60) };
        double fare = cabInvoiceGenerator.calculateFareForMultipleRides(rides);
        assertEquals(225.0, fare,0);
    }
}
