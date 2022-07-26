/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.calidadsoftwareproyectofinal;

import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Saul Hernandez
 */
public class CalidadSoftwareProyectoFinal {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\SeleniumChromeDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String siteURL = "https://www.amazon.com/";
        driver.get(siteURL);
        driver.manage().window().maximize();
        
        //testSearchBox(driver);
        //testCambioIdioma(driver);
        //testCarritoCompras(driver);
        //testCambioPais(driver);
        testInformacionPage(driver);

    }

    static void testSearchBox(WebDriver driver) {
        WebElement searchbox = driver.findElement(By.name("field-keywords"));
        searchbox.clear();
        searchbox.sendKeys("Alexa echo");
        searchbox.submit();
    }

    static void testCambioIdioma(WebDriver driver) {
        driver.findElement(By.className("icp-nav-link-inner")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\'icp-language-settings\']/div[3]/div/label/i")).click();
        driver.findElement(By.className("a-button-input")).click();
    }

    static void testCambioPais(WebDriver driver) throws InterruptedException {

        WebElement getmenu = driver.findElement(By.className("icp-nav-link-inner")); //xpath the parent

        Actions act = new Actions(driver);
        act.moveToElement(getmenu).perform();

        Thread.sleep(2000);
        WebElement clickElement = driver.findElement(By.xpath("//*[@id='icp-flyout-mkt-change']/span/div"));//xpath the child
        act.moveToElement(clickElement).click().perform();

        driver.findElement(By.className("a-dropdown-prompt")).click();
        driver.findElement(By.id("icp-dropdown-item-1")).click();
        Thread.sleep(2000);

        driver.findElement(By.className("a-button-input")).click();

    }

    static void testInformacionPage(WebDriver driver) {
        driver.findElement(By.xpath("//*[@id=\'navFooter\']/div[1]/div/div[1]/ul/li[3]/a")).click();
    }

}
