package com.alkomprar.steps;

import com.alkomprar.pageObject.EmailValidationPage;
import com.alkomprar.utils.*;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import java.io.IOException;
import java.util.*;

public class EmailValidationStep {

    @Page
    EmailValidationPage emailValidationPage;

    
    @Step("Escribir correo")
    public void escribirCorreo(){
        ArrayList<Map<String, String>> correo;
        try {
            correo = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Datos.xlsx", "datos");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Utils.llenarTxt(emailValidationPage,emailValidationPage.getTxtEmail(),correo.get(0).get("Correo"));
    }

    @Step("Validar correo")
    public void clickValidar(){
        Utils.click(emailValidationPage,emailValidationPage.getBtnContinuar());
    }


}
