# 📘 WorkshopMongo – Spring Boot + MongoDB

This is a backend REST API project built with **Spring Boot 3**, using **MongoDB** as the database. It simulates a simple social network backend with users and posts, including embedded comments and author references.

---

## 🚀 Technologies Used

- Java 17  
- Spring Boot 3.3.4  
- Spring Data MongoDB  
- Maven  

---

## 🗂️ Directory Structure

```bash
workshopmongo/
├── src/
│   └── main/
│       ├── java/com/diegosilva/workshopmongo/
│       │   ├── config/
│       │   │   └── Instantiation.java
│       │   ├── domain/
│       │   │   ├── Post.java
│       │   │   └── User.java
│       │   ├── dto/
│       │   │   ├── AutorDTO.java
│       │   │   ├── CommentDTO.java
│       │   │   └── UserDTO.java
│       │   ├── repository/
│       │   │   ├── PostRepository.java
│       │   │   └── UserRepository.java
│       │   ├── resources/
│       │   │   ├── PostResource.java
│       │   │   ├── UserResource.java
│       │   │   ├── exception/
│       │   │   │   ├── ResourceExceptionHandler.java
│       │   │   │   └── StandardError.java
│       │   │   └── util/
│       │   │       └── URL.java
│       │   ├── services/
│       │   │   ├── PostService.java
│       │   │   ├── UserService.java
│       │   │   └── exception/
│       │   │       └── ObjectNotFoundException.java
│       │   └── WorkshopmongoApplication.java
│       └── resources/
│           └── application.properties
├── pom.xml
└── README.md

```

---

✅ Features
- MongoDB integration via Spring Data
- RESTful API with CRUD operations
- Layered architecture: Controller, Service, Repository
- DTO usage for optimized data transfer
- Exception handling with custom messages
- Initial seed data on startup (Instantiation.java)

⚙️ MongoDB Configuration
spring.application.name=workshopmongo
spring.data.mongodb.uri=mongodb://localhost:27017/workshop_mongo

▶️ How to Run
# Run with Maven
./mvnw spring-boot:run


Or use your IDE to run:

WorkshopmongoApplication.java

🎯 Purpose
This project was created as part of a Spring Boot + MongoDB workshop.  
It helps developers learn how to work with NoSQL databases using Java,  
implement REST APIs, use DTOs, and manage exceptions in a clean and layered architecture.

📎 License
This project is for educational purposes only.
