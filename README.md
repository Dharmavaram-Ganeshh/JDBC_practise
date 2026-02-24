🔐 Java JDBC Login & Signup System

A simple Java JDBC practice project that demonstrates how to connect a Java application to a MySQL database and perform basic Login and Signup operations.

This project focuses on understanding:

JDBC connectivity

Database operations (CRUD basics)

User authentication logic

Secure data handling

🚀 Tech Stack

☕ Java

🗄️ JDBC (Java Database Connectivity)

🛢️ MySQL

🧰 MySQL Connector/J

📌 Project Objective

The main goal of this project is to practice:

Establishing database connection using JDBC

Executing SQL queries from Java

Implementing user registration (Signup)

Implementing user authentication (Login)

Handling exceptions and closing resources properly

✨ Features
📝 Signup

User can register with:

Username

Email

Password

Data is stored in MySQL database

🔐 Login

User can login using:

Username / Email

Password

Credentials are validated against stored database records

🗂️ Project Structure
JDBC-Login-Signup/
│
├── src/
│   ├── DBConnection.java
│   ├── UserDAO.java
│   ├── Login.java
│   └── Signup.java
│
└── database.sql
