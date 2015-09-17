package com.company;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Admin on 08.09.15.
 */
public class TestHelper {
    public static ChromeDriver driver;

    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public static void get(String url) {
        driver.get(url);
    }
    public static void setup(String abs) {
        setup();
        get(abs);
    }

    public static void DieModalDie() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public static void slp(long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void quit(){
        driver.quit();

    }




}