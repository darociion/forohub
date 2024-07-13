# ForoHub API

ForoHub es una API que proporciona un CRUD completo para gestionar tópicos en un foro. La API está construida utilizando Spring Boot con diversas dependencias y tecnologías para asegurar un desarrollo robusto y seguro.

# Tecnologías Utilizadas :wrench:

* Spring Boot: Framework principal para construir la aplicación.
* Spring Boot DevTools: Para un desarrollo más rápido con recarga automática.
* Spring JPA: Para la gestión de la persistencia de datos.
* Spring Security: Para la seguridad y autenticación.
* Spring Validation: Para validar las entradas del usuario.
* Spring Web: Para la gestión de solicitudes HTTP.
* MySQL: Base de datos utilizada.
* Flyway: Para la migración de la base de datos.
* JWT (Auth0): Para la autenticación y autorización.
<!--
* Swagger: Para la documentación de la API.
-->

# Instalación y Configuración :computer:

1. Clona el repositorio:

```code
  git clone https://github.com/darociion/forohub.git
```

2. Configura la base de datos MySQL:
   
Crea una base de datos en MySQL llamada forohub y asegúrate de actualizar las credenciales en el archivo "application.properties".

3. Configura el archivo "application.properties":

```code
  spring.datasource.url=jdbc:mysql://localhost:3306/forohub
  spring.datasource.username=tu_usuario
  spring.datasource.password=tu_contraseña
```

# Endpoints

Autenticación

* POST /login: Autentica a un usuario y devuelve un token JWT.

Tópicos

* GET /topicos: Obtiene una lista de todos los tópicos.
* GET /topicos/{id}: Obtiene un tópico por ID.
* POST /topicos: Crea un nuevo tópico.
* PUT /topicos/{id}: Actualiza un tópico existente.
* DELETE /topicos/{id}: Elimina un tópico por ID.

# Autenticación

La API utiliza JWT para la autenticación y autorización. Asegúrate de incluir un token JWT válido en el encabezado de tus solicitudes.
Ejemplo de encabezado de autorización:

```code
  Authorization: Bearer tu_jwt_token
```
<!--
# Documentación

La API está documentada utilizando Swagger. Una vez que la aplicación esté en funcionamiento, puedes acceder a la documentación interactiva en la siguiente URL:

```code
http://localhost:8080/swagger-ui.html
```
-->
# Contribuciones :v:

Toda contribución es bienvenida. Si tienes alguna pregunta o sugerencia, no dudes en crear un issue o un pull request.

