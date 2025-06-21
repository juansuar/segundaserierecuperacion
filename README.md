# 📚 API REST - Biblioteca

Este proyecto es una API RESTful desarrollada en Java usando **Spring Boot**, diseñada para gestionar libros en una biblioteca. Permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre los libros registrados.

---

## 🛠 Tecnologías utilizadas

- **Java 17**
- **Spring Boot 3.5.3**
- **Spring Web** (para exponer la API REST)
- **Spring Data JPA** (para interactuar con la base de datos)
- **Maven** (para la gestión de dependencias)
- **H2 Database** *(por defecto)* o **MySQL** *(opcional)*

---

## 🚀 Funcionalidades de la API

- Crear un nuevo libro
- Obtener todos los libros
- Obtener un libro por su ID
- Actualizar información de un libro
- Eliminar un libro

---

## 📦 Estructura del proyecto

biblioteca/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com.ejemplo.biblioteca/
│ │ │ ├── controller/
│ │ │ ├── model/
│ │ │ ├── repository/
│ │ │ └── BibliotecaApplication.java
│ │ └── resources/
│ │ ├── application.properties
├── pom.xml


---

## ⚙️ Requisitos para ejecutar el proyecto

- Java 17 o superior
- Maven instalado
- IDE (como Eclipse o IntelliJ)

---

## ▶️ Cómo ejecutar

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu_usuario/biblioteca.git

2. Entra al proyecto:
   cd biblioteca

3. Ejecuta la aplicacion:
   mvn spring-boot:run

4. La API esta corriendo en:
   http://localhost:8080

---

## 👨‍💻 Autor

Desarrollado por **Juan** – Estudiante de Ingeniería en Sistemas  
GitHub: https://github.com/juansuar/segundaserierecuperacion.git
