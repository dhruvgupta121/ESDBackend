package com.example.backend.util;
import com.example.backend.bean.Employee;
import com.example.backend.bean.Salary;
import com.example.backend.DAO.Impl.EmployeeDAOImpl;
import com.example.backend.DAO.Impl.SalaryDAOImpl;
import com.example.backend.DAO.SalaryDAO;
import com.example.backend.DAO.EmployeeDAO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class InitializeDB {
    public static void main(String args[]){

        List<List<Object>> employees = Arrays.asList(
                Arrays.asList(1, "Gaurav", "Tilokani", "gaurav@gmail.com", "Faculty", "xyz", "Machine Learning"),
                Arrays.asList(2, "Jayant", "Mukundam", "jayant@gmail.com", "Faculty", "xyz", "Machine Learning"),
                Arrays.asList(3, "Jay", "Parekh", "jay@gmail.com", "Faculty", "xyz", "Screenshot Learning"),
                Arrays.asList(4, "Tushar", "Nagpal", "tushar@gmail.com", "Faculty", "xyz", "Software Systems"),
                Arrays.asList(5, "Nishit", "Chechani", "nishit@gmail.com", "Faculty", "xyz", "FGPA")
        );

        List<List<Object>> salaries = Arrays.asList(
                Arrays.asList(1, "2021-10-10", 5000, "Good Work"),
                Arrays.asList(2, "2021-10-11", 5000, "Good Work"),
                Arrays.asList(3, "2021-10-12", 5000, "Good Work"),

                Arrays.asList(4, "2021-10-10", 5000, "Good Work"),
                Arrays.asList(5, "2021-10-11", 5000, "Good Work"),
                Arrays.asList(6, "2021-10-12", 5000, "Good Work"),

                Arrays.asList(7, "2021-10-10", 5000, "Good Work"),
                Arrays.asList(8, "2021-10-11", 5000, "Good Work"),
                Arrays.asList(9, "2021-10-12", 5000, "Good Work"),

                Arrays.asList(10, "2021-10-10", 5000, "Good Work"),
                Arrays.asList(11, "2021-11-10", 5000, "Good Work"),
                Arrays.asList(12, "2021-12-10", 5000, "Good Work"),

                Arrays.asList(13, "2021-10-10", 5000, "Good Work"),
                Arrays.asList(14, "2021-11-10", 5000, "Good Work"),
                Arrays.asList(15, "2021-12-10", 5000, "Good Work")
        );

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        SalaryDAO salaryDAO = new SalaryDAOImpl();

        List<Salary> salaryList = new ArrayList<>();

        for(List<Object> salary : salaries) {
            Salary salaryObj = new Salary((Integer) salary.get(0),(String)salary.get(1),(Integer) salary.get(2), (String)salary.get(3));
            salaryList.add(salaryObj);
        }

//        for(int i = 0; i < employees.size(); i++) {
//            List<Object> employee = employees.get(i);
////            Employee employeeObj = new Employee((Integer) employee.get(0), (String)employee.get(1), (String)employee.get(2), (String)employee.get(3), (String)employee.get(4), (String)employee.get(5), (String)employee.get(6));
//
//            salaryList.get(i*3).setEmployee(employeeObj);
//            salaryList.get(i*3+1).setEmployee(employeeObj);
//            salaryList.get(i*3+2).setEmployee(employeeObj);
//
//            employeeDAO.createEmployee(employeeObj);
//            salaryDAO.createSalary(salaryList.get(i*3));
//            salaryDAO.createSalary(salaryList.get(i*3+1));
//            salaryDAO.createSalary(salaryList.get(i*3+2));
//        }
    }
}
