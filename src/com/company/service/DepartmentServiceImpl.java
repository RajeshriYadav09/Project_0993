package com.company.service;

import com.company.dao.DepartmentDAO;
import com.company.dao.DepartmentsDAOImpl;
import com.company.entity.Department;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService{
    DepartmentDAO departmentDAO = new DepartmentsDAOImpl();
    @Override
    public void addNewDepartment(Department department) {
        departmentDAO.addNewDepartment(department);
    }

    @Override
    public void removeDepartment(Department department) {
         departmentDAO.removeDepartment(department);
    }

    @Override
    public void updateDepartment(Department department) {
          departmentDAO.updateDepartment(department);
    }

    @Override
    public List<Department> showAllDepartment() {
        return departmentDAO.showAllDepartment();
    }
}
