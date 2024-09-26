# Proyecto de Prueba automatizada HerokuApp
# Miguel Pedraza Lozano

Feature: Yo como usuario quiero validar login en HerokuApp

  Scenario Outline: Login exitoso
    Given abrir el navegador para login
    When el usuario diligencia el campo username <userName> password <password>
    Then el usuario hace clic en el botón de login
    Then el usuario ve el mensaje de login exitoso "You logged into a secure area!"

    Examples:
      | userName | password |
      | tomsmith | SuperSecretPassword! |

  Scenario Outline: Login no exitoso
    Given abrir el navegador para login
    When el usuario diligencia el campo username <userName> password <password>
    Then el usuario hace clic en el botón de login
    Then el usuario ve el mensaje de error "Your username is invalid!"

    Examples:
      | userName | password    |
      | wronguser | wrongpass  |
