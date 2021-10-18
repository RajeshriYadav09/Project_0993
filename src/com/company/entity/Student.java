package com.company.entity;

import java.util.Objects;

public class Student {
    private int StudentId;
    private String StudentName;
    private  Department department;

    public Student(int studentId, String studentName, Department department) {
        StudentId = studentId;
        StudentName = studentName;
        this.department = department;
    }

    public Student() {

    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                ", department=" + department +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return StudentId == student.StudentId && StudentName.equals(student.StudentName) && department.equals(student.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(StudentId, StudentName, department);
    }
}
