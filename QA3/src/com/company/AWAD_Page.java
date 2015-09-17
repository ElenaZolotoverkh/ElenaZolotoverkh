package com.company;

/**
 * Created by Admin on 17.09.15.

 */
public class AWAD_Page {
    public static String url = "https://www.anywayanyday.com/";
    public static void setLanguage(){
        TestHelper.driver.findElementByXPath("//li[1]//span[@class='b-menu-item-button j-drop_down_list_link'][1]").click();
    }
    public static void setEnglish(){
        TestHelper.driver.findElementByXPath("//span[text()='English']").click();

    }

}
