package com.company;

import org.openqa.selenium.Keys;
import org.testng.Assert;

/**

 * Created by Admin on 08.09.15.
 */
public class AngelPage {
    public static String url = "http://angel.net/~nic/passwd.current.html";
    public static void setMaster(String value){
        TestHelper.driver.findElementByXPath("//input[@type='password']").sendKeys(value);
    }

    public static void setSite(String value){
        TestHelper.driver.findElementByXPath("//tr[2]//input").sendKeys(value);
    }

    public static void genarate(){
        TestHelper.driver.findElementByXPath("//input[@type='submit']").click();
    }
    public static void genarateVisible() {TestHelper.driver.findElementByXPath("//input[@type='submit']").isDisplayed();}

    public static void setEnter(){
        TestHelper.driver.findElementByXPath("//tr[2]//input").sendKeys(Keys.ENTER);
    }
    public static String getPass(){
        return  TestHelper.driver.findElementByXPath("//tr[4]//td[2]//input").getAttribute("value");
    }
    public static String getSite(){
        return  TestHelper.driver.findElementByXPath("//tr[2]//input").getAttribute("value");
    }
    public static void isMasterEnabled(){
        Assert.assertTrue(TestHelper.driver.findElementByXPath("//input[@type='password']").isEnabled());
    }

    public static void isSiteEnabled(){
        Assert.assertTrue(TestHelper.driver.findElementByXPath("//tr[2]//input").isEnabled());
    }
    public static void isPassEnabled(){
        Assert.assertTrue(TestHelper.driver.findElementByXPath("//tr[4]//input").isEnabled());
    }
    public static void masterValue(){
        TestHelper.driver.findElementByXPath("//input[@type='password']").getAttribute("value");
    }
    public static void siteFull(){
        Assert.assertEquals("ASD123", getSite());
    }

    public static void nameMaster(){
        Assert.assertEquals(TestHelper.driver.findElementByXPath("//tr[1]//td[1]").getText(), "Your master password");
    }
    public static void nameSite(){
        Assert.assertEquals(TestHelper.driver.findElementByXPath("//tr[2]//td[1]").getText(), "Site name");
    }
    public static void namePass(){
        Assert.assertEquals(TestHelper.driver.findElementByXPath("//tr[4]//td[1]").getText(), "Generated password");
    }

    public static void testPass(){
        Assert.assertEquals("jFljhvDp1Y9yi@1a", getPass());

    }

    public static void testPass3(){
        Assert.assertEquals("mKJAakDvwbhi6@1a", getPass());

    }

    public static void testPass4(){
        Assert.assertEquals("mKJAakDvwbhi6@1a", getPass());

    }

    public static void testPass5(){
        Assert.assertEquals("BaefBs8/Z/cm2@1a", getPass());

    }

    public static void testPass6(){
        Assert.assertEquals("jFljhvDp1Y9yi@1a", getPass());

    }

    public static void testPass7(){
        Assert.assertEquals("BaefBs8/Z/cm2@1a", getPass());

    }

    public static void testPass8(){
        Assert.assertEquals("CD/iUTsNwzV4v@1a", getPass());

    }

    public static void testPass9(){
    Assert.assertEquals("A61tAOVfX4wCm@1a", getPass());
    }

    public static void testPass10(){
        Assert.assertEquals("mWxGz2VYwGgZK@1a", getPass());
    }

    public static void testPass11(){Assert.assertEquals("agdjoTB4cjI5E@1a", getPass());
    }

    public static void testPass12(){
        Assert.assertEquals("FkfaCm2ddwvDg@1a", getPass());
    }

    public static void testPass14(){
        Assert.assertEquals("ecvS4RbdKRn8g@1a", getPass());
    }


}
