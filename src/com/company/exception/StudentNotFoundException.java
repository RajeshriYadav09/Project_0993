package com.company.exception;

public class StudentNotFoundException extends  Exception{

    private int studentId;

    public StudentNotFoundException(int studentId) {
        this.studentId = studentId;
    }

    public StudentNotFoundException() {
    }

    @Override
    public String toString() {
        return "StudentNotFoundException{" +
                "studentId=" + studentId +
                '}';
    }
}
