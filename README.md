# Nomads Backend


---


Welcome to the **Movers** backend project! This backend application is part of a SaaS platform designed to connect users with professional moving companies. Users can search for movers based on location, pricing, and other criteria, view detailed information about movers, read reviews, and more. Moving companies can also register, create profiles, and list their services.

## Table of Contents

- [Project Overview](#project-overview)
- [Features](#features)
- [Technology Stack](#technology-stack)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
    - [Environment Variables](#environment-variables)
    - [Database Setup](#database-setup)
    - [Running the Application](#running-the-application)
    - [API Documentation](#api-documentation)
- [Project Structure](#project-structure)
- [Contribution Guidelines](#contribution-guidelines)
- [License](#license)

## Project Overview

This project is the backend service for the Movers application. The backend is responsible for handling requests from the frontend, managing data in the database, and providing RESTful APIs for functionalities such as user registration, mover registration, searching for movers, and managing reviews.

## Features

- **User Management**: Register, login, and manage user profiles.
- **Mover Management**: Register, login, and manage mover company profiles.
- **Search Functionality**: Search for movers based on location, pricing, etc.
- **Rating and Reviews**: Users can rate and review movers.
- **Admin Panel**: (Future implementation) Admins can manage users and movers.

## Technology Stack

- **Backend Framework**: Spring Boot
- **Database**: MySQL
- **ORM**: Hibernate (JPA)
- **Build Tool**: Maven
- **Security**: Spring Security (JWT-based authentication)

## Getting Started

### Prerequisites

Ensure you have the following software installed on your machine:

- [Java 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Maven 3.8+](https://maven.apache.org/download.cgi)
- [MySQL 8+](https://dev.mysql.com/downloads/installer/)
- [Git](https://git-scm.com/)

### Installation

1. **Clone the repository:**

   ```bash
   git clone git@github.com:sainingo/nomads.git
   cd nomads
   ```

2. **Set up environment variables:**

   Create an `.env` file in the root directory or set the environment variables directly in your IDE:

   ```plaintext
   DB_URL=jdbc:mysql://localhost:3306/nomads
   DB_USERNAME=your_mysql_username
   DB_PASSWORD=your_mysql_password
   JWT_SECRET=your_jwt_secret
   ```

   **Note:** Do not commit the `.env` file to version control.

3. **Update `application.properties` with placeholders:**

   ```properties
   spring.datasource.url=${DB_URL}
   spring.datasource.username=${DB_USERNAME}
   spring.datasource.password=${DB_PASSWORD}
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.format_sql=true
   spring.jpa.hibernate.ddl-auto=update

   jwt.secret=${JWT_SECRET}
   ```

### Database Setup

1. **Create a MySQL database:**

   ```sql
   CREATE DATABASE nomads;
   ```

2. **Update the database credentials in the `.env` file** (as mentioned above).

### Running the Application

1. **Build the application:**

   ```bash
   mvn clean install
   ```

2. **Run the application:**

   ```bash
   mvn spring-boot:run
   ```

   The application will start on `http://localhost:9000` by default.

### API Documentation

Once the application is running, you can access the API documentation (if integrated with Swagger or any other tool) at:

```
http://localhost:9000/swagger-ui.html
```

## Project Structure

The project follows the standard Spring Boot structure:

```
movers-backend/
│
├── src/main/java/com/nomads/movers/
│   ├── config/                # Configuration classes (Security, etc.)
│   ├── controller/            # REST Controllers
│   ├── dto/                   # Data Transfer Objects
│   ├── exception/             # Custom exceptions
│   ├── model/                 # Entity classes
│   ├── repository/            # JPA Repositories
│   ├── request/               # Request body classes for APIs
│   ├── response/              # Response body classes for APIs
│   ├── security/              # Security-related classes (JWT, etc.)
│   └── service/               # Service classes (business logic)
│
├── src/main/resources/
│   ├── application.properties # Application configuration
│   └── db/                    # Database migration files (if using Flyway or Liquibase)
│
├── src/test/                  # Unit and Integration tests
│
└── pom.xml                    # Maven dependencies and build configuration
```

## Contribution Guidelines

We welcome contributions! To get started:

1. **Fork the repository** to your GitHub account.
2. **Clone your fork** to your local machine.
3. **Create a new branch** for your feature or bugfix.
4. **Make your changes** and commit them with clear messages.
5. **Push to your fork** and submit a pull request to the `main` branch of this repository.

### Coding Standards

- Follow the existing code style and structure.
- Write unit tests for new features or changes.
- Ensure all tests pass before submitting a PR.

### Pull Request Process

1. Ensure your code follows the project's coding standards.
2. Update the documentation (README, comments, etc.) as necessary.
3. Create the pull request and link any relevant issues in the description.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

---

Thank you for contributing to the Nomads backend project! We look forward to collaborating with you.

---
