# 📚 Proyecto De Biblioteca (API REST)

Este es un sistema de gestión de biblioteca desarrollado con **Spring Boot** y **Java 21**. El proyecto implementa una arquitectura de capas (Controlador, Servicio y Repositorio) para gestionar libros de forma eficiente a través de servicios web.

---

### 🛠️ Stack Tecnológico
* **Lenguaje:** Java 21 (OpenJDK 25 configurado en el IDE).
* **Framework:** Spring Boot 4.0.3.
* **Gestión de Dependencias:** Maven (usando Maven Wrapper 3.9.12).
* **Librerías Principales:**
    * **Lombok:** Utilizado para la generación automática de Getters, Setters y Constructores.
    * **Spring Web MVC:** Para la creación de la API REST.
* **Persistencia:** Almacenamiento **en memoria** mediante un `ArrayList` dinámico en la capa de repositorio.

---

### 📂 Estructura del Código y Lógica
El proyecto sigue el patrón **MVC** para una separación clara de responsabilidades:

1. **Modelo (`Libro.java`):** Define la entidad con campos como ID, ISBN, título, autor, editorial y año de publicación.
2. **Repositorio (`LibroRepository.java`):** Contiene la lógica de persistencia. Aunque tiene métodos avanzados como `buscarPorIsbn`, actualmente gestiona una lista `listaLibros` de forma local.
3. **Servicio (`LibroService.java`):** Actúa como capa intermedia gestionando la lógica de negocio antes de llamar al repositorio.
4. **Controlador (`LibroController.java`):** Expone los endpoints en la ruta `/api/v1/libros`.

---

### 🚀 Guía de la API (Endpoints)
Puedes interactuar con la biblioteca usando los siguientes métodos:

| Método | Endpoint | Descripción |
| :--- | :--- | :--- |
| **GET** | `/api/v1/libros` | Retorna la lista completa de libros. |
| **GET** | `/api/v1/libros/{id}` | Busca un libro específico por su ID numérico. |
| **POST** | `/api/v1/libros` | Crea un nuevo libro (requiere un JSON en el cuerpo). |
| **PUT** | `/api/v1/libros/{id}` | Actualiza la información de un libro existente. |
| **DELETE** | `/api/v1/libros/{id}` | Elimina un libro del sistema. |

---

### ⚙️ Instalación y Configuración
1. **Requisitos:** Tener instalado el JDK 21 o superior.
2. **Importación:** Abrir la carpeta `Proyecto-De-Biblioteca` en IntelliJ IDEA.
3. **Ejecución:**
   * Localizar la clase `ProyectoDeBiblotecaApplication.java`.
   * Hacer clic derecho y seleccionar **Run**.
   * La aplicación iniciará en `http://localhost:8080`.

---

### 👤 Autor
* **Alexis** - [Perfil de GitHub](https://github.com/Vlexis12)
