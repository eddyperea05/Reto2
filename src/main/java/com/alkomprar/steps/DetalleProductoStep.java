package com.alkomprar.steps;

import com.alkomprar.pageObject.DetalleProductoPage;
import com.alkomprar.utils.EsperaExplicita;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class DetalleProductoStep {

    @Page
    DetalleProductoPage detalleProductoPage;

@Step("Agregar Producto al carrito")
    public void agregarProducto(){
        JavascriptExecutor JsExec = (JavascriptExecutor) detalleProductoPage.getDriver();
        JsExec.executeScript("arguments[0].click();",detalleProductoPage.getDriver().findElement(detalleProductoPage.getBtnAgregar()));
    }

    @Step("Validar producto en el carrito")
    public void validarMensaje() {
        String msm = detalleProductoPage.getDriver().findElement(detalleProductoPage.getLblMensajeExitoso()).getText();
        EsperaExplicita.esperaExplicitaTexto(detalleProductoPage.getDriver(),detalleProductoPage.getLblMensajeExitoso());
        Assert.assertEquals(
                detalleProductoPage.getDriver().findElement(detalleProductoPage.getLblMensajeExitoso()).isDisplayed(), true
        );
    }


}
