# Laboratorio 7
Primero se configura un rol al cual se le asuignaran permisos de seguridad.
![Servicio IAM](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/1.png)
Se crea un rol para el servicio lambda de AWS
![Seleccion del rol](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/2.png)
Se le dan a ese rol todos los permisos sobre instancias de AWS Lambda
![Asignacion de permisos](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/3.png)
Se selecciona el nombre del rol y si se desea una descripcion.
![Nombre del rol IAM](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/4.png)
Al finalizar se deberia ver el nuevo rol en la lista de roles existentes.
![Servicio IAM](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/5.png)
Luego de crear el rol se debe crear una funcion lambda que es basicamente una funcion de codigo serverless
 ![Servicio Lambda](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/6.png)Se configuran el nombre y el lenguaje, tambien se asigna el rol que acabamos de crear.
 ![Configuracion Lambda](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/7.png)
 Se sube el archivo jar en el cual se encuentra la funcion y se configura la ruta en la cual esta se encontrara.
 ![Configuraciones de la funcion](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/8.png)
 Posterior a esto se va a probar el correcto funcionamiento de la funcion con un caso de prueba.
 ![Caso de prueba](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/9.png)
 Una prueba exitosa debe verse de la siguiente manera.
 ![Prueba exitosa](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/10.png)
 Luego de crear la funcion se va a usar el servicio API Gateway para crear un servicio rest.
 ![Servicio API Gateway](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/11.png)Se configura el nombre de la API y se escoge crear una nueva.
 ![Creacion de una nueva API](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/12.png)
 Se crea un metodo get para la API y se le asigna como funcion la funcion lambda previamente creada.
 ![Asignaicon de la funcion lambda](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/13.png)
 En la seccion Method Request se crea un nuevo parametro llamado value.
 ![Parametro value](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/14.png)
 En la seccion Integration Request se asigna el parametro value antes creado a un parametro de consulta.
 ![Asignacion del parametro value](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/15.png)Se configura el tipo de dato que se recibira por parametro en la consulta, asi como la forma de leerlo.
 ![Configuracion del tipo de dato del parametro](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/16.png)
 Se despliega el servicio rest  p!ara que este sea publico en linea
 ![Despliegue del API](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/18.png)
 Se ajustan algunos parametros de ser necesario y se obtiene el enlace al servicio.
 ![Publicacion del servicio](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/19.png)
 En el enlace publicado se prueba la API con un parametro.
 ![Prueba de la API](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/20.png)
 Por ultimo se genera una instancia EC2 en la cual se desplegara una aplicacion web que usa spark. En las configuraciones de esta se deben ajustar las inbound rules para abrir el puerto 4567.
 ![Creacion de la instancia EC2](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/21.png)La instancia corriendo se ve de la siguiente forma.
 ![Instancia EC2 corriendo](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/22.png)
 Luego de esto se accede de forma remota a la maquina virtual usando el servicio ssh.
 ![Acceso con SSH](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/23.png)
 Se instala la version 1.8 de java para que la aplicacion de spark pueda ejecutar.
 ![Instalacion de java 1.8](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/24.png)
 Se sube a la maquina el ejecutable .jar que contiene las dependencias, esto por medio del servicio sftp.
 ![Servicio SFTP para subir el ejecutable a la instancia de EC2](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/25.png)
 Despues de esto se ejecuta el archivo jar para iniciar la aplicacion spark.
 ![Inicio de la aplicacion spark](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/26.png)
 Se accede a la maquina desde el browser por medio del puerto 4567 y se puede ver el formulario creado para la aplicacion.
 ![Aplicacion desplegada](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/27.png)
 Se ingresa un numero en el formulario para probar la aplicacion.
 ![Prueba ingresando el numero 5](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/28.png)
 ![Resultado de la prueba con el numero 5](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/29.png)![Prueba ingresando el numero -6](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/30.png)
![Resultado de la prueba con el numero -6](https://raw.githubusercontent.com/Alejoguzm07/AREP7/master/images/31.png)
