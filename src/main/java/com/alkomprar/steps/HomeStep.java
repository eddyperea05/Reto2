package com.alkomprar.steps;

import com.alkomprar.pageObject.HomePage;
import com.alkomprar.utils.Excel;
import com.alkomprar.utils.Utils;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import java.io.IOException;
import java.util.*;


public class HomeStep {

    @Page
    HomePage homePage;
    ArrayList<Map<String, String>> data;


    @Step("Abrir el navegador")
    public void abrirNavegador()  {
        try {
            data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Datos.xlsx", "datos");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        homePage.openUrl(data.get(0).get("URL"));
    }

    @Step("Dar click al boton 'mi cuenta'")
    public void darClickUser(){
        Utils.click(homePage,homePage.getBtnUser());
    }

    @Step("Llenar txtField con el nombre del producto")
    public void escribirProducto(){
        Utils.llenarTxt(homePage,homePage.getTxtSearch(),data.get(0).get("Producto"));
        homePage.getDriver().findElement(homePage.getTxtSearch()).submit();
    }
}
