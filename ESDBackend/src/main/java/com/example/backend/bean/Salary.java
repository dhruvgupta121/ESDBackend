package com.example.backend.bean;
import jakarta.persistence.*;

@Entity
public class Salary {
    @Id
    private int id;

    @Column(nullable = false)
    private String payment_date;

    @Column(nullable = false)
    private int amount;

    @Column
    private String description;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Salary() {

    }

    public Salary(int id, String payment_date, int amount, String description) {
        this.id = id;
        this.payment_date = payment_date;
        this.amount = amount;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(String payment_date) {
        this.payment_date = payment_date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
