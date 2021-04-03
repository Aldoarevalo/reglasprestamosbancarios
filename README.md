# reglasprestamosbancarios
Esta api realiza un request desde un repositorio en donde se aloja el archivo json para la prueba de la api, en este tutorial se describen los detalles del proyecto creado con maven y spring boot utilizando el lenguaje de programación java, ademas cuenta con las pruebas de la api con el programa postman en donde tambien, creamos la documentación, las ejecuciónes de pruebas Backend lo realizamos swagger en donde se detalla y se puede visualizar los datos sustradidos desde nuestro repositorio, ademas cuenta con los links de pruebas en postman, este link deberia funcionar tan solo importandolo desde postman y luego ejecutar los request,
lo primero que debemos hacer para poder ejecutar este proyecto es descargarlo como zip, luego de descargarlo descomprimir el proyecto y despues hay que abrirlo con un editor y luego descargar las dependencias ya que es un proyecto de java con maven y spring boot, lo primero que nuestro proyecto hara sera autenticarse directamente a continuación se muestra una imagen de ejemplo.

![image](https://user-images.githubusercontent.com/57592844/113493128-beb7cd80-94aa-11eb-97b9-180b8385449d.png)

una vez que el proyecto haya descargado las dependencias desde el repositorio de maven hay que proceder a la ejecución desde netbeans seria spring boot run, en visual studio y otros varia puede ser maven run o maven build, bueno mi editor es netbeans y a continuación se muestra en la imagen la forma de ejecución en este editor.

![image](https://user-images.githubusercontent.com/57592844/113493162-1c4c1a00-94ab-11eb-98fb-06ca2be455b7.png)

Una vez que la ejecución haya comenzado el proyecto realizará un logueo al archivo json de prueba de la api de prestamos bancarios.

![image](https://user-images.githubusercontent.com/57592844/113494257-b2d10900-94b4-11eb-90b6-c641d55c0a3a.png)

una vez que haya terminado la ejecución debemos abrir el navegador y escribir el siguiente link. http://localhost:8080/swagger-ui.html#/

con este link se abrirá nuestra api con sus respectivas rutas, a continuación se muestra en la imagen.

![image](https://user-images.githubusercontent.com/57592844/113493235-8fee2700-94ab-11eb-92b1-9d1e4376df42.png)

Ahora procedemos a ejecutar la primera api debemos introducir por ejemplo el numero de padron 12800 para ver los aportes de los jubilados

http://localhost:8080/api/Solicitud de Prestamos/aportes?Padron=12800

![image](https://user-images.githubusercontent.com/57592844/113493272-e9565600-94ab-11eb-83e9-72ced4ea10d2.png)

Link de jecución desde Postman,

https://www.getpostman.com/collections/7d7d1e5c3a4b0ba95aa5

![image](https://user-images.githubusercontent.com/57592844/113493831-06415800-94b1-11eb-937f-6733440c7d30.png)

Ahora procedemos a ejecutar la segunda api que realiza un calculo matematico y saca un monto de las cuotas a pagar.

http://localhost:8080/api/Solicitud de Prestamos/calculo-planilla-cuota?mont=5000000&plazo=12&tasa=5

![image](https://user-images.githubusercontent.com/57592844/113493951-13127b80-94b2-11eb-8d73-19a6a19ae250.png)

Link de jecución desde Postman,
https://www.getpostman.com/collections/264de2b1e0bfdcdd00a4

![image](https://user-images.githubusercontent.com/57592844/113493840-1eb17280-94b1-11eb-8e5a-27ba03f776e5.png)


Ahora procedemos a ejecutar la tercera api esta api retornara los datos basicos de los clientes.

http://localhost:8080/api/Solicitud de Prestamos/DatosBasicos?Cedula=3524244&Padron=12800

![image](https://user-images.githubusercontent.com/57592844/113493958-27ef0f00-94b2-11eb-84e6-80837a60532b.png)

Link de jecución desde Postman,
https://www.getpostman.com/collections/ce4bb69b326f9a441263

![image](https://user-images.githubusercontent.com/57592844/113493850-430d4f00-94b1-11eb-8171-1f876440d79f.png)


La cuarta y ultima api se encarga de verificar los datos de los codeudores introduciendo los siguientes datos podremos visualizarlo.

http://localhost:8080/api/Solicitud de Prestamos/DatosCodeudores?Cedula=3524244

![image](https://user-images.githubusercontent.com/57592844/113493979-3fc69300-94b2-11eb-96e6-69a328c34d1d.png)

Link de jecución desde Postman,
https://www.getpostman.com/collections/896c154cdffd18acb07b

![image](https://user-images.githubusercontent.com/57592844/113493861-53252e80-94b1-11eb-80ca-91ed50b12efa.png)


link del archivo json desde donde ejecutamos la prueba https://my-json-server.typicode.com/Aldoarevalo/repoaldo








