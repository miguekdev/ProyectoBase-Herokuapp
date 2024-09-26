# Proyecto de Prueba automatizada HerokuApp
# Miguel Pedraza Lozano

Feature: Yo como usuario quiero validar la carga de archivos en HerokuApp

  Scenario: Subir un archivo
    Given abrir el navegador para carga de archivos
    When el usuario sube el archivo "D:\Metasploit Framework - hack android.txt"
    Then el usuario ve el mensaje de confirmación de carga