package com.rest.hibernate.DAO;

import com.rest.hibernate.entities.Student;

import java.util.List;

public interface IStudentDAO {

    void save(Student student);

    Student getStudentById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);

//    void update(Student student);

    void updateNew(Integer id);
}
