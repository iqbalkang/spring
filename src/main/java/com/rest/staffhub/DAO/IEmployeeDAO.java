package com.rest.staffhub.DAO;

import com.rest.staffhub.entities.Employee;

import java.util.List;

public interface IEmployeeDAO {
    List<Employee> findAll();

    Employee findById(Integer id);

    Employee save(Employee employee);

    void deleteById(Integer id);
}
