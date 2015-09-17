package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Elena.Zolotoverkh on 14.08.2015.
 */
public class Driver1 {
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();                  //открываем хром
        driver.get("http://angel.net/~nic/passwd.current.html");                           //открываем сайт

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }
        System.out.println(driver.getTitle());                      //вывести в консоль заголовок сайта

        WebElement j = driver.findElementByXPath("//body//td//input[@name='master']");              //написать в  "myPass"
        j.sendKeys("myPass");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }

        WebElement o = driver.findElementByXPath("//body//td//input[@name='site']");              //написать в  "mySite"
        o.sendKeys("mySite");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }


        driver.findElement(By.xpath("//body//td//input[@value='Generate']")).click();  // кликнуть на кнопку Generate

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }

        WebElement w = driver.findElementByXPath("//body//td//input[@name='password']"); //Вывести в консоль значение с поля Generate password
        System.out.println(w.getAttribute("value"));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }
        driver.findElement(By.xpath("//body//div//a[@href='#!/signup']")).click();



        driver.quit();
    }

}
