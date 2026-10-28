package com.abes.hrmsDatabaseh2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private long emp_id;
    private String emp_name;

    public long getEmp_id() {
        return emp_id;
    }
    
    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Employee(long emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }
}
