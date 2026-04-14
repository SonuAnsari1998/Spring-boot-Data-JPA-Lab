/*Task 01: Spring Boot Console Task — Student & Phone Management.

Objective

Demonstrate how to store multiple phone numbers for a single student using collection mapping.

Project Overview
----------------
Project Name: StudentPhoneSystem
Type: Spring Boot Console Application
Database: MySQL / H2 / PostgreSQL
ORM Tool: Spring Data JPA

Execution Mode: CommandLineRunner

Class-wise Design
1️. Entity Class — Student

Purpose:
Represents student details with multiple phone numbers

Fields:

id — Long (Primary Key)
name — String
phoneNumbers — List

Concept:
One student can have multiple phone numbers

2️. Repository Interface — StudentRepository

Extends JpaRepository<Student, Long>

Responsibilities:

Save student with phone numbers
Fetch student details

3️. Service Class — StudentService

Methods:
saveStudent()
getStudentDetails(Long id)

4️. Runner Class — StudentRunner

Responsibilities:

Create student with phone numbers
Save and retrieve data

5️. Main Class — StudentPhoneSystemApplication

Runs the application

Step-by-Step Flow
Application starts
Student object created with phone numbers
Data saved into database
Data retrieved and displayed

Expected Output

Student: Rohit
Phones: 9876543210, 9123456789*/
