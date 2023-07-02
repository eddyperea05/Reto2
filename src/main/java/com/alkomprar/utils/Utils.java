package com.alkomprar.utils;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class Utils {

    public static void click(PageObject pageObject, By by){
        pageObject.getDriver().findElement(by).click();
    }

    public static void llenarTxt(PageObject pageObject, By by,String str){
        pageObject.getDriver().findElement(by).sendKeys(str);
    }

}
