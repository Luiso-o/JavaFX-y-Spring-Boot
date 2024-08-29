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

# Configuración de la base de datos
spring.datasource.url=jdbc:mysql://localhost:3306/mydatabase
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

## Tutoriales
### Primeros pasos, Configura Spring Boot he instala JavaFX
- <a href = "https://www.youtube.com/watch?v=KtCP-wzSTF0">JavaFX y SPRING BOOT 2024 Integración 🍃 Interfaz Grafica GUI IntelliJ IDEA 2024</a>
