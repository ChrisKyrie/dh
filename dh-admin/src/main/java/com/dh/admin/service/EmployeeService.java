package com.dh.admin.service;

import com.dh.admin.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> listEmployee();

    void testAsyncTask();
}
