package com.rest.hibernate.DAO;

import com.rest.hibernate.entities.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAO implements IStudentDAO{

    private EntityManager entityManager;

    public StudentDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student getStudentById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
//        TypedQuery<Student> query = entityManager.createQuery("select s from Student s where s.lastName = 'kang'", Student.class);
        TypedQuery<Student> query = entityManager.createQuery("from Student where lastName = 'gill'", Student.class);
        return query.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
//        TypedQuery<Student> query = entityManager.createQuery("from Student where lastName = :lastName ", Student.class);
        TypedQuery<Student> query = entityManager.createQuery("select s from Student s where s.lastName = :lastName ", Student.class);
        query.setParameter("lastName", lastName);
        return query.getResultList();
    }

//    @Override
//    public void update(Student student) {
//
//    }

    @Override
    @Transactional
    public void updateNew(Integer id) {
        Student student = entityManager.find(Student.class, id);
        student.setFirstName("random");
        entityManager.merge(student);
    }
}
