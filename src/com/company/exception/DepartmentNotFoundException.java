package com.company.exception;

public class DepartmentNotFoundException extends Exception{
    private int departmentId;

    public DepartmentNotFoundException(int departmentId) {
        this.departmentId = departmentId;
    }

    public DepartmentNotFoundException() {
    }

    @Override
    public String
    toString() {
        return "DepartmentNotFoundException{" +
                "departmentId=" + departmentId +
                '}';
    }
}
