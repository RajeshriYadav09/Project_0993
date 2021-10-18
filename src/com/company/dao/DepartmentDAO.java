package com.company.dao;

import com.company.entity.Department;

import java.util.List;

public interface DepartmentDAO {
    public abstract void addNewDepartment(Department department);
    public abstract void removeDepartment(Department department);
    public abstract void updateDepartment(Department department);
    public abstract List<Department> showAllDepartment();
}
