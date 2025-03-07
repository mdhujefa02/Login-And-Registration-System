# Login-And-Registration-System

This repository contains a Java-based Login-And-Registration System with JSP, Servlets, and a database for user registration and login. It provides a simple and secure way to manage user authentication.

## Project Description

The User Authentication System enables users to register and log in securely. The project uses JSP for the front-end, Servlets for business logic, and a database for storing user credentials.

## Features

- User registration with validation.
- Secure login authentication.
- Session management.
- Basic styling using CSS.

## Technologies Used

- Java (JDK 8 or higher)
- JSP and Servlets
- JDBC (Java Database Connectivity)
- SQL (or any relational database)
- HTML, CSS

## Folder Structure

```
/ - Root directory
  ├── DBUtil.java            # Database connection utility
  ├── Login.jsp              # Login page
  ├── LoginServlet.java      # Servlet handling login logic
  ├── Register.jsp           # Registration page
  ├── RegisterServlet.java   # Servlet handling registration logic
  ├── User.java              # Model class for User
  ├── UserDao.java           # Interface for user-related database operations
  ├── UserDaoImpl.java       # Implementation of UserDao
  ├── Welcome.jsp            # Page displayed after successful login
  ├── index.html             # Landing page
  ├── indexstyle.css         # Styles for index.html
  ├── style.css              # General styling
```

## Setup and Usage

### Prerequisites

- Java Development Kit (JDK 8+)
- Apache Tomcat (or any servlet container)
- SQL (or another supported database)

### Steps to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/Login-And-Registration-system.git
   ```
2. Import the project into an IDE (Eclipse, IntelliJ, or NetBeans).
3. Configure the database (see next section).
4. Deploy the project to a servlet container (e.g., Apache Tomcat).
5. Open `http://localhost:8080/user-authentication-system/index.html` in a browser.

## Database Configuration

1. Create a SQL database:
   ```sql
   CREATE DATABASE User_Data;
   ```
2. Create a `users` table:
   ```sql
   CREATE TABLE User_Data (
       id INT(10) PRIMARY KEY,
       username VARCHAR(50) NOT NULL UNIQUE,
       password VARCHAR(20) NOT NULL,
       email VARCHAR(50) NOT NULL UNIQUE
   );
   ```
3. Update `DBUtil.java` with your database credentials.
