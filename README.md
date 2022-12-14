# <img src="https://i.ibb.co/gmGz0Qd/success.png">
# EdiControl
Bienvenido a edicontrol, somos una plataforma de gestión inmobiliaria creada por pinolabs. 

# Iniciando el Backend
Primero que nada debemos clonar nuestra api a la carpeta donde queremos trabajar.
``` bash
$ git clone https://github.com/PinoLabs/ediControl.git
$ cd edicontrol
$ mvn clean package install
$ mvn spring-boot:run
```
Una vez clonado podemos correrlo con maven, se recomienda crear el archivo application.propiertes con la conexión a la bd que debe tener una tabla que se llama edicontrol.
Para probarlo podemos ir a
https://localhost:8080/

# Seguridad del api
``` mysql
Primero lo primero!
Debemos agregar nuestro usuario y contraseña que debe estar encriptada con bcrypt. Luego los roles y por último asignamos los roles a nuestros usuarios.
# Comandos MYSQL para Security
inser into rol(`rol_id`,`rol_name`)
VALUES(1,"ROLE_ADMIN"),(2,"ROLE_USER");
INSERT INTO usuario(`username`,`enabled`,`password`)
VALUES("demo", true , "$2a$10$jolbvPCOIOCm/bHp9IvX9OAFFo1h.sR8qYuF1KlRrFRAslOA4NfjS");
INSERT INTO roles_usuario(`username`,`rol_id`)
VALUES("demo",1);
```

# Instrucciones de uso.
Para utilizar nuestra api tenemos disponibles los siguientes endpoints:

``` bash
#Uso Trabajadores
/api/trabajadores
   get -> devuelve un JSON con todas los trabajadores existentes en la BD.
   post -> recibe un JSON con un objeto trabajador, se espera un id, nombre, apellido, rut,correo,direccion,idAfp,idCaja,idSalud,numeroCargas,nombre,telefono. . Requiere de autenthication basic en su header y no-cors para la version en linea
/api/trabajadores/{idtrabajador}
  get -> Devuelve un JSON con el objeto correspondiente al id solicitado. Requiere el idTrabajador, autenthication basic en su header y no-cors para la version en linea.
  delete -> Elimina el Objeto de la BD. Requiere de autenthication basic en su header y no-cors para la version en linea.

#Uso afps
/api/afps
   get -> devuelve un JSON con todos los objetos existentes en la BD.
   post -> Recive un JSON con un objeto Producto, se espera un idAfp, descuento y nombre. Requiere de autenthication basic en su header y no-cors para la version en linea
/api/afps{idAfp}
  get -> Devuelve un JSON con el objeto correspondiente al id solicitado. Requiere el idAfp, autenthication basic en su header y no-cors para la version en linea.
  delete -> Elimina el Objeto de la BD.  Requiere el idAfp, autenthication basic en su header y no-cors para la version en linea.

#Uso cajas
/api/cajas
   get -> devuelve un JSON con todos los objetos existentes en la BD.
   post -> Recive un JSON con un objeto Producto, se espera un idCaja, descuento y nombre. Requiere de autenthication basic en su header y no-cors para la version en linea
/api/cajas{idCaja}
  get -> Devuelve un JSON con el objeto correspondiente al id solicitado. Requiere el idCaja, autenthication basic en su header y no-cors para la version en linea.
  delete -> Elimina el Objeto de la BD.  Requiere el idCaja, autenthication basic en su header y no-cors para la version en linea.

#Uso saluds
/api/saluds
   get -> devuelve un JSON con todos los objetos existentes en la BD.
   post -> Recive un JSON con un objeto Producto, se espera un idSalud, descuento y nombre. Requiere de autenthication basic en su header y no-cors para la version en linea
/api/saluds{idSalud}
  get -> Devuelve un JSON con el objeto correspondiente al id solicitado. Requiere el idSalud, autenthication basic en su header y no-cors para la version en linea.
  delete -> Elimina el Objeto de la BD.  Requiere el idSalud, autenthication basic en su header y no-cors para la version en linea.

#Uso horarios
/api/horarios
   get -> devuelve un JSON con todos los horarios existentes en la BD.
   post -> Recive un JSON con un objeto Horario, se espera un idContrato, horaSemanal, horario y sueldo. Requiere de autenthication basic en su header y no-cors para la version en linea
/api/horarios{idHorario}
  get -> Devuelve un JSON con el objeto correspondiente al id solicitado. Requiere el idHorario, autenthication basic en su header y no-cors para la version en linea.
  delete -> Elimina el Objeto de la BD.  Requiere el idHorario, autenthication basic en su header y no-cors para la version en linea.
  
#Uso Contratos
/api/contratos
   get -> devuelve un JSON con todas los contratos existentes en la BD.
   post -> Recive un JSON con un objeto Contrato, se espera un idContrato, inicioContrato, terminoContrato, idHorario y idTrabajador. Requiere de autenthication basic en su header y no-cors para la version en linea
/api/contratos{idContrato}
  get -> Devuelve un JSON con el objeto correspondiente al id solicitado. Requiere el idContrato, autenthication basic en su header y no-cors para la version en linea.
  delete -> Elimina el Objeto de la BD.  Requiere el idContrato, autenthication basic en su header y no-cors para la version en linea.

```

# WebApp
Su fronted se esta creando con una convinacion entre Thymeleft y JS Puro. 


Instrucciones de uso para la aplicacion web:
Para ingresar desde la web solo basta con arrancar la aplicacion e ingresar a http://localhost:8080/

para ingresar al admin solo debemos ir a http://localhost:8080/devs

para ingresar al crud de asistencias debemos ir a http://localhost:8080/devs/asistencia

para ingresar al crud de afp debemos ir a http://localhost:8080/devs/afp

para ingresar al crud de salud debemos ir a http://localhost:8080/devs/salud

para ingresar al crud de caja debemos ir a http://localhost:8080/devs/caja

para ingresar al crud de contratos debemos ir a http://localhost:8080/devs/contratos

para ingresar al crud de horarios debemos ir a http://localhost:8080/devs/horarios

para ingresar al crud de trabajadores debemos ir a http://localhost:8080/devs/trabajadores


# Importante
Esta app no es el codigo original por lo cual puede estar incompleta o faltarle detalles. Se actualizara para integrar nuevas funciones
