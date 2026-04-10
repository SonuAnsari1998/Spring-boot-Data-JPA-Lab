package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Student;
@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	StudentService service;
	
	@Override
	public void run(String... args) throws Exception {
		IO.println("=== Student Enrollment Menu ===\r\n"
				+"========================================\r\n"
				+ "1. Add Student\r\n"
				+ "2. View All Students\r\n"
				+ "3. Find Students by Course\r\n"
				+ "4. Find Students Below Fee\r\n"
				+ "5. Find Students by Grade\r\n"
				+ "6. Count Students in Course\r\n"
				+ "7. Search Student by Name\r\n"
				+ "8. Update Student Grade\r\n"
				+ "9. Delete Students by Course\r\n"
				+ "10. Exit");
		int choice = Integer.parseInt(IO.readln("Enter Your Choice"));
		switch(choice) {
		case 1->{
			 Long id = Long.parseLong(IO.readln("Enter Student Id"));
			 String name = IO.readln("Enter Student Name");
			 String course = IO.readln("Enter course");
			 double fee = Double.parseDouble(IO.readln("Enter Fee"));
			 String grade = IO.readln("Enter Grade");
			 Student stu = new Student(id,name,course,fee,grade);
			 service.addStudent(stu);
		}
		case 2->{
			List<Student> viewStudent = service.viewStudent();
			viewStudent.forEach(IO::println);
		}
		case 3->{
			String course = IO.readln("Enter course");
			List<Student> findbyCourse = service.findbyCourse(course);
			findbyCourse.forEach(IO::println);	
		}
		case 4->{
			double fee = Double.parseDouble(IO.readln("Enter Fee"));
			List<Student> findbyFeeLessThan = service.findbyFeeLessThan(fee);
			findbyFeeLessThan.forEach(IO::println);	
		}
		case 5->{
			String grade = IO.readln("Enter Grade");
			List<Student> findbyGrade = service.findbyGrade(grade);
			findbyGrade.forEach(IO::println);	
		}
		case 6->{
			String course = IO.readln("Enter course");
			long countCourseStudent = service.countCourseStudent(course);
			System.out.println("Total No. of Student in "+course +" is "+countCourseStudent);
		}
		case 7->{
			String name = IO.readln("Enter Student Name");
			List<Student> serchStudentByName = service.serchStudentByName(name);
			serchStudentByName.forEach(IO::println);	
			
		}
		case 8->{
			Long id = Long.parseLong(IO.readln("Enter Student Id want to update grade"));
			String grade = IO.readln("Enter Grade");
			String updateStudentById = service.updateStudentById(grade, id);
			System.out.println(updateStudentById);
		}
		case 9->{
			String course = IO.readln("Enter course want to delete");
			String deleteStudentByCourse = service.deleteStudentByCourse(course);
			System.out.println(deleteStudentByCourse);
		}
		case 10->{
			IO.println("Thank You!!!");
			System.exit(0);
		}
		
		
		default -> System.err.println("Invalid choice");
		}
	}

}
