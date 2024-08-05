//package com.advanced;
//
//import com.advanced.hibernate.dao.AppDAO;
//import com.advanced.hibernate.entity.Instructor;
//import com.advanced.hibernate.entity.InstructorDetails;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//
//@SpringBootApplication
//public class SpringPracticeApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringPracticeApplication.class, args);
//	}
//
//	@Bean
//	public CommandLineRunner CommandLineRunner(AppDAO appDAO) {
//		return runner -> {
////            createInstrructor(appDAO);
////			findInstructorById(appDAO);
////			deleteInstructorById(appDAO);
////			findInstructorDetailsById(appDAO);
//			deleteInstructorDetailsById(appDAO);
//		};
//	}
//
//	private void createInstrructor(AppDAO appDAO) {
//		Instructor instructor = new Instructor("jeeto", "gill", "jeeto@gmail.com");
//		InstructorDetails instructorDetails = new InstructorDetails("jeetogill", "reading");
//
//		instructor.setInstructorDetails(instructorDetails);
//
//		System.out.println(instructor);
//		System.out.println(instructorDetails);
//
//		appDAO.save(instructor);
//	}
//
//	private void findInstructorById(AppDAO appDAO) {
//		int id = 2;
//		Instructor instructor = appDAO.findInstructorById(id);
//		System.out.println(instructor);
//		System.out.println(instructor.getInstructorDetails());
//	}
//
//	private void deleteInstructorById(AppDAO appDAO) {
//		int id = 3;
//		appDAO.deleteInstructorById(id);
//		System.out.println("done");
//	}
//
//	private void findInstructorDetailsById(AppDAO appDAO) {
//		int id = 1;
//		InstructorDetails instructorDetails = appDAO.findInstructorDetailsById(id);
//		System.out.println(instructorDetails);
//		System.out.println(instructorDetails.getInstructor());
//	}
//
//	private void deleteInstructorDetailsById(AppDAO appDAO) {
//		int id = 4;;
//		appDAO.deleteInstructorDetailsById(id);
//		System.out.println("done");
//	}
//
//
//}
