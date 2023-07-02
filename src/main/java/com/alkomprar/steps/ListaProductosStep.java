package com.alkomprar.steps;

import com.alkomprar.pageObject.ListaProductosPage;
import com.alkomprar.utils.RandomNum;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;


public class ListaProductosStep {

    @Page
    ListaProductosPage productListPage;

    @Step("Seleccionar producto")
    public void seleccionarProducto() {
        final int n = RandomNum
                .numeroAleatorioEnRango(0, productListPage.getDriver().findElements(productListPage.getBtnProducto()).size());
        productListPage
                .openUrl(productListPage.getDriver().findElements(productListPage.getBtnProducto()).get(n).getAttribute("href"));
    }


}
