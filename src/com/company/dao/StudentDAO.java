package com.company.dao;

import com.company.entity.Student;

import java.util.List;

public interface StudentDAO {
    public abstract void addNewStudent(Student student);
    public abstract void removeStudent(Student student);
    public abstract void updateStudent(Student student);
    public abstract List<Student> showAllStudent();

}
