package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class MiCuentaPage extends PageObject {
    private By lblCuenta = By.xpath("//div[contains(@class,'module-title')]");
    public By getLblCuenta() {
        return lblCuenta;
    }
}
