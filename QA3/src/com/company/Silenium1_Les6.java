package com.company;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by admin on 04.08.15.
 */
public class Silenium1_Les6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.google.com.ua");//open site

        System.out.println(driver.getTitle()); //take title
        driver.findElementByName("q");
        WebElement j = driver.findElementByName("q");
        j.sendKeys("cats");
        j.sendKeys(Keys.ENTER);
        driver.findElementByName("btnG").click();
        /* vait 5 second */
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();//закрыть браузер

    }

}

