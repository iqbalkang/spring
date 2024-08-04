//package com.rest.staffhub.services;
//
//import com.rest.staffhub.DAO.EmployeeRepository;
//import com.rest.staffhub.entities.Employee;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//public class EmployeeService implements IEmployeeService{
////    private IEmployeeDAO employeeDAO;
//    private EmployeeRepository employeeRepository;
//
//    public EmployeeService(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
//
//    //    public EmployeeService(IEmployeeDAO employeeDAO) {
////        this.employeeDAO = employeeDAO;
////    }
//
//    @Override
//    public List<Employee> findAll() {
//        return employeeRepository.findAll();
//    }
//
//    @Override
//    public Employee findById(Integer id) {
//        return employeeRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Employee with ID " + id + " not found"));
//    }
//
//    @Override
//    @Transactional
//    public Employee save(Employee employee) {
//        return employeeRepository.save(employee);
//    }
//
//    @Override
//    @Transactional
//    public void deleteById(Integer id) {
//        employeeRepository.deleteById(id);
//    }
//}
