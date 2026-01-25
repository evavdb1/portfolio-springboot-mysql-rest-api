# Portfolio Springboot REST API

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

## How to Run
1. Clone the repository
2. Create MySQL database: 'postcommentdb'
3. Configure username & password in application.properties
4. Start the application in the terminal, using Maven
```
mvn spring-boot:run
```
5. API available at http://localhost:8080
6. Import the included Postman collection to test the endpoints or check 'httpRequests.http'

---
```
portfolio-springboot-rest-API/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── springboot_blogapi/
│       │       └── bootstrap/
│       │       └── configuration/
│       │       └── controller/
│       │       └── dto/
│       │       └── exception/
│       │       └── model/
│       │       └── repository/
│       │       └── service/
│       │       └── @SpringBlogApiApplication
│       └── resources/
│           └── application.properties
├── sql/
│   ├── comments.sql
│   ├── postcomm.sql
│   ├── postcommentsdb_dump.sql
│   └── posts.sql
│
├── pom.xml                 
├── httpRequests.http
├── postmanCollection.json            
├── README.md
└── .gitignore
```
