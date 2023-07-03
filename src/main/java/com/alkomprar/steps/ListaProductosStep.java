package com.alkomprar.steps;

import com.alkomprar.pageObject.ListaProductosPage;
import com.alkomprar.utils.*;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class ListaProductosStep {

    @Page
    ListaProductosPage productListPage;

    @Step("Seleccionar producto")
    public void agregarProducto() {
        final int n = RandomNum
                .numeroAleatorioEnRango(0, productListPage.getDriver().findElements(productListPage.getBtnProducto()).size());
        productListPage.getDriver().findElements(productListPage.getBtnProducto()).get(n).submit();
    }

    @Step("Validar producto en el carrito")
    public void validarMensaje() {
        EsperaExplicita.esperaExplicitaTexto(productListPage.getDriver(), productListPage.getLblMensajeExitoso());
        Assert.assertTrue(
                productListPage.getDriver().findElement(productListPage.getLblMensajeExitoso()).isDisplayed()
        );
    }


}
