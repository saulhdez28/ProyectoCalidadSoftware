/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.calidadsoftwareproyectofinal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Saul Hernandez
 */
public class CalidadSoftwareProyectoFinal {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\SeleniumChromeDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.amazon.com/";
        driver.get(baseUrl);
    }
}
