package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by admin on 11.08.15.
 */
public class Driver {
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();                  //открываем хром
        driver.get("http://google.com");                           //открываем сайт

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }
        System.out.println(driver.getTitle());                     //вывести тайтл
        //d123.findElementByTagName("q");                          // найти элемент страницы (в данном случае name="q" можно посмотреть в коде)
        WebElement j = driver.findElementByName("q");              //написать в поиске "котята"
        j.sendKeys("cats");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }
        j.sendKeys(Keys.ENTER);                                    //нажать кнопку поиск/ввод

        driver.findElementByName("btnG").click();                  // найти кнопку ввод и кликнуть

        System.out.println(j.getAttribute("value"));               //достать текстовое значение из поля

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }
        WebElement d = driver.findElementByClassName("srg");
        List<WebElement> res = d.findElements(By.tagName("a"));   //достать и вывести в консоль первую ссылку по запросу

        System.out.println(res.get(0).getText());
        System.out.println(driver.getTitle());
        driver.navigate().back();







        driver.quit();                                             //закрыть браузер
    }
}
