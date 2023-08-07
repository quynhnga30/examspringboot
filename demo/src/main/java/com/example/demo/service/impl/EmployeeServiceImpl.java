package com.example.demo.service.impl;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        try {
            return employeeRepository.save(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public List<Employee> findAllEmployees() {
        try {
            return employeeRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}