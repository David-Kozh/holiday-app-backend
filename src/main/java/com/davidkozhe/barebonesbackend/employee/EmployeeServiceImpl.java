package com.davidkozhe.barebonesbackend.employee;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository EmployeeRepository;

    @Autowired
    public void setEmployeeRepository(EmployeeRepository EmployeeRepository) {
        this.EmployeeRepository = EmployeeRepository;
    }

    @Override
    public Iterable<Employee> listAllEmployees() {
        return EmployeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return EmployeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee saveEmployee(Employee Employee) {
        return EmployeeRepository.save(Employee);
    }

    @Override
    public List<Employee> findAll() {
        return EmployeeRepository.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        Employee savedEmployee = EmployeeRepository.save(employee);
        return savedEmployee;
    }

    @Override
    public Employee updateEmployee(int id, Employee updatedEmployee) {
        Employee existingEmployee = EmployeeRepository.findById(id).orElse(null);

        if (existingEmployee != null) {
            // Update the fields of the existing employee with the new data
            existingEmployee.setFirstName(updatedEmployee.getFirstName());
            existingEmployee.setLastName(updatedEmployee.getLastName());
            existingEmployee.setSpring1(updatedEmployee.getSpring1());
            existingEmployee.setSpring2(updatedEmployee.getSpring2());
            existingEmployee.setSpring3(updatedEmployee.getSpring3());
            existingEmployee.setFall1(updatedEmployee.getFall1());
            existingEmployee.setFall2(updatedEmployee.getFall2());
            existingEmployee.setFall3(updatedEmployee.getFall3());
            existingEmployee.setStartYear(updatedEmployee.getStartYear());
            return EmployeeRepository.save(existingEmployee);
        }

        return null; // Employee with the given ID not found
    }

    @Override
    public boolean deleteEmployeeById(int id) {
        if (EmployeeRepository.existsById(id)) {
            EmployeeRepository.deleteById(id);
            return true; // Employee deleted successfully
        }

        return false; // Employee with the given ID not found
    }


}

