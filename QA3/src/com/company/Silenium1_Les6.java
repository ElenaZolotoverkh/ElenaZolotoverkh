package com.company;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by admin on 04.08.15.
 */
public class Silenium1_Les6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.google.ru");//o������ ����
        Thread.sleep(5000);// ��������� 5 ���
        driver.quit();//������� �������
    }

}
