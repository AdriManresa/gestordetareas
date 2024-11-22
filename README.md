Cómo Instalar y Ejecutar

## Instalación
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/AdriManresa/gestordetareas)
   cd gestor-tareas

    Configurar base de datos en application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/tareas_db
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña

##Construir el proyecto:
```bash
mvn clean install
```
Ejecutar la aplicación:
```bash
mvn spring-boot:run
```
Endpoints principales

    Registro de usuario: POST /api/auth/registro
    Crear tarea: POST /api/tareas
    Listar tareas: GET /api/tareas/usuario/{usuarioId}
    Actualizar tarea: PUT /api/tareas/{id}
    Eliminar tarea: DELETE /api/tareas/{id}

##Tecnologías

- Java 17
- Spring Boot 3
- PostgreSQL
- JWT para autenticación

##Funcionalidades

- Registro y autenticación de usuarios.
- CRUD para tareas.
- Filtrado de tareas por usuario.
