package com.company.service;

import com.company.entity.Department;

import java.util.List;

public interface DepartmentService {
    public abstract void addNewDepartment(Department department);
    public abstract void removeDepartment(Department department);
    public abstract void updateDepartment(Department department);
    public abstract List<Department> showAllDepartment();
}
