package com.alkomprar.stepDefinitions;

import com.alkomprar.steps.DetalleProductoStep;
import com.alkomprar.steps.HomeStep;
import com.alkomprar.steps.ListaProductosStep;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class AgregarProductoStepDefinitions {

    @Steps
    HomeStep homeStep;

    @Steps
    ListaProductosStep productListStep;

    @Steps
    DetalleProductoStep detalleProductoStep;


    @Dado("que se abre el url de pagina.")
    public void abriNavegador() {
        homeStep.abrirNavegador();
    }

    @Cuando("ingresa el nombre del producto, selecciona uno aleatorio y agregarlo al carrito.")
    public void gestionarSeleccionProducto() {
        homeStep.escribirProducto();
        productListStep.seleccionarProducto();
        detalleProductoStep.agregarProducto();
    }

    @Entonces("Validar que el producto se haya agregado al carrito.")
    public void validarProductoAgregado() {
        detalleProductoStep.validarMensaje();
    }

}
