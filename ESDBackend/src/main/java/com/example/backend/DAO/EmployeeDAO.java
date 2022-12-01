package com.example.backend.DAO;
import com.example.backend.bean.Employee;

public interface EmployeeDAO {
    void createEmployee(Employee employee);
    Employee login(Employee employee);
}
