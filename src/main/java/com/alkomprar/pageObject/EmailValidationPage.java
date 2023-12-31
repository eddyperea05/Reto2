package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class EmailValidationPage extends PageObject {

    private By txtEmail = By.id("js-login-email");
    private By btnContinuar = By.id("js-login-continue");

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getBtnContinuar() {
        return btnContinuar;
    }
}
