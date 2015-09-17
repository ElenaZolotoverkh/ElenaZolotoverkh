package com.company;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Admin on 17.09.15.
 */
public class AWAD_Test {
     @Test
    public void test1(){
         AWAD_Page.setLanguage();
         AWAD_Page.setEnglish();
         TestHelper.driver.quit();
    }

    @Before
    public void newBefore(){
        TestHelper.setup("https://www.anywayanyday.com/");
    }


}
