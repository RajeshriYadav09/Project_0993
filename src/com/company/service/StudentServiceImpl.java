package com.company.service;

import com.company.dao.StudentDAO;
import com.company.dao.StudentDAOImpl;
import com.company.entity.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    StudentDAO studentDAO = new StudentDAOImpl();
    @Override
    public void addNewStudent(Student student) {
        studentDAO.addNewStudent(student);
    }

    @Override
    public void removeStudent(Student student) {
        studentDAO.removeStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentDAO.updateStudent(student);
    }

    @Override
    public List<Student> showAllStudent() {
        return studentDAO.showAllStudent();
    }
}
