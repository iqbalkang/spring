package com.advanced.hibernate.dao;

import com.advanced.hibernate.entity.Instructor;
import com.advanced.hibernate.entity.InstructorDetails;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AppDAO implements IAppDAO{
    private EntityManager entityManager;

    @Autowired
    public AppDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Instructor instructor) {
        entityManager.merge(instructor);
    }

    @Override
    public Instructor findInstructorById(int id) {
        return entityManager.find(Instructor.class, id);
    }

    @Override
    @Transactional
    public void deleteInstructorById(int id) {
        Instructor instructor = findInstructorById(id);
        entityManager.remove(instructor);
    }

    @Override
    public InstructorDetails findInstructorDetailsById(int id) {
        return entityManager.find(InstructorDetails.class, id);
    }

    @Override
    @Transactional
    public void deleteInstructorDetailsById(int id) {
        Instructor instructor = findInstructorById(id);
        entityManager.remove(instructor);
    }
}
