#language: es
Característica: Agregar producto


  @ProductoExitoso
  Escenario: Agregar producto exitosamente

    Dado que se abre el url de pagina.
    Cuando ingresa el nombre del producto, selecciona uno aleatorio y agregarlo al carrito.
    Entonces Validar que el producto se haya agregado al carrito.