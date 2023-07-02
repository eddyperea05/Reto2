package com.alkomprar.stepDefinitions;

import com.alkomprar.steps.*;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class RegistrarUsuarioStepDefinitions {


    @Steps
    HomeStep homeStep;
    @Steps
    EmailValidationStep emailValidationStep;
    @Steps
    RegistroStep registerStep;

    @Steps
    MiCuentaStep miCuentaStep;

    @Dado("que se abre el url de pagina, pulsa el boton mi cuenta")
    public void irAlRegistro() {
        homeStep.abrirNavegador();
        homeStep.darClickUser();
    }

    @Cuando("ingresa el correo para validar, ingresa la información del usuario, dar click en registo")
    public void gestionarRegistro() {
        emailValidationStep.escribirCorreo();
        emailValidationStep.clickValidar();
        registerStep.llenarFormulario();
    }

    @Entonces("verá el panel del control de usuario")
    public void validarIngresoUsuario() {
        miCuentaStep.validarUser();
    }

}
