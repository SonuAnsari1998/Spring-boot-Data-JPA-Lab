/*Task 1 — Employee Salary Management using @Query
====================================================
Objective
Build a console-based Spring Boot application to manage employee salary details using Spring Data 
JPA and @Query.

Employee Entity

Fields:

id (Long)
name (String)
department (String)
salary (Double)
experience (Integer)

Custom Queries using @Query
----------------------------
Find employees by department
Find employees with salary between two values
Find employees with experience greater than given years
Count employees in a department
Get highest salary employee
Update & Delete
Increase salary by percentage using id (@Modifying)
Delete employees with salary less than given value (@Modifying)

Console Menu
=== Employee Salary Menu ===
1. Add Employee
2. View All Employees
3. Find by Department
4. Find Salary Between Range
5. Find Experienced Employees
6. Count Employees in Department
7. Highest Salary Employee
8. Increase Salary
9. Delete Low Salary Employees
10. Exit

Expected Output Example

👉 Find employees in "IT":

Employees in IT Department:
[101, John, IT, 60000, 5]
[102, Ravi, IT, 75000, 7]*/
