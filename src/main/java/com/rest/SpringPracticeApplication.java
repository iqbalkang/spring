//package com.spring;
//
//import com.spring.hibernate.DAO.StudentDAO;
//import com.spring.hibernate.entities.Student;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//
//import java.util.List;
//
//@SpringBootApplication
//public class SpringPracticeApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringPracticeApplication.class, args);
//	}
//
//	@Bean
//	public CommandLineRunner CommandLineRunner(StudentDAO studentDAO) {
//		return runner -> {
////			createStudent(studentDAO);
////			getStudentById(studentDAO);
////			getStudents(studentDAO);
////			getStudentsByLastName(studentDAO);
////			updateStudent(studentDAO);
//		};
//	}
//
//	private void updateStudent(StudentDAO studentDAO) {
//		studentDAO.updateNew(1);
//	}
//
//	private void getStudentsByLastName(StudentDAO studentDAO) {
//		List<Student> students = studentDAO.findByLastName("kang");
//
//		for(Student student : students) System.out.println(student);
//
//	}
//
//	private void getStudents(StudentDAO studentDAO) {
//		List<Student> students = studentDAO.findAll();
//
//		for(Student student : students) System.out.println(student);
//	}
//
//	private void getStudentById(StudentDAO studentDAO) {
//		Student student = new Student("jeeto", "gill", "jeeto@gmail.com");
//		studentDAO.save(student);
//		System.out.println(student);
//
//		Student studentDB = studentDAO.getStudentById(student.getId());
//		System.out.println("from db: " + studentDB);
//	}
//
//	private void createStudent(StudentDAO studentDAO) {
//		Student student = new Student("bala", "kang", "bala@gmail.com");
//		studentDAO.save(student);
//
//		System.out.println("saved student: " + student);
//	}
//
//
//}
