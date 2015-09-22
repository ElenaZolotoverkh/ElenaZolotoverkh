package com.company;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.security.Key;

/**
 * Created by Admin on 22.09.15.
 */
public class Booking_page {
    public static String url = "http://booking.uz.gov.ua/";
    public static void setFrom(String value){
        TestHelper.driver.findElementByXPath("//input[@name='station_from']").sendKeys(value);
    }
    public static void setFromKiev(){
        TestHelper.driver.findElementByXPath("//div[@title='Киев']").click();
    }
    public static void setTo(String value){
        TestHelper.driver.findElementByXPath("//input[@name='station_till']").sendKeys(value);
    }
    public static void setToIF(){
        TestHelper.driver.findElementByXPath("//div[@title='Ивано-Франковск']").click();
    }
    public static void setDate(String value){
        TestHelper.driver.findElementByXPath("//input[@name='date_dep']").clear();
        TestHelper.driver.findElementByXPath("//input[@name='date_dep']").sendKeys(value);
        TestHelper.driver.findElementByXPath("//input[@name='date_dep']").sendKeys(Keys.ENTER);
    }
    public static void setSearch(){
        TestHelper.driver.findElementByXPath("//button[@name='search']").click();
    }
    public static void secondTrain(){
        Assert.assertEquals(TestHelper.driver.findElementByXPath("//tbody//tr[2]//a").getText(),"043 К");
    }
    public static void thirdTrain(){
        Assert.assertEquals(TestHelper.driver.findElementByXPath("//tbody//tr[3]//a").getText(),"143 К");
    }
    public static void setTrain(){
        TestHelper.driver.findElementByXPath("//tbody//tr[2]//a").click();
        TestHelper.slp(4);
        TestHelper.driver.findElementByXPath("//a[@title='закрыть']").click();
        TestHelper.slp(4);
        TestHelper.driver.findElementByXPath("//tbody//tr[2]//div[@title='Купе']//button[text()='Выбрать']").click();
        TestHelper.slp(5);
        Assert.assertEquals(TestHelper.driver.findElementByXPath("//span[text()='31']").getCssValue("color"),"rgba(0, 0, 0, 1)");
        Assert.assertEquals(TestHelper.driver.findElementByXPath("//b[text()='5']").getText(),"5");


    }
}
