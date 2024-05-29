# SurvivorsLitClub - A Book Club for the Post-Apocalyptic World

## Overview

SurvivorsLitClub is a full-stack application that empowers users to manage their book collections and interact with a community of book enthusiasts, all in a post-apocalyptic setting. Key features include user registration with secure email validation, comprehensive book management, and robust borrowing and returning functionalities. The application prioritizes security using JWT tokens and adheres to best practices in REST API design. The backend is built with Spring Boot 3 and Spring Security 6, while the frontend is developed using Angular, styled with Bootstrap.

## Features

- **User Registration**: Users can sign up for new accounts.
- **Email Validation**: Accounts are activated through secure email validation codes.
- **User Authentication**: Secure login for existing users.
- **Book Management**: Users can create, update, share, and archive books.
- **Book Borrowing**: Implements checks to ensure books are borrowable.
- **Book Returning**: Allows users to return borrowed books.
- **Book Return Approval**: Functionality to approve the return of books.

## Technologies Used

- **Backend**:
  - Spring Boot 3
  - Spring Security 6
  - JWT Token Authentication
  - Spring Data JPA
  - JSR-303 and Spring Validation
  - OpenAPI and Swagger UI Documentation
  - Docker
  - Keycloak
  
- **Frontend**:
  - Angular
  - Bootstrap

- **CI/CD**:
  - GitHub Actions

## Learning Objectives

By following this project, students will gain skills in:

1. **Design**:
   - Designing a class diagram based on business requirements.
   - Implementing a mono repo approach.

2. **Security**:
   - Securing an application using JWT tokens with Spring Security.
   - Registering users and validating accounts via email.

3. **Data Management**:
   - Utilizing inheritance with Spring Data JPA.
   - Implementing the service layer and handling application exceptions.
   - Object validation using JSR-303 and Spring Validation.

4. **API Development**:
   - Handling custom exceptions.
   - Implementing pagination and REST API best practices.
   - Documenting APIs using OpenAPI and Swagger UI.
   - Implementing business requirements and handling business exceptions.

5. **DevOps**:
   - Dockerizing the infrastructure.
   - Setting up a CI/CD pipeline & deployment using GitHub Actions.
   - Using Spring Profiles for environment-specific configurations.

## Getting Started

To get started with the project, follow these steps:

1. **Clone the repository**:
   ```sh
   git clone https://github.com/yourusername/SurvivorsLitClub.git
   ```

2. **Navigate to the project directory**:
   ```sh
   cd SurvivorsLitClub
   ```

3. **Build and run the backend application**:
   ```sh
   ./mvnw spring-boot:run
   ```
4. **Access the application**:
   Open your browser and go to `http://localhost:8080`.

## Configuration

Configure your application.yml or application.properties with the following settings:

```yml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/survival_lit_club
    username: username
    password: password
    driver-class-name: org.postgresql.Driver
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: false
    properties:
      hibernate:
        format_sql: true
    database: postgresql

  mail:
    host: localhost
    port: 1025
    protocol: smtp
    username: maildev
    password: maildev
    properties:
      mail:
        smtp:
          trust: "*"
          auth: true
          starttls:
            enable: true
          connectiontimeout: 5000
          timeout: 3000
          writetimeout: 5000

application:
  security:
    jwt:
      secret-key: 24aaa2a91725978e844855adc98832e808f96c59ad9f61abd026c9df88bdde9b
      expiration: 86400000 # 1 day
      refresh-token:
        expiration: 604800000 # 7 days
  mailing:
    frontend:
      activateUrl: http://localhost:4200/activate-account
  file:
    upload:
      photos-output-path: ./uploads
logging:
  level:
      root: INFO
```

## Docker Services

```yml
services:
  postgres:
    container_name: postgres-sql-SLC
    image: postgres
    environment:
      POSTGRES_USER: username
      POSTGRES_PASSWORD: password
      POSTGRES_DB: survival_lit_club
    volumes:
      - postgres-data:/var/lib/postgresql/data
    ports:
      - 5432:5432
    networks:
      - xbn-network
    restart: unless-stopped

  mail-dev:
    container_name: mail-dev-SLC
    image: maildev/maildev
    ports:
      - 1080:1080
      - 1025:1025
    networks:
      - xbn-network

networks:
  xbn-network:
    driver: bridge

volumes:
  postgres-data:
    driver: local
```

## Contribution

Contributions are welcome! Please fork the repository and create a pull request with your changes. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any inquiries or feedback, please contact [imsafay@gmail.com](mailto:your-email@example.com).

