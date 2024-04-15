package cn.edu.nwpu.software.strik0r.person;

enum Grade {
    FRESHMAN,
    SOPHOMORE,
    JUNIOR,
    SENIOR
}

public class Student extends Person {
    private Grade grade;

    public Student(String name, String address, String telephone, String email, Grade grade) {
        super(name, address, telephone, email);
        this.grade = grade;
    }

    public Student(Grade grade) {
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
