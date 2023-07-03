package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ListaProductosPage extends PageObject {
    private By btnProducto = By.xpath("//form[@class='add_to_cart_form']/button");
    private By lblMensajeExitoso = By.xpath("//div[contains(@class,'sucess-message-alkomprar')]");
    public By getBtnProducto() {
        return btnProducto;
    }
    public By getLblMensajeExitoso() {
        return lblMensajeExitoso;
    }
}
