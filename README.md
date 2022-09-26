# <img src="https://i.ibb.co/gmGz0Qd/success.png">
# EdiControl

Somos una plataforma de administracion de Edificios
Created By Cristian Pino.

# Manual de uso para la api de ediControl! =D 
```sql
Primero lo primero!
# Comandos MYSQL para Security
inser into rol(`rol_id`,`rol_name`)
VALUES(1,"ROLE_ADMIN"),(2,"ROLE_USER");
INSERT INTO usuario(`username`,`enabled`,`password`)
VALUES("demo", true , "$2a$10$jolbvPCOIOCm/bHp9IvX9OAFFo1h.sR8qYuF1KlRrFRAslOA4NfjS");
INSERT INTO roles_usuario(`username`,`rol_id`)
VALUES("demo",1);
```

Ahora Agregaremos los datos de prueba para el uso de ediControl :

```sql
  proximamente disponible
```

## Iniciando el backend
  se puede probar en https://localhost:8080/
```bash
$ git clone https://github.com/PinoLabs/ediControl.git
$ mvn clean package install
$ mvn spring-boot:run
```
# Uso de la APi
  ```bash
  #Uso Trabajadores
 /api/trabajadores
     GET -> devuelve un JSON con todas los trabajadores existentes en la BD.
     POST -> recibe un JSON con un objeto trabajador, se espera un id, nombre, apellido, rut,correo,direccion,idAfp,idCaja,idSalud,numeroCargas,nombre,telefono. . Requiere de autenthication basic en su header y no-cors para la version en linea
 /api/trabajadores/{idtrabajador}
    GET -> Devuelve un JSON con el objeto correspondiente al id solicitado. Requiere el idTrabajador, autenthication basic en su header y no-cors para la version en linea.
    DELETE -> Elimina el Objeto de la BD. Requiere de autenthication basic en su header y no-cors para la version en linea.
  
  #Uso ops = afps,cajas,saluds
 /api/op
     GET -> devuelve un JSON con todos los objetos existentes en la BD.
     POST -> Recive un JSON con un objeto Producto, se espera un idOp, descuento y nombre. Requiere de autenthication basic en su header y no-cors para la version en linea
 /api/op{idOp}
    GET -> Devuelve un JSON con el objeto correspondiente al id solicitado. Requiere el idOp, autenthication basic en su header y no-cors para la version en linea.
    DELETE -> Elimina el Objeto de la BD.  Requiere el idOp, autenthication basic en su header y no-cors para la version en linea.
  
  #Uso horarios
  /api/horarios
     GET -> devuelve un JSON con todos los horarios existentes en la BD.
     POST -> Recive un JSON con un objeto Horario, se espera un idContrato, horaSemanal, horario y sueldo. Requiere de autenthication basic en su header y no-cors para la version en linea
 /api/horarios{idHorario}
    GET -> Devuelve un JSON con el objeto correspondiente al id solicitado. Requiere el idHorario, autenthication basic en su header y no-cors para la version en linea.
    DELETE -> Elimina el Objeto de la BD.  Requiere el idHorario, autenthication basic en su header y no-cors para la version en linea.
    
  #Uso Contratos
  /api/contratos
     GET -> devuelve un JSON con todas los contratos existentes en la BD.
     POST -> Recive un JSON con un objeto Contrato, se espera un idContrato, inicioContrato, terminoContrato, idHorario y idTrabajador. Requiere de autenthication basic en su header y no-cors para la version en linea
 /api/ventas{idContrato}
    GET -> Devuelve un JSON con el objeto correspondiente al id solicitado. Requiere el idContrato, autenthication basic en su header y no-cors para la version en linea.
    DELETE -> Elimina el Objeto de la BD.  Requiere el idContrato, autenthication basic en su header y no-cors para la version en linea.
  
```

## Uso Web App
Su fronted esta creado con una convinacion entre Thymeleft y JS Puro.
Uso de la aplicacion web:
- Para ingresar desde la app solo basta con arrancar la aplicacion e ingresar a http://localhost:8080/
- para ingresar al admin solo debemos ir a http://localhost:8080/devs
- para ingresar al crud de asistencias debemos ir a http://localhost:8080/devs/asistencia
- para ingresar al crud de afp debemos ir a http://localhost:8080/devs/afp
- para ingresar al crud de salud debemos ir a http://localhost:8080/devs/salud
- para ingresar al crud de caja debemos ir a http://localhost:8080/devs/caja
- para ingresar al crud de contratos debemos ir a http://localhost:8080/devs/contratos
- para ingresar al crud de horarios debemos ir a http://localhost:8080/devs/horarios
- para ingresar al crud de trabajadores debemos ir a http://localhost:8080/devs/trabajadores
