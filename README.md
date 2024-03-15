
# Note API - Spring Boot Application (REST API for Note_App_API android client)
![Java](https://img.shields.io/badge/java-21-orange)
![SpringBoot](https://img.shields.io/badge/SpringBoot-3.2.3-blue)
![Lombok](https://img.shields.io/badge/Lombok-1.18.30-red)

This Spring Boot application serves as a RESTful API backend for an Android note-taking application. It provides endpoints for managing notes stored in a MySQL database as well as datasave saving functionality (MYSQL datasave).

## Project Specification

- **Java Version**: 21
- **Spring Boot Version**: 3.2.3
- **Lombok Version**: 1.18.30

## Routes

### Get all notes
- **GET** `/note/get-all`
  - Retrieves all notes from the database.

### Get note by ID
- **GET** `/note/{note_id}`
  - Retrieves a specific note by its ID.

### Create new note
- **POST** `/note`
  - Creates a new note. The note ID is generated automatically.

### Update note
- **PUT** `/note/update`
  - Updates a note. The updated note information should be provided in the request body.

### Delete note by ID
- **DELETE** `/note/{note_id}`
  - Deletes a specific note by its ID.

### Delete all notes
- **DELETE** `/note/delete-all`
  - Deletes all notes from the database.

## Technologies Used
- Spring Boot
- Spring Data JPA
- MySQL Database
- Lombok

## Running the Application
1. Make sure you have a MySQL database instance running locally.
2. Configure the MySQL connection details in `application.properties`.
3. Build the project using Maven: `mvn clean install`.
4. Run the Spring Boot application: `mvn spring-boot:run`.
5. The application will start at port 9000.

## Dependencies
- Spring Boot Starter Data JPA
- Spring Boot Starter Web
- Spring Boot Starter Test
- MySQL Connector/J
- Lombok

## Notes
- Cross-origin requests are allowed from `http://127.0.0.1:9000`.
- Lombok is used for reducing boilerplate code.

Feel free to explore and integrate this API with your Android note-taking application. If you encounter any issues or have suggestions for improvements, please feel free to raise them in the repository's issue tracker.
