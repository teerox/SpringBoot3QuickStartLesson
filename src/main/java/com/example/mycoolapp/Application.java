package com.example.mycoolapp;

import com.example.mycoolapp.dao.StudentDAO;
import com.example.mycoolapp.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

//@SpringBootApplication(
//        scanBasePackages = {"com.example.mycoolapp", "com.example.mycoolapp.common", "com.example.mycoolapp.rest"}
//)
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return args -> {
            createMultipleStudents(studentDAO);
            //createStudent(studentDAO);
            //readStudent(studentDAO);


//            readAllStudents(studentDAO);
//            readStudentByLastName(studentDAO);
//            updateStudent(studentDAO);
//            deleteStudent(studentDAO);
//
//            deleteAllStudents(studentDAO);
        };
    }

    private void readStudent(StudentDAO studentDAO) {
        System.out.println("Creating New Student...");
        Student student = new Student("John", "Doe", "john@gmail.com");

        // save the student
        System.out.println("Saving Student...");
        studentDAO.saveStudent(student);

        // display the student id
        System.out.println("Saved Student. Generated Id: " + student.getId());

        System.out.println("Finding Student...");
        Student myStudent = studentDAO.findById(student.getId());
        System.out.println("Found Student: " + myStudent);
    }

    private void createStudent(StudentDAO studentDAO) {
        System.out.println("Creating New Student...");
        Student student = new Student("John", "Doe", "john@gmail.com");

        // save the student
        System.out.println("Saving Student...");
        studentDAO.saveStudent(student);

        // display the student id
        System.out.println("Saved Student. Generated Id: " + student.getId());

        // display the student
        System.out.println("Saved Student: " + student);
    }

    public void createMultipleStudents(StudentDAO studentDAO) {
        System.out.println("Creating New Student...");
        Student student1 = new Student("Ekene", "Jane", "jk@gmail.com");
        Student student2 = new Student("Past", "Gin", "hg@gmail.com");
        Student student3 = new Student("Mark", "Fasts", "fst@gmail.com");

        studentDAO.saveStudent(student1);
        studentDAO.saveStudent(student2);
        studentDAO.saveStudent(student3);
    }
    private void updateStudent(StudentDAO studentDAO) {
        Student myStudent = studentDAO.findById(1);
        myStudent.setFirstName("Jackson");
        studentDAO.updateStudent(myStudent);

        System.out.println("Updating Student...");
        System.out.println("Updated Student: " + myStudent);
    }

    private void deleteStudent(StudentDAO studentDAO) {
        System.out.println("Deleting Student...");
        studentDAO.deleteById(1);
    }

    private void readAllStudents(StudentDAO studentDAO) {
        System.out.println("Finding All Students...");
        List<Student> students = studentDAO.findAll();
        System.out.println("Found " + students.size() + " Students");
        for (Student student : students) {
            System.out.println("Found Student: " + student);
        }
    }

    private void readStudentByLastName(StudentDAO studentDAO) {
        System.out.println("Finding Student by Last Name...");
        List<Student> students = studentDAO.findByLastName("Gin");
        System.out.println("Found " + students.size() + " Students");
        for (Student student : students) {
            System.out.println("Found Student: " + student);
        }
    }

    public void deleteAllStudents(StudentDAO studentDAO) {
        System.out.println("Deleting All Students...");
        int count = studentDAO.deleteAll();
        System.out.println("Deleted " + count + " Students");
    }
}
