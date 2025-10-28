# tpi-logistica-backend

Proyecto Maven multi-módulo (Spring Boot) para el TPI de logística.

Estructura:
- common: código compartido
- service: lógica de negocio
- api: punto de entrada (aplicación Spring Boot)


Requisitos:

- Java 21 (JDK 21)
- Maven 3.9+

Construcción:

```powershell
mvn -DskipTests package
```

Ejecutar la aplicación Spring Boot (desde el módulo api):

```powershell
cd api
mvn spring-boot:run
```

O con el jar:

```powershell
java -jar api\target\api-0.1.0-SNAPSHOT.jar
```
