package ru.akhmzv.pet.service;

import org.springframework.stereotype.Service;
import ru.akhmzv.pet.entity.Employee;

import java.util.List;


public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(long id);
    Employee updateEmployee(Employee employee, long id);
    void deleteEmployee(long id);



}
