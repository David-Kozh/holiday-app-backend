package com.davidkozhe.barebonesbackend.employee;

import java.util.List;

public interface EmployeeService {
    
    Iterable<Employee> listAllEmployees();

    Employee getEmployeeById(Integer id);

    Employee saveEmployee(Employee Employee);

    List<Employee> findAll();

    Employee addEmployee(Employee employee);

    Employee updateEmployee(int id, Employee employee);

    boolean deleteEmployeeById(int id);

}
