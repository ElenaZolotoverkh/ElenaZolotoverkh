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
        ChromeDriver driver = new ChromeDriver();                  //��������� ����
        driver.get("http://google.com");                           //��������� ����

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // ��������� ������� ����� ��������� �� 5 ���
        }
        System.out.println(driver.getTitle());                     //������� �����
        //d123.findElementByTagName("q");                          // ����� ������� �������� (� ������ ������ name="q" ����� ���������� � ����)
        WebElement j = driver.findElementByName("q");              //�������� � ������ "������"
        j.sendKeys("cats");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // ��������� ������� ����� ��������� �� 5 ���
        }
        j.sendKeys(Keys.ENTER);                                    //������ ������ �����/����

        driver.findElementByName("btnG").click();                  // ����� ������ ���� � ��������

        System.out.println(j.getAttribute("value"));               //������� ��������� �������� �� ����

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();                                   // ��������� ������� ����� ��������� �� 5 ���
        }
        WebElement d = driver.findElementByClassName("srg");
        List<WebElement> res = d.findElements(By.tagName("a"));   //������� � ������� � ������� ������ ������ �� �������

            System.out.println(res.get(0).getText());
        System.out.println(driver.getTitle());
        driver.navigate().back();







         driver.quit();                                             //������� �������
    }
}
