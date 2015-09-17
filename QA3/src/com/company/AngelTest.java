package com.company;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

/**
 * Created by Elena.Zolotoverkh on 08.09.2015.
 */
public class AngelTest {
    @Test
    public static void test1() {
        AngelPage.setMaster("master");
        AngelPage.setSite("google.com");
        AngelPage.genarate();
        System.out.println(AngelPage.getPass());
        TestHelper.driver.quit();
    }
    @Test
    public static void test2() {
        AngelPage.setMaster("hello");
        AngelPage.setSite("google.com");
        AngelPage.genarate();
        System.out.println(AngelPage.getPass());
        TestHelper.driver.quit();
    }

    @Test
    public static void test3() {
        AngelPage.setMaster("qwe123");
        AngelPage.setSite("gmail.com");
        AngelPage.setEnter();
        AngelPage.testPass();
        TestHelper.driver.quit();

    }

    @Test
    public static  void test4() {
        AngelPage.setMaster("qwe123");
        AngelPage.setSite("gmail.com");
        AngelPage.genarate();
        AngelPage.testPass();
        TestHelper.driver.quit();

    }

    @Test
    public static  void test5() {
        AngelPage.setMaster("");
        AngelPage.setSite("");
        AngelPage.genarate();
        AngelPage.testPass5();
        TestHelper.driver.quit();

    }

    @Test
    public static void test6() {
        AngelPage.setMaster("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        AngelPage.setSite("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        AngelPage.genarate();
        AngelPage.testPass6();
        TestHelper.driver.quit();

    }

    @Test
    public static void test7() {
        AngelPage.setMaster("");
        AngelPage.setSite("");
        AngelPage.setEnter();
        AngelPage.testPass7();
        TestHelper.driver.quit();
    }

    @Test
    public static void test8() {
        AngelPage.setMaster("333");
        AngelPage.setSite("111");
        AngelPage.genarate();
        AngelPage.testPass8();
        TestHelper.driver.quit();

    }

    @Test
    public static void test9() {
        AngelPage.setMaster("111");
        AngelPage.setSite("333");
        AngelPage.genarate();
        AngelPage.testPass9();
        TestHelper.driver.quit();
    }

    @Test
    public static void test10() {
        AngelPage.setMaster("~!@#$%^&*()_+{}|\":?></\\");
        AngelPage.setSite("~!@#$%^&*()_+{}|\":?></\\");
        AngelPage.genarate();
        AngelPage.testPass10();
        TestHelper.driver.quit();
    }

    @Test
    public static void test11() {
        AngelPage.setMaster("qwe123");
        AngelPage.setSite("asd");
        AngelPage.genarate();
        AngelPage.testPass11();
        TestHelper.driver.quit();
    }

    @Test
    public static void test12() {
        AngelPage.setMaster("qwe123");
        AngelPage.setSite("ASD");
        AngelPage.genarate();
        AngelPage.testPass12();
        TestHelper.driver.quit();
    }


    @Before
    public void newBefore(){
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        TestHelper.driver = new ChromeDriver();
        TestHelper.setup(AngelPage.url);
    }


}
