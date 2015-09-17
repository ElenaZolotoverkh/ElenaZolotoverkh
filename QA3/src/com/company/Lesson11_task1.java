package com.company;

import org.junit.Before;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.junit.Test;
import org.testng.Assert;

/**
 * Created by Elena.Zolotoverkh on 08.09.2015.
 */
public class Lesson11_task1 {
    @Test
    public  void test1() {
        setMaster("master", driver);
        setSite("google.com", driver);
        genarate(driver);
        System.out.println(getPass(driver));
        driver.quit();
    }
    @Test
    public  void test2() {
        setMaster("hello", driver);
        setSite("google.com", driver);
        genarate(driver);
        System.out.println(getPass(driver));
        driver.quit();
    }

    @Test
    public  void test3() {
        setMaster("qwe123", driver);
        setSite("gmail.com", driver);
        setEnter(driver);
        testPass();
        driver.quit();

    }

    @Test
    public  void test4() {
        setMaster("qwe123", driver);
        setSite("gmail.com", driver);
        genarate(driver);
        testPass();
        driver.quit();

    }

    @Test
    public  void test5() {
        setMaster("", driver);
        setSite("", driver);
        genarate(driver);
        testPass5();
        driver.quit();

    }

    @Test
    public  void test6() {
        setMaster("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", driver);
        setSite("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", driver);
        genarate(driver);
        testPass6();
        driver.quit();

    }

    @Test
    public  void test7() {
        setMaster("", driver);
        setSite("", driver);
        setEnter(driver);
        testPass7();
        driver.quit();
    }

    @Test
    public  void test8() {
        setMaster("333", driver);
        setSite("111", driver);
        genarate(driver);
        testPass8();
        driver.quit();

    }

    @Test
    public  void test9() {
        setMaster("111", driver);
        setSite("333", driver);
        genarate(driver);
        testPass9();
        driver.quit();
    }

    @Test
    public  void test10() {
        setMaster("~!@#$%^&*()_+{}|\":?></\\", driver);
        setSite("~!@#$%^&*()_+{}|\":?></\\", driver);
        genarate(driver);
        testPass10();
        driver.quit();
    }

    @Test
    public  void test11() {
        setMaster("qwe123", driver);
        setSite("asd", driver);
        genarate(driver);
        testPass11();
        driver.quit();
    }

    @Test
    public  void test12() {
        setMaster("qwe123", driver);
        setSite("ASD", driver);
        genarate(driver);
        testPass12();
        driver.quit();
    }


    public static void setMaster(String value, ChromeDriver driver){
        driver.findElementByXPath("//input[@name='master']").sendKeys(value);
    }


    @Before
    public void newBefore(){
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://angel.net/~nic/passwd.current.html");
    }

    public ChromeDriver driver;


    public static void setSite(String value, ChromeDriver driver){
        driver.findElementByXPath("//input[@name='site']").sendKeys(value);
    }



    public static void genarate(ChromeDriver driver){
        driver.findElementByXPath("//input[@type = 'submit']").click();
    }

    public static void setEnter(ChromeDriver driver){
        driver.findElementByXPath("//input[@name='site']").sendKeys(Keys.ENTER);

    }

    public static String getPass(ChromeDriver driver){
        return  driver.findElementByXPath("//input[@name = 'password']").getAttribute("value");

    }
    public void testPass(){
        Assert.assertEquals("mKJAakDvwbhi6@1a", getPass(driver));

    }

    public void testPass5(){
        Assert.assertEquals("BaefBs8/Z/cm2@1a", getPass(driver));

    }

    public void testPass6(){
        Assert.assertEquals("jFljhvDp1Y9yi@1a", getPass(driver));

    }

    public void testPass7(){
        Assert.assertEquals("BaefBs8/Z/cm2@1a", getPass(driver));

    }

    public void testPass8(){
        Assert.assertEquals("CD/iUTsNwzV4v@1a", getPass(driver));

    }

    public void testPass9(){
    Assert.assertEquals("A61tAOVfX4wCm@1a", getPass(driver));
    }

    public void testPass10(){
        Assert.assertEquals("mWxGz2VYwGgZK@1a", getPass(driver));
    }

    public void testPass11(){
        Assert.assertEquals("agdjoTB4cjI5E@1a", getPass(driver));
    }

    public void testPass12(){
        Assert.assertEquals("FkfaCm2ddwvDg@1a", getPass(driver));
    }

}
