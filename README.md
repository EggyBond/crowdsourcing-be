# CrowdFund Backend

Spring Boot backend application for the CrowdFund platform.

## Prerequisites

- Java 17 or higher
- Maven 3.6+ (or use Maven Wrapper)

## Getting Started

### Running the Application

1. **Using Maven:**
   ```bash
   mvn spring-boot:run
   ```

2. **Using Maven Wrapper (if available):**
   ```bash
   ./mvnw spring-boot:run
   ```

3. **Build and run JAR:**
   ```bash
   mvn clean package
   java -jar target/crowdfund-be-1.0.0.jar
   ```

### Running with Profiles

- **Development profile:**
  ```bash
  mvn spring-boot:run -Dspring-boot.run.profiles=dev
  ```

- **Production profile:**
  ```bash
  mvn spring-boot:run -Dspring-boot.run.profiles=prod
  ```

## API Endpoints

The API will be available at: `http://localhost:8080/api`

## Database

- **Development:** H2 in-memory database
  - Console: `http://localhost:8080/api/h2-console`
  - JDBC URL: `jdbc:h2:mem:crowdfunddb`
  - Username: `sa`
  - Password: (empty)

- **Production:** PostgreSQL (configure in `application-prod.properties`)

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── crowdfund/
│   │           └── CrowdFundApplication.java
│   └── resources/
│       ├── application.properties
│       ├── application-dev.properties
│       └── application-prod.properties
└── test/
    └── java/
        └── com/
            └── crowdfund/
                └── CrowdFundApplicationTests.java
```

## Dependencies

- Spring Boot Web - REST API support
- Spring Data JPA - Database access
- Spring Boot Validation - Input validation
- H2 Database - Development database
- PostgreSQL - Production database
- Lombok - Reduce boilerplate code
- Spring Boot DevTools - Development tools

## Next Steps

1. Create entity models
2. Create repositories
3. Create service layer
4. Create REST controllers
5. Add authentication/authorization if needed
6. Configure CORS for frontend integration
7. Add exception handling
8. Add API documentation (Swagger/OpenAPI)

## License

Copyright (c) 2024

