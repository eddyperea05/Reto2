package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegistroPage extends PageObject {

    private By txtNombre = By.id("register.firstName");
    private By txtApellido = By.id("register.lastName");
    private By txtNumero = By.id("register.mobileNumber");
    private By chkAutorizar = By.xpath("//*[@id='alkostoRegisterForm']/div/label[@for='registerChkTermsConditions']");
    private By btnRegistrar = By.xpath("//*[@id='alkostoRegisterForm']/div/button");

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
