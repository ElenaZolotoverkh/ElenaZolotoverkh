package com.company;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Admin on 22.09.15.
 */
public class Booking_Test {

    @Before
    public void newBefore(){
        TestHelper.setup("http://booking.uz.gov.ua/");
    }


    @Test
    public void test1(){
       Booking_page.setFrom("Киев");
        TestHelper.slp(2);
        Booking_page.setFromKiev();
        Booking_page.setTo("Ивано-Франковск");
        TestHelper.slp(2);
        Booking_page.setToIF();
        Booking_page.setDate("20.10.2015");
        Booking_page.setSearch();
        TestHelper.slp(2);
        Booking_page.secondTrain();
        Booking_page.thirdTrain();
        TestHelper.slp(2);
        Booking_page.setTrain();
    }
}
