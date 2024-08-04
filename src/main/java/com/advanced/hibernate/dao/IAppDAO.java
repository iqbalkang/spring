package com.advanced.hibernate.dao;

import com.advanced.hibernate.entity.Instructor;
import com.advanced.hibernate.entity.InstructorDetails;

public interface IAppDAO {
    void save(Instructor instructor);

    Instructor findInstructorById(int id);

    void deleteInstructorById(int id);

    InstructorDetails findInstructorDetailsById(int id);

    void deleteInstructorDetailsById(int id);
}
