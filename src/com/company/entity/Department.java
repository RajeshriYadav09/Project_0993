package com.company.entity;

import java.util.Objects;

public class Department {
    private int departmentId;
    private String DepartmentName;

    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        DepartmentName = departmentName;
    }

    public Department() {
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return departmentId == that.departmentId && Objects.equals(DepartmentName, that.DepartmentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentId, DepartmentName);
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", DepartmentName='" + DepartmentName + '\'' +
                '}';
    }
}
