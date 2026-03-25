# 📚 Sistema de Gestión de Biblioteca y Préstamos

¡Bienvenido al motor central de nuestra biblioteca! Este proyecto es una **API REST** construida con **Spring Boot** que permite administrar un catálogo de libros y gestionar las solicitudes de préstamos de forma dinámica.

## 🚀 Tecnologías Utilizadas
* **Java 17+**: El lenguaje del café.
* **Spring Boot 3.x**: El framework para aplicaciones Java modernas.
* **Maven**: Nuestro director de orquesta para dependencias.
* **Postman**: Para probar que todo funcione como reloj suizo.

---

## 🛠️ Estructura del Proyecto
El código sigue la arquitectura de capas para mantener las cosas ordenadas:
* **Controller**: Donde recibimos las peticiones (la cara al público).
* **Service**: Donde vive la lógica "inteligente" (el cerebro).
* **Repository**: Gestión de datos en memoria (nuestra "caja de zapatos" temporal).
* **Model**: La definición de nuestros objetos (Libro y Préstamos)[cite: 1].

---

## 📖 Endpoints Principales

### 📕 Gestión de Libros (`/api/v1/libros`)
| Método | Path | Descripción |
| :--- | :--- | :--- |
| **GET** | `/` | Lista todos los libros. |
| **POST** | `/` | Agrega un nuevo libro al catálogo. |
| **GET** | `/buscar/autor/{autor}` | Busca libros por autor. |
| **GET** | `/reportes/masNuevo` | Encuentra el libro más reciente. |
| **GET** | `/reportes/masAntiguo` | Encuentra el libro más viejo. |
| **GET** | `/reportes/ordenados` | Lista libros ordenados cronológicamente. |

### 💳 Gestión de Préstamos (`/api/v1/prestamos`)[cite: 1]
| Método | Path | Estado | Descripción |
| :--- | :--- | :--- | :--- |
| **GET** | `/` | 200 OK | Lista todas las solicitudes[cite: 1]. |
| **POST** | `/` | 201 Created | Registra un nuevo préstamo[cite: 1]. |
| **GET** | `/{id}` | 200 OK | Obtiene detalles por ID[cite: 1]. |
| **PUT** | `/{id}` | 200 OK | Actualiza datos de un préstamo[cite: 1]. |
| **DELETE** | `/{id}` | 204 No Content | Elimina un registro del sistema[cite: 1]. |

---

## 📝 Ejemplo de JSON para Préstamos (POST)
Copia esto en tu **Body > raw > JSON** de Postman para probar:

```json
{
    "id_libro": 101,
    "run_solicitante": "12345678-9",
    "fecha_solicitud": "2026-03-25",
    "fecha_entrega": null,
    "cantidad_dias": 7,
    "multas": 0
}
