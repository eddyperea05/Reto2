package com.alkomprar.steps;

import com.alkomprar.pageObject.RegistroPage;
import com.alkomprar.utils.*;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import java.io.IOException;
import java.util.*;

public class RegistroStep {

    @Page
    RegistroPage registroPage;

    @Step("Llenar el formulario con los datos del usuario")
    public void llenarFormulario(){

        ArrayList<Map<String, String>> user;
        try {
            user = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Datos.xlsx", "datos");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Utils.llenarTxt(registroPage,registroPage.getTxtNombre(),user.get(0).get("Nombre"));
        Utils.llenarTxt(registroPage,registroPage.getTxtApellido(),user.get(0).get("Apellido"));
        Utils.llenarTxt(registroPage,registroPage.getTxtNumero(),user.get(0).get("Numero"));

        Utils.click(registroPage,registroPage.getChkAutorizar());
        Utils.click(registroPage,registroPage.getBtnRegistrar());

    }



}
