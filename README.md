# Proyecto JavaFX y Spring Boot con Maven y MySQL

Este proyecto es una aplicación Java que utiliza JavaFX para la interfaz de usuario y Spring Boot para la lógica del servidor. La aplicación está construida con Maven y utiliza MySQL como base de datos.

## Requisitos Previos

- Java JDK 17 o superior
- Maven 3.8.4 o superior
- MySQL Server
- IDE recomendado: IntelliJ IDEA, Eclipse, etc.

## Estructura del Proyecto

- `src/main/java` - Código fuente de la aplicación.
- `src/main/resources` - Archivos de configuración y recursos.
- `src/main/resources/application.properties` - Configuración de Spring Boot.
- `pom.xml` - Archivo de configuración de Maven.

## Configuración del Proyecto

### 1. Configuración de la Base de Datos

Asegúrate de tener MySQL instalado y ejecutándose. Crea una base de datos para tu proyecto. Por ejemplo, puedes llamarla `mydatabase`.

Actualiza el archivo `src/main/resources/application.properties` con los detalles de tu base de datos:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/mydatabase
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
