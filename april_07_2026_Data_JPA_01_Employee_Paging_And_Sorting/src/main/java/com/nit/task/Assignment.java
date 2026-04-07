/*Task01. Spring Boot Data JPA Task: Employee Paging and Sorting

🎯 Objective


Build a Spring Boot application using Spring Data JPA that:

Stores Employee records in a database.

Provides functionality to fetch records with pagination and sorting.

Prints paginated results in the console.

🛠 Task Requirements
1️.Main Application Class

Use @SpringBootApplication.

Implement CommandLineRunner to test paging and sorting functionality.

2️.Employee Entity

Table: employees

Fields:

id (Long, Primary Key)

name (String)

designation (String)

salary (Double)

3️.EmployeeRepository

Extend PagingAndSortingRepository<Employee, Long>.

Supports built-in methods:

findAll(Pageable pageable) → for pagination.

findAll(Sort sort) → for sorting.

4️.Paging Examples

Fetch employees in pages of size 3.

Print each page separately.

5️.Sorting Examples

Fetch all employees sorted by:

Name (Ascending).

Salary (Descending).*/