package com.example.backend.service;

import com.example.backend.bean.Employee;
import com.example.backend.DAO.Impl.EmployeeDAOImpl;

public class EmployeeService {
    static EmployeeDAOImpl employeesDAO = new EmployeeDAOImpl();

    public static Employee login(Employee employee) {
        Employee loggedInEmployee = employeesDAO.login(employee);

        if(loggedInEmployee == null)
            return null;

//        loggedInEmployee.setSalaryList(null);

        return loggedInEmployee;
    }

}

