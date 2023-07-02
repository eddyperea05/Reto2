package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetalleProductoPage extends PageObject {

    //By btnAgregar = By.xpath("//button[contains(@class,'js-simulate-click-add')]");
    By btnAgregar = By.id("addToCartButton");

    public By getBtnAgregar() {
        return btnAgregar;
    }

    By lblMensajeExitoso = By.xpath("//div[contains(@class,'sucess-message-alkomprar')]");


    public By getLblMensajeExitoso() {
        return lblMensajeExitoso;
    }
}
