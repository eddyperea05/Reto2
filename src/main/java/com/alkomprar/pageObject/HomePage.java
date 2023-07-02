package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    By btnUser = By.xpath("//li[@id='js-myaccount-header']/a");
    By txtSearch = By.id("js-site-search-input");

    public By getBtnUser() {
        return btnUser;
    }

    public By getTxtSearch() {
        return txtSearch;
    }
}
