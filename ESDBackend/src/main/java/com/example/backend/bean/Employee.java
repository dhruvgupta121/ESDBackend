package com.example.backend.bean;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    private int employee_id;

    @Column(nullable = false)
    private String first_name;

    @Column
    private String last_name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column
    private String title;

    @Column
    private String photograph_path;

    @Column
    private String department;

    @Column
    private String password;

//    @OneToMany(mappedBy = "employee", fetch = FetchType.EAGER)
//    private List<Salary> salaryList;

    public Employee() {

    }



    public Employee(int employee_id, String first_name, String last_name, String email, String password, String title, String photograph_path, String department) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.title = title;
        this.photograph_path = photograph_path;
        this.department = department;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhotograph_path() {
        return photograph_path;
    }

    public void setPhotograph_path(String photograph_path) {
        this.photograph_path = photograph_path;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                ", photograph_path='" + photograph_path + '\'' +
                ", department='" + department + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    //    public List<Salary> getSalaryList() {
//        return salaryList;
//    }
//
//    public void setSalaryList(List<Salary> salaryList) {
//        this.salaryList = salaryList;
//    }
}
