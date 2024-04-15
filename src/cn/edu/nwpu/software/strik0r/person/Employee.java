package cn.edu.nwpu.software.strik0r.person;

import java.util.Date;

public class Employee extends Person {
    String Office;
    int salary;
    Date dateOfEmploy;

    public Employee(String name, String address, String telephone, String email, String office, int salary, Date dateOfEmploy) {
        super(name, address, telephone, email);
        Office = office;
        this.salary = salary;
        this.dateOfEmploy = dateOfEmploy;
    }

    public Employee() {
    }

    public String getOffice() {
        return Office;
    }

    public void setOffice(String office) {
        Office = office;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getDateOfEmploy() {
        return dateOfEmploy;
    }

    public void setDateOfEmploy(Date dateOfEmploy) {
        this.dateOfEmploy = dateOfEmploy;
    }
}
