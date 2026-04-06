/*Task 1: Student Management System

Objective
Apply finder methods on student data with multiple filters.

Entity Class: Student

Fields:

id (Long)
name (String)
course (String)
marks (Double)
grade (String)
city (String)
passed (Boolean)

Repository Interface: StudentRepository

Finder Methods:
findByCourse(String course)
findByMarksGreaterThan(Double marks)
findByMarksBetween(Double min, Double max)
findByGrade(String grade)
findByCity(String city)
findByPassedTrue()
findByNameStartingWith(String prefix)
findByCourseAndPassed(String course, Boolean status)
findTop3ByOrderByMarksDesc()
findByCityNotIn(List<String> cities)

Service Logic
Get top scorers
Filter students who passed
Search students by name
Get students from specific cities

Runner Logic
Insert sample student records
Execute all finder methods
Display results clearly*/
