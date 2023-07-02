package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ListaProductosPage extends PageObject {
    By btnProducto = By.xpath("//h3[@class='product__item__top__title']/a");

    //By btnProdcuto = By.xpath("//form[@class='add_to_cart_form']/button");
    //By btnProducto = By.xpath("//form[contains(@class,'add_to_cart_form')]");
    //By btnProdcuto = By.xpath("//form[contains(@class,'add_to_cart_form')]");
    //By btnProdcuto = By.xpath("//li[contains(@class,'js-algolia-product-click')]");

    By lblMensajeExitoso = By.xpath("//div[contains(@class,'sucess-message-alkomprar')]");
    public By getBtnProducto() {
        return btnProducto;
    }
    public By getLblMensajeExitoso() {
        return lblMensajeExitoso;
    }
}
