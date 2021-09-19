Feature: Iniciar Sesion
  como Usuario de automationpractice
  Quiero iniciar sesio para completar
  una compra

  @InicarSesionExitso
    Scenario Outline: El usuario inicia sesion
      Given Usuario tiene una cuenta válida
      When  Da clic en Sing Ing
      And   ingresa  correo y  contraseña
            |<Email>|<Password>|
      Then  El usuario inica sesio correctamente en My account
    Examples:
    |Email               |Password  |
    |henocQA2@example.com|sergio1234|

