package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegistroPage extends PageObject {

    By txtNombre = By.id("register.firstName");
    By txtApellido = By.id("register.lastName");
    By txtNumero = By.id("register.mobileNumber");
    By chkAutorizar = By.xpath("//*[@id='alkostoRegisterForm']/div/label[@for='registerChkTermsConditions']");
    By btnRegistrar = By.xpath("//*[@id='alkostoRegisterForm']/div/button");

    public By getTxtNombre() {
        return txtNombre;
    }
    public By getTxtApellido() {
        return txtApellido;
    }
    public By getTxtNumero() {
        return txtNumero;
    }
    public By getChkAutorizar() {
        return chkAutorizar;
    }
    public By getBtnRegistrar() {
        return btnRegistrar;
    }
}
