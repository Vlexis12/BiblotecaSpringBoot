# 📚 Sistema de Gestión de Biblioteca y Préstamos

¡Bienvenido al motor central de nuestra biblioteca! Este proyecto es una **API REST** construida con **Spring Boot** que permite administrar un catálogo de libros y gestionar las solicitudes de préstamos de forma dinámica.

---

## 🚀 Tecnologías Utilizadas

*   **Java 17+**: El lenguaje base del proyecto.
*   **Spring Boot 3.x**: Framework para el desarrollo de la API.
*   **Maven**: Gestor de dependencias y construcción.
*   **Postman**: Herramienta para pruebas de endpoints.

---

## 🛠️ Estructura del Proyecto

El código sigue la arquitectura de capas para mantener las cosas ordenadas:

*   **Controller**: Gestión de peticiones HTTP y rutas.[cite: 1]
*   **Service**: Lógica de negocio y procesamiento de datos.[cite: 1]
*   **Repository**: Manejo de persistencia (en este caso, listas en memoria).[cite: 1]
*   **Model**: Definición de las entidades (Libro y Prestamo).[cite: 1]

---

## 📖 Endpoints Principales

### 📕 Gestión de Libros (`/api/v1/libros`)

| Método | Path | Descripción |
| :--- | :--- | :--- |
| **GET** | `/` | Lista todos los libros registrados. |
| **POST** | `/` | Agrega un nuevo libro al catálogo. |
| **GET** | `/buscar/autor/{autor}` | Busca libros por un autor específico. |
| **GET** | `/reportes/masNuevo` | Muestra el libro con la fecha más reciente. |
| **GET** | `/reportes/masAntiguo` | Muestra el libro más antiguo registrado. |

### 💳 Gestión de Préstamos (`/api/v1/prestamos`)[cite: 1]

| Método | Path | Código | Descripción |
| :--- | :--- | :--- | :--- |
| **GET** | `/` | 200 OK | Recupera todos los préstamos.[cite: 1] |
| **POST** | `/` | 201 Created | Crea un nuevo registro de préstamo.[cite: 1] |
| **GET** | `/{id}` | 200 OK | Recupera un préstamo por su ID.[cite: 1] |
| **PUT** | `/{id}` | 200 OK | Actualiza los datos de un préstamo.[cite: 1] |
| **DELETE** | `/{id}` | 204 No Content | Elimina un préstamo del sistema.[cite: 1] |

---

## 📝 Ejemplo de JSON para Préstamos (POST)

Para registrar un préstamo en Postman, utiliza el siguiente cuerpo en formato JSON:[cite: 1]

```json
{
    "id_libro": 101,
    "run_solicitante": "12345678-9",
    "fecha_solicitud": "2026-03-25",
    "fecha_entrega": null,
    "cantidad_dias": 7,
    "multas": 0
}
