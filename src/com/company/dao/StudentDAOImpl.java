package com.company.dao;

import com.company.entity.Student;
import com.company.exception.StudentNotFoundException;

import java.util.LinkedList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO{

    List<Student> studentList = new LinkedList<>();

    @Override
    public void addNewStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void removeStudent(Student student) {
         if(!studentList.contains(student)){
             try {
                 throw new StudentNotFoundException();
             } catch (StudentNotFoundException e) {
                 e.printStackTrace();
             }
         }
         studentList.remove(student);
    }

    @Override
    public void updateStudent(Student student) {
        if(!studentList.contains(student)){
            try {
                throw new StudentNotFoundException();
            } catch (StudentNotFoundException e) {
                e.printStackTrace();
            }
        }
        int index = studentList.indexOf(student);
        studentList.set(index,student);
    }

    @Override
    public List<Student> showAllStudent() {
        System.out.println("Here the list of student:");
        return studentList;
    }
}
