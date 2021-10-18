package com.company.service;

import com.company.entity.Student;

import java.util.List;

public interface StudentService {
    public abstract void addNewStudent(Student student);
    public abstract void removeStudent(Student student);
    public abstract void updateStudent(Student student);
    public abstract List<Student> showAllStudent();
}
