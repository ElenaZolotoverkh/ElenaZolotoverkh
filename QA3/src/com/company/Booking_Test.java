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
        TestHelper.slp(3);
        Booking_page.setFromKiev();
        Booking_page.setTo("Ивано-Франковск");
        TestHelper.slp(3);
        Booking_page.setToIF();
        Booking_page.setDate("20.10.2015");
        Booking_page.pressSearch();
        TestHelper.slp(3);
        Booking_page.secondTrain();
        Booking_page.thirdTrain();
        TestHelper.slp(3);
        Booking_page.showRoute();
        TestHelper.slp(4);
        Booking_page.choseTrain();
        TestHelper.slp(4);
        Booking_page.checkPlace();
        TestHelper.slp(3);
        Booking_page.choosePlace();
        TestHelper.slp(3);
        Booking_page.setLastName("Test1");
        TestHelper.slp(2);
        Booking_page.setFirstName("Test2");
        TestHelper.quit();
    }
    @Test
    public void test2(){
        Booking_page.setFrom("Львов");
        TestHelper.slp(3);
        Booking_page.setFromLvov();
        Booking_page.setTo("Ужгород");
        TestHelper.slp(3);
        Booking_page.setToY();
        TestHelper.slp(3);
        Booking_page.setDate("30.09.2015");
        TestHelper.slp(3);
        Booking_page.pressSearch();
        TestHelper.slp(3);
        Booking_page.train601();
        TestHelper.slp(3);
        Booking_page.train829();
        TestHelper.slp(3);
        Booking_page.choseTrain601();
        TestHelper.slp(3);
        Booking_page.checkPlace2();
        TestHelper.slp(3);
        Booking_page.choosePlace2();
        TestHelper.slp(3);
        Booking_page.setFirstName1("Test");
        Booking_page.setLastName1("Mia");
        TestHelper.slp(3);
        Booking_page.setFirstName1("TestGo");
        Booking_page.setLastName1("MiaGo");
        TestHelper.slp(3);
        Booking_page.checkPrice();
        TestHelper.slp(3);
        TestHelper.quit();

    }
}
