package com.example.backend.util;
import com.example.backend.bean.Employee;
import com.example.backend.DAO.EmployeeDAO;
import com.example.backend.DAO.Impl.EmployeeDAOImpl;
import com.example.backend.bean.Salary;
import com.example.backend.DAO.SalaryDAO;
import com.example.backend.DAO.Impl.SalaryDAOImpl;


public class Check {
    public static void main(String [] args) {
//        Employee e1 = new Employee();
//        e1.setEmail("jay@gmail.com");
//        EmployeeDAO e = new EmployeeDAOImpl();
//        Employee e2 = e.login(e1);
        SalaryDAO s = new SalaryDAOImpl();
        System.out.println(s.salaryHistory(1));
    }
}
