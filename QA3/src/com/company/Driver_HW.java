package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Elena.Zolotoverkh on 17.08.2015.
 */
public class Driver_HW {
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();                  //открываем хром
        driver.get("https://stage.tether.to");                           //открываем сайт

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }

        System.out.println(driver.getTitle());                      //вывести в консоль заголовок сайта

        driver.findElement(By.xpath("//body//div//a[@href='#!/invite']")).click();    // кликнуть на ссылку Request access

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }
        WebElement y = driver.findElementByXPath("//body//div//label"); //Вывести в консоль заголовок поля Email address
        System.out.println(y.getText());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }

        driver.findElement(By.xpath("//body//div//a[@href='#!/signup']")).click();      //нажать на ссылку Already have an invite code?

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }


        List<WebElement> d = driver.findElementsByXPath("//md-input-container/label");  //напечатать в консоль заголовки всех полей, кроме выбора страны
        for(int i = 0; i<d.size(); i++) {
            System.out.println(d.get(i).getText());
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }



        WebElement print1 = driver.findElementByXPath("//*[@name='inviteCode']");              //заполнить первое поле
        print1.sendKeys("Test1");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }

        WebElement print2 = driver.findElementByXPath("//*[@name='firstname']");              //заполнить второе поле
        print2.sendKeys("Test2");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }


        WebElement print3 = driver.findElementByXPath("//*[@name='lastname']");              //заполнить третье поле
        print3.sendKeys("Test3");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }

        WebElement error = driver.findElementByXPath("//md-input-container[1]//*[@class='ng-scope']"); //Вывести в консоль ошибку под полем
        System.out.println(error.getText());



        driver.quit();
}
}
