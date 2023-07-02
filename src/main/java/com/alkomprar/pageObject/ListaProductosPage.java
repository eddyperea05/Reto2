package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ListaProductosPage extends PageObject {
    By btnProducto = By.xpath("//h3[@class='product__item__top__title']/a");

    By lblMensajeExitoso = By.xpath("//div[contains(@class,'sucess-message-alkomprar')]");
    public By getBtnProducto() {
        return btnProducto;
    }
    public By getLblMensajeExitoso() {
        return lblMensajeExitoso;
    }
}
