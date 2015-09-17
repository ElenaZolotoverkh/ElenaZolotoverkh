package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Elena.Zolotoverkh on 20.08.2015.
 */
public class Driver2_HW {
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();                  //открываем хром
        driver.get("https://stage.tether.to");                           //открываем сайт

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }

        WebElement login = driver.findElementByXPath("//*[@id='login']");              //заполнить третье поле
        login.sendKeys("");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }

        WebElement pass = driver.findElementByXPath("//*[@id='password']");              //заполнить третье поле
        pass.sendKeys("");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }

        WebElement errorLogin = driver.findElementByXPath("//*[@class='ng-scope ng-active']//*[@class='ng-scope']"); //Вывести в консоль ошибку под полем
        System.out.println(errorLogin.getText());
        System.out.println(errorLogin.getSize());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }

        WebElement tab = driver.findElementByXPath("//*[@id='password']");
        tab.sendKeys(Keys.TAB);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }

        WebElement errorPass = driver.findElementByXPath("//md-input-container[2]/div"); //Вывести в консоль ошибку под полем
        System.out.println(errorPass.getText());
        System.out.println(tab.getSize());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }

        WebElement size5 = driver.findElementByXPath("//md-input-container[2]/div"); //Вывести в консоль ошибку под полем
        System.out.println(size5.getSize());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }

        WebElement passAsd = driver.findElementByXPath("//*[@id='password']");              //заполнить третье поле
        passAsd.sendKeys("asd");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }



        WebElement errorPass1 = driver.findElementByXPath("//md-input-container[2]/div"); //Вывести в консоль ошибку под полем
        System.out.println(errorPass1.getText());
        System.out.println(errorPass1.getSize());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }

        WebElement passfff = driver.findElementByXPath("//*[@id='password']");              //заполнить третье поле
        passfff.sendKeys("fff");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }

        WebElement loginA = driver.findElementByXPath("//*[@id='login']");              //заполнить третье поле
        loginA.sendKeys("a");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }

        WebElement errorLoginA = driver.findElementByXPath("//md-input-container[2]/div"); //Вывести в консоль ошибку под полем
        System.out.println(errorLoginA.getText());
        System.out.println(errorLoginA.getSize());


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }

        WebElement loginqwe = driver.findElementByXPath("//*[@id='login']");              //заполнить третье поле
        loginqwe.sendKeys("qwe");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }

        driver.findElement(By.xpath("//*[@class='submit-btn md-raised md-primary md-button md-default-theme']")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // задержать браузер перед закрытием на 5 сек
        }

        driver.quit();

    }
}
