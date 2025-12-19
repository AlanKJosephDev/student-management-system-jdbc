\# Student Management System (JDBC)



\## 📌 Project Overview

This is a console-based Student Management System developed using Java and JDBC.  

The application performs basic CRUD operations on student records stored in a relational database.



\## 🚀 Features

\- Add new student records

\- View all students

\- Update student details

\- Delete student records

\- Menu-driven console interface



\## 🛠 Technologies Used

\- Java

\- JDBC

\- MySQL

\- Maven

\- Git \& GitHub



\## 📁 Project Structure

src/main/java/com/app/student

├── DBConnection.java # Handles database connection

├── MenuDrivenProgram.java # Main class with menu-driven interface

├── Student.java # Student model class

├── StudentDAO.java # Database operations for Student

└── StudentService.java # Business logic / service layer



\## 🗄 Database Schema

```sql

CREATE TABLE student (

&nbsp;   id INT PRIMARY KEY AUTO\_INCREMENT,

&nbsp;   name VARCHAR(100) NOT NULL  

);
```


\## ▶ How to Run

Clone the repository

Configure database credentials in DBUtil.java

Compile and run MainMenu.java



\## 📌 Future Enhancements

Layered package structure (dao, service, model)

Exception handling improvements

Migration to Spring Boot

