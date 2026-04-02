/*Task02: Student Ranking System

Objective:
Display students page-wise + sorted by marks and name

Entity: Student

Fields: studentId, studentName, course, marks

Repository: StudentRepository
Extends: PagingAndSortingRepository<Student, Long>

Service: StudentService

Methods:
saveStudents()
getStudentsByPageAndMultiSort(int page, int size, String direction)

Logic:
Use PageRequest.of(page, size, Sort.by("marks").descending().and(Sort.by("studentName").ascending()))
Marks > 0

Runner: StudentRunner
Calls service
Prints paginated + multi-sorted output

Sample Data:
Amit–Java–85
Ravi–Java–92
Sneha–Java–85
Kiran–Java–78
Anjali–Java–92
Vikas–Java–70

Output: Paging + Multi Sorting (Marks DESC, Name ASC, Page 0, Size 3)

---- Students (Page 1, Sorted by Marks DESC & Name ASC) ----
Anjali 92
Ravi 92
Amit 85

Page No : 0
Total Pages : 2
Total Records: 6

Output: Paging + Multi Sorting (Marks DESC, Name ASC, Page 1, Size 3)

---- Students (Page 2, Sorted by Marks DESC & Name ASC) ----
Sneha 85
Kiran 78
Vikas 70

Page No : 1
Total Pages : 2
Total Records: 6*/


