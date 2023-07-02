package com.alkomprar.utils;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class EsperaExplicita {
    public static void esperaExplicitaClick(WebDriver driver, By elemento) {
        WebDriverWait myWaitVar = new WebDriverWait(driver, Duration.ofSeconds(60));
        myWaitVar.until(ExpectedConditions.elementToBeClickable(elemento));
    }

    public static void esperaExplicitaTexto(WebDriver driver, By elemento) {
        WebDriverWait myWaitVar = new WebDriverWait(driver, Duration.ofSeconds(30));
        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }

    public static void esperarCargaPagina(WebDriver driver) {
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
    }
}
