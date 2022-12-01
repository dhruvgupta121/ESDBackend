package com.example.backend.DAO.Impl;
import com.example.backend.DAO.SalaryDAO;
import com.example.backend.bean.Employee;
import com.example.backend.bean.Salary;
import com.example.backend.util.HibernateSessionUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class SalaryDAOImpl implements SalaryDAO {

    @Override
    public void createSalary(Salary salary) {
        try (Session session = HibernateSessionUtil.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(salary);
            transaction.commit();
        }
        catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
        }
    }

//    @Override
//    public List<Salary> salaryHistory(int e_id) {
//        try (Session session = HibernateSessionUtil.getSession()) {
//            List<Salary> salaryList = new ArrayList<>();
//            Query q = session.createQuery("from Salary where employee_id =: e_id");
//            q.setParameter("e_id", e_id);
//
//                salaryList.add((Salary) salary);
//        }
//        catch (HibernateException exception) {
//            System.out.println(exception.getLocalizedMessage());
//        }
//        return salaryList;
//    }

    @Override
    public List<Salary> salaryHistory(int e_id) {
        List<Salary> salaryList = new ArrayList<>();
        try (Session session = HibernateSessionUtil.getSession()) {
            for(
                    final Object salary : session
                    .createQuery("FROM Salary WHERE employee.employee_id =: e_id")
                    .setParameter("e_id", e_id).list()
            )
                salaryList.add((Salary) salary);
        }
        catch (HibernateException exception) {
            System.out.println(exception.getLocalizedMessage());
        }
        return salaryList;
    }
}
