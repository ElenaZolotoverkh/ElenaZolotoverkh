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
    public static void setFromLvov(){
        TestHelper.driver.findElementByXPath("//div[@title='Львов']").click();
    }
    public static void setTo(String value){
        TestHelper.driver.findElementByXPath("//input[@name='station_till']").sendKeys(value);
    }
    public static void setToIF(){
        TestHelper.driver.findElementByXPath("//div[@title='Ивано-Франковск']").click();
    }
    public static void setToY(){
        TestHelper.driver.findElementByXPath("//div[@title='Ужгород']").click();
    }
    public static void setDate(String value){
        TestHelper.driver.findElementByXPath("//input[@name='date_dep']").clear();
        TestHelper.driver.findElementByXPath("//input[@name='date_dep']").sendKeys(value);
        TestHelper.driver.findElementByXPath("//input[@name='date_dep']").sendKeys(Keys.ENTER);
    }
    public static void pressSearch(){
        TestHelper.driver.findElementByXPath("//button[@name='search']").click();
    }
    public static void secondTrain(){
        Assert.assertEquals(TestHelper.driver.findElementByXPath("//tbody//tr[2]//a").getText(),"043 К");
    }
    public static void thirdTrain(){
        Assert.assertEquals(TestHelper.driver.findElementByXPath("//tbody//tr[3]//a").getText(),"143 К");
    }
    public static void train601(){
        Assert.assertEquals(TestHelper.driver.findElementByXPath("//tbody//tr[5]//a").getText(),"601 Л");
    }
    public static void train829(){
        Assert.assertEquals(TestHelper.driver.findElementByXPath("//tbody//tr[4]//a").getText(),"829 Л");
    }
    public static void showRoute(){

        TestHelper.driver.findElementByXPath("//tbody//tr[2]//a").click();
        TestHelper.slp(4);
        Assert.assertEquals(TestHelper.driver.findElementByXPath("//div[@class='vToolsPopupHeader']/span").getText(),"Маршрут поезда");
        TestHelper.slp(4);
        TestHelper.driver.findElementByXPath("//a[@title='закрыть']").click();
    }
    public static void choseTrain(){

        TestHelper.driver.findElementByXPath("//tbody//tr[2]//div[@title='Купе']//button[text()='Выбрать']").click();

    }

    public static void choseTrain601(){
        TestHelper.driver.findElementByXPath("//tr[5]//div[@title='Плацкарт']//button[text()='Выбрать']").click();
    }

    public static void checkPlace(){

        Assert.assertEquals(TestHelper.driver.findElementByXPath("//span[text()='31']").getCssValue("color"),"rgba(0, 0, 0, 1)");
        TestHelper.slp(4);
        Assert.assertEquals(TestHelper.driver.findElementByXPath("//div[@class='coach_scheme coup t3']/span/b").getText(),"№\n5");
    }
    public static void checkPlace2(){

        Assert.assertEquals(TestHelper.driver.findElementByXPath("//span[text()='41']").getCssValue("color"),"rgba(0, 0, 0, 1)");
        TestHelper.slp(4);
        Assert.assertEquals(TestHelper.driver.findElementByXPath("//span[text()='42']").getCssValue("color"),"rgba(0, 0, 0, 1)");
    }
    public static void choosePlace(){
        TestHelper.driver.findElementByXPath("//span[text()='31']").click();
    }
    public static void choosePlace2(){
        TestHelper.driver.findElementByXPath("//span[text()='41']").click();
        TestHelper.driver.findElementByXPath("//span[text()='42']").click();
    }
    public static void setLastName1(String value){
        TestHelper.driver.findElementByXPath("//tr[@class='vToolsDataTableRowSelected']//input[@class='lastname']").sendKeys(value);
    }
    public static void setFirstName1(String value){
        TestHelper.driver.findElementByXPath("//tr[@class='vToolsDataTableRowSelected']//input[@class='firsname']").sendKeys(value);
    }
    public static void setLastName2(String value){
        TestHelper.driver.findElementByXPath("//tr[@class='vToolsDataTableRow']//input[@class='lastname']").sendKeys(value);
    }
    public static void setFirstName2(String value){
        TestHelper.driver.findElementByXPath("//tr[@class='vToolsDataTableRow']//input[@class='firsname']").sendKeys(value);
    }
    public static void setLastName(String value){
        TestHelper.driver.findElementByXPath("//input[@class='lastname']").sendKeys(value);
    }
    public static void setFirstName(String value){
        TestHelper.driver.findElementByXPath("//input[@class='firstname']").sendKeys(value);
    }
    public static void checkPrice(){
        Assert.assertEquals(TestHelper.driver.findElementByXPath("//button[@class='complex_btn']//b").getText(),"163,76 грн");
    }
}
