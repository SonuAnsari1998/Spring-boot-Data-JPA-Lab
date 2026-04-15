/*Task — Employee Analytics System using @Query + Native Query

================================================================
Objective
Create an employee system that supports advanced querying using JPQL and Native SQL.


Add Employees

Entity: Employee

id (Long)
name (String)
department (String)
salary (Double)
designation (String)

JPQL (@Query)
-------------
Find employees by department
Find employees with salary greater than given value
Search employees by name keyword
Count employees in a department
Find employees by designation AND department

Native Query
------------
Find employees with salary between range
Fetch top 5 highest paid employees
Count total employees
Get average salary
Department-wise employee count

Update & Delete
----------------
Update employee salary by id (@Query)
Increase salary by 5000 for a department (Native)
Delete employees by department (Native)

Console Menu
-------------
1. Add Employee
2. View All Employees
3. Find by Department (JPQL)
4. Find Above Salary (JPQL)
5. Search by Name (JPQL)
6. Count by Department (JPQL)
7. Find by Designation & Dept
8. Salary Range (Native)
9. Top 5 Highest Paid
10. Total Employees
11. Average Salary
12. Dept-wise Count
13. Update Salary
14. Increment Salary by Dept
15. Delete by Department
16. Exit

Expected Output
---------------
When user selects Average Salary:
Average Salary: 47500.0


*/
