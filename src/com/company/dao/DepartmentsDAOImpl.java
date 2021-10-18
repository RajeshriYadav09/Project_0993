package com.company.dao;

import com.company.entity.Department;
import com.company.exception.DepartmentNotFoundException;

import java.util.LinkedList;
import java.util.List;

public class DepartmentsDAOImpl implements DepartmentDAO{
    List<Department> departmentList = new LinkedList<>();

    @Override
    public void addNewDepartment(Department department) {
          departmentList.add(department);
    }

    @Override
    public void removeDepartment(Department department) {
      if(!departmentList.contains(department)){
          try {
              throw new DepartmentNotFoundException();
          } catch (DepartmentNotFoundException e) {
              e.printStackTrace();
          }
      }
      departmentList.remove(department);
    }

    @Override
    public void updateDepartment(Department department) {
        if(!departmentList.contains(department)){
            try {
                throw new DepartmentNotFoundException();
            } catch (DepartmentNotFoundException e) {
                e.printStackTrace();
            }
        }
        int index  = departmentList.indexOf(department);
        departmentList.set(index, department);
    }

    @Override
    public List<Department> showAllDepartment() {
        System.out.println("here teh list of departments:");
        return departmentList;
    }
}
