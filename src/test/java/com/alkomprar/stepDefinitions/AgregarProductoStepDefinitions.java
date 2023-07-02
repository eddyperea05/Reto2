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
    public void queSeAbreElUrlDePagina() {
        homeStep.abrirNavegador();
    }

    @Cuando("ingresa el nombre del producto y selecciona uno aleatorio")
    public void ingresaElNombreDelProductoYSeleccionaUnoAleatorio() {
        homeStep.escribirProducto();
        productListStep.seleccionarProducto();
        detalleProductoStep.agregarProducto();

    }

    @Entonces("validar que se haya agregado al carrito")
    public void validarQueSeHayaAgregadoAlCarrito() {

        detalleProductoStep.validarMensaje();
    }

}
