package com.example.backend.DAO;
import com.example.backend.bean.Employee;
import com.example.backend.bean.Salary;

import java.util.List;

public interface SalaryDAO {
    void createSalary(Salary salary);
    List<Salary> salaryHistory(int e_id);
}
