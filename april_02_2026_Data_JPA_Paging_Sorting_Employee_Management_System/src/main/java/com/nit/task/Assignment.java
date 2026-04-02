/*Task01: Employee Management System

Objective:
Display employees page-wise + sorted by salary


Entity: Employee

Fields: empId, empName, department, salary

Repository: EmployeeRepository
Extends: PagingAndSortingRepository<Employee, Long>

Service: EmployeeService

Methods:

saveEmployees()
getEmployeesByPageAndSort()

Logic:

Use PageRequest.of(page, size, Sort.by("salary"))
Salary > 0

Runner: EmployeeRunner
Calls service
Prints paginated + sorted output

Sample Data:

John-40000, Ali-60000, 
David-50000, Sara-70000, 
Kumar-30000, Ravi-45000


Output: Paging + Sorting (Salary ASC, Page 0, Size 3)

---- Employees (Page 1, Sorted by Salary ASC) ----
Kumar   30000
John    40000
Ravi    45000

Page No      : 0
Total Pages  : 2
Total Records: 6

Output: Paging + Sorting (Salary DESC, Page 1, Size 3)
---- Employees (Page 2, Sorted by Salary DESC) ----
David   50000
Ravi    45000
John    40000

Page No      : 1
Total Pages  : 2
Total Records: 6*/
