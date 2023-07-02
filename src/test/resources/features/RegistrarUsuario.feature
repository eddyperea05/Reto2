#language: es
  Característica: Registro usuario

    @RegistroExitoso
    Escenario: El usuario se registra exitosamente

      Dado que se abre el url de pagina, pulsa el boton mi cuenta
      Cuando ingresa el correo para validar, ingresa la información del usuario, dar click en registo
      Entonces verá el panel del control de usuario
