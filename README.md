# Portfolio Springboot MySQL REST API (BlogAPI)

*A Representational State Transfer Application Programming Interface 
with stateless http-requests. A Blog REST API.*
---

**The backend for a blogpost website containing posts, comments and likes**

---

## Tech Stack
- Java 17+
- Spring Boot
- JPA
- MySQL
- Postman

---

## Features
- Complete Blog API built with Spring Boot
- Posts with one‑to‑many relationship to Comments
- Automatic timestamps for Posts and Comments (createdAt, updatedAt)
- MySQL database integration
- Automatic seed data on startup using DataLoader
- CRUD operations for Posts and Comments
- RESTful API structure following standard HTTP methods
- API tested via Postman (collection included)
- SQL dump available for database setup

---

## Endpoints
*posts*
- GET    /api/posts
- POST   /api/posts
- GET    /api/posts/{id}
- PUT    /api/posts/{id}
- DELETE /api/posts/{id}

*post comments*
- GET    /api/posts/{id}/comments

*comments*
- POST   /api/comments/posts/{postId}
- PUT    /api/comments/{id}
- DELETE /api/comments/{id}

---

## How to Run
1. Clone the repository
2. Create MySQL database: 'postcommentdb'
3. Configure username & password in application.properties
4. Start the application in the terminal, using Maven
```
mvn spring-boot:run
```
5. API available at http://localhost:8080
6. Import postman_collection.json for http requests

---
```
portfolio-springboot-mysql-rest-api/
│
├── src/
│   └── main/java/
│       │   └── org/evavdb1/blogapi/
│       │       └── bootstrap/
│       │               └── DataLoader.java
│       │       └── configuration/
│       │               └── AuditConfig.java
│       │       └── controller/
│       │               └── CommentController.java
│       │               └── PostController.java
│       │       └── dto/
│       │               └── ErrorResponse.java
│       │       └── exception/
│       │               └── GlobalExceptionHandler.java
│       │               └── ResourceNotFoundException.java
│       │       └── model/
│       │               └── AuditModel.java
│       │               └── Comment.java
│       │               └── Post.java
│       │       └── repository/
│       │               └── CommentRepository.java
│       │               └── PostRepository.java
│       │       └── service/
│       │               └── CommentService.java
│       │               └── PostService.java
│       │       └── SpringBlogApiApplication.java
│       └── resources/
│           └── application.properties
├── sql/
│   ├── comments.sql
│   └── posts.sql
│
├── pom.xml                 
├── http_requests.http
├── postman_collection.json            
├── README.md
└── .gitignore
```
