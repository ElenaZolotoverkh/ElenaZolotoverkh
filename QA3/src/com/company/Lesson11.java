package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Lesson11 {
    @Test
    public void test1() {
        AngelPage.setMaster("master");
        AngelPage.setSite("google.com");
        AngelPage.genarate();
        System.out.println(AngelPage.getPass());
    }
    @Test
    public void test2() {
        AngelPage.setMaster("hello");
        AngelPage.setSite("google.com");
        AngelPage.genarate();
        System.out.println(AngelPage.getPass());
    }

    @Test
    public void test3() {
        AngelPage.setMaster("qwe123");
        AngelPage.setSite("gmail.com");
        AngelPage.setEnter();
        AngelPage.testPass3();
    }

    @Test
    public  void test4() {
        AngelPage.setMaster("qwe123");
        AngelPage.setSite("gmail.com");
        AngelPage.genarate();
        AngelPage.testPass4();
    }

    @Test
    public  void test5() {
        AngelPage.setMaster("");
        AngelPage.setSite("");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }
        AngelPage.genarate();
        AngelPage.testPass5();
    }

    @Test
    public void test6() {
        AngelPage.setMaster("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        AngelPage.setSite("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }
        AngelPage.genarate();
        AngelPage.testPass6();
    }

    @Test
    public void test7() {
        AngelPage.setMaster("");
        AngelPage.setSite("");
        AngelPage.setEnter();
        AngelPage.testPass7();
    }

    @Test
    public  void test8() {
        AngelPage.setMaster("333");
        AngelPage.setSite("111");
        AngelPage.genarate();
        AngelPage.testPass8();
    }

    @Test
    public void test9() {
        AngelPage.setMaster("111");
        AngelPage.setSite("333");
        AngelPage.genarate();
        AngelPage.testPass9();
    }

    @Test
    public void test10() {
        AngelPage.setMaster("~!@#$%^&*()_+{}|\":?></\\");
        AngelPage.setSite("~!@#$%^&*()_+{}|\":?></\\");
        AngelPage.genarate();
        AngelPage.testPass10();
    }

    @Test
    public void test11() {
        AngelPage.setMaster("qwe123");
        AngelPage.setSite("asd");
        AngelPage.genarate();
        AngelPage.testPass11();
    }

    @Test
    public void test12() {
        AngelPage.setMaster("qwe123");
        AngelPage.setSite("ASD");
        AngelPage.genarate();
        AngelPage.testPass12();
    }
    @Test
    public void test13() {
        AngelPage.setMaster("qwe1234");
        AngelPage.setSite("ASD");
        AngelPage.genarate();
        AngelPage.isMasterEnabled();

    }

    @Test
    public void test14() {
        AngelPage.setMaster("qwe1234");
        AngelPage.setSite("ASD12");
        AngelPage.genarate();
        AngelPage.testPass14();
        AngelPage.masterValue();
    }

    @Test
    public void test15() {
        AngelPage.setMaster("qwe1234");
        AngelPage.setSite("ASD123");
        AngelPage.genarate();
        TestHelper.slp(2);
        TestHelper.DieModalDie();
        AngelPage.siteFull();
    }

    @Test
    public void test16() {
        AngelPage.setMaster("QWE1234");
        AngelPage.setSite("ASD123");
        AngelPage.genarate();
        AngelPage.siteFull();
    }

    @Test
    public void test17() {
        AngelPage.setMaster("QWE1234");
        AngelPage.setSite("ASD123");
        AngelPage.genarate();
        AngelPage.isSiteEnabled();
    }

    @Test
    public void test18() {
        AngelPage.setMaster("QWE1234");
        AngelPage.setSite("ASD1234");
        AngelPage.genarate();
        AngelPage.isPassEnabled();
    }

    @Test
    public void test19() {
       AngelPage.nameMaster();
    }

    @Test
    public void test20() {
        AngelPage.nameSite();
    }

    @Test
    public void test21() {
        AngelPage.namePass();
    }

    @Test
    public void test22(){AngelPage.genarateVisible();}

    @After
    public void after() {
        TestHelper.quit();
    }


    @Before
    public void newBefore(){
        TestHelper.setup("http://oxogamestudio.com/passwd.current10.htm");
    }




}
