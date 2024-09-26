Readme

Prueba de Carga y estres en Herokuapp con Locust y Python:
1. Para montar el proyecto de Carga y estres de Herokuapp en Locust se requiere un entorno de desarrollo habilitado con 
locust y phyton instalados.
2. Para correr el proyecto se requiere ejecuar el siguiente comando en la terminal del IDE: 
locust -f locust_test.py --users 200 --spawn-rate 10 --host https://the-internet.herokuapp.com
3. Abrir el navegador e ingresar la URL http://localhost:8089/ y dar clic en Start para que inicie.

Prueba automatizada con Selenium y Cucumber:
1. Para montar el proyecto de Prueba automatizada de Herokuapp con selenium web-driver y cucumber con JAVA 
se requiere un entorno de desarrollo habilitado con JAVA y sus variables de entorno configuradas, Selenium webdriver, Cucumber y Maven repository. Se utilizo el IDE IntelliJ IDEA 2023 Community Edition.
2. Para configurar el proyecto:
   a. En la carpeta del ProyectoBase-Herokuapp/Drivers incluye el archivo webdriver version 129 compatible con la versión 129 del 
      navegador google chrome. Actualizar si es necesario y remplazar el archivo en la carpeta indicada.
   b. En el archivo UploadFile.feature en la linea 8 'When el usuario sube el archivo "D:\Metasploit Framework - hack android.txt"' 
      reemplazar la dirección de la ubicación y el nombre del archivo que se va a subir a la prueba.
   c. Para ejecutar el proyecto y correr la prueba se requiere estar posicionado sobre el archivo RunnersFeature.java y dar clic en Run.


