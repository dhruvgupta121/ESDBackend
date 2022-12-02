package com.example.backend.DAO.Impl;
import com.example.backend.DAO.EmployeeDAO;
import com.example.backend.util.HibernateSessionUtil;
import com.example.backend.bean.Employee;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;


public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public void createEmployee(Employee employee) {
        try (Session session = HibernateSessionUtil.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(employee);
            transaction.commit();
        }
        catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
        }
    }

    @Override
    public Employee login(Employee employee) {
        try (Session session = HibernateSessionUtil.getSession();) {
            String employeeEmail = employee.getEmail();
            String employeePassword = employee.getPassword();

            List<Object> result = new ArrayList<Object>(
                    session.createQuery("FROM Employee WHERE email = :employeeEmail and password =  :employeePassword")
                            .setParameter("employeeEmail", employeeEmail).setParameter("employeePassword", employeePassword)
                            .list());

            if(result.size() == 0) return null;
            else return (Employee) result.get(0);
        }

        catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
        }
        return null;
    }
}
