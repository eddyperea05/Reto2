package com.alkomprar.steps;

import com.alkomprar.pageObject.MiCuentaPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class MiCuentaStep {


    @Page
    MiCuentaPage miCuentaPage;

    @Step("Validar cuenta del usuario creado")
    public void validarUser(){
        Assert.assertTrue(
                miCuentaPage.getDriver().findElement(miCuentaPage.getLblCuenta()).isDisplayed()
        );
    }
}


