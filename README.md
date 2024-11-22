# Gestor de Tareas

## 🚀 Funcionalidades

- Registro y autenticación de usuarios.
- CRUD de tareas.
- Gestión de tareas por usuario.
- Validación de datos y manejo de errores.

## Cómo Instalar y Ejecutar
Instalación

### Clonar el repositorio:
```
git clone https://github.com/AdriManresa/gestordetareas
cd gestor-tareas
```
### Configurar la base de datos: Editar el archivo application.properties con los siguientes valores:

    spring.datasource.url=jdbc:postgresql://localhost:5432/tareas_db
    spring.datasource.username=tu_usuario
    spring.datasource.password=tu_contraseña

### Construir el Proyecto

 Limpiar y construir:

 ```
mvn clean install
```
Ejecutar la aplicación:

    mvn spring-boot:run

Endpoints Principales

    Registro de usuario:
    POST /api/auth/registro

    Crear tarea:
    POST /api/tareas

    Listar tareas:
    GET /api/tareas/usuario/{usuarioId}

    Actualizar tarea:
    PUT /api/tareas/{id}

    Eliminar tarea:
    DELETE /api/tareas/{id}
    
## 🛠 Tecnologías

- **Java 17**
- **Spring Boot 3**
- **PostgreSQL**
- **Spring Security**
- **Lombok**
- **BCrypt**


## 🔧 Requisitos

- **JDK 17+**
- **PostgreSQL 13+**
- **Maven**

