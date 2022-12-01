package com.example.backend.service;

import com.example.backend.bean.Salary;
import com.example.backend.DAO.Impl.SalaryDAOImpl;

import java.util.List;

public class SalaryService {

    static SalaryDAOImpl salaryDAO = new SalaryDAOImpl();

    public static List<Salary> salaryHistory(int e_id) {
        List<Salary> salaryList = salaryDAO.salaryHistory(e_id);

        for(Salary s : salaryList)
            s.setEmployee(null);

        return salaryList;
    }
}
