package com.company.client;

import com.company.entity.Department;
import com.company.entity.Student;
import com.company.service.DepartmentService;
import com.company.service.DepartmentServiceImpl;
import com.company.service.StudentService;
import com.company.service.StudentServiceImpl;

import java.util.List;
import java.util.Scanner;

public class StudentDepartmentMain {

    public static void main(String[] args) {

        StudentService studentService = new StudentServiceImpl();
        DepartmentService departmentService = new DepartmentServiceImpl();

        Department d1 = new Department(1,"operational Departmnet");
        Department d2 = new Department(2, "Finance Department");

        studentService.addNewStudent(new Student(1,"sonu yadav",d1));
        studentService.addNewStudent(new Student(2,"konu yadav",d2));

        departmentService.addNewDepartment(d1);
        departmentService.addNewDepartment(d2);

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int choice = 0;
        System.out.print("Do you want to enter Student records(Y/N): ");
        choice = sc1.next().charAt(0);
        int i = (int) choice;
        switch(i){
            case 121:
                System.out.print("how many records do you want to store: ");
                int numberOfRecords = sc1.nextInt();
                for(int j=0 ; j<=numberOfRecords-1;j++){
                    System.out.print("enter Student Id: ");
                    int sId = sc1.nextInt();
                    System.out.print("enter Student Name: ");
                    String sName = sc2.next();
                    System.out.print("enter department Id: ");
                    int dId = sc1.nextInt();
                    System.out.print("enter department Name: ");
                    String dName = sc2.next();
                    Department d11 = new Department(dId,dName);
                    studentService.addNewStudent(new Student(sId,sName,d11));
                }
                break;
            case 110:
                System.out.println("Thank You");
                break;
        }

        System.out.print("Do you want to enter Departmnet records(Y/N): ");
        choice = sc1.next().charAt(0);
        int i1 = (int) choice;
        switch(i1){
            case 121:
                System.out.print("how many records do you want to store: ");
                int numberOfRecords = sc1.nextInt();
                for(int j=0 ; j<=numberOfRecords-1;j++){
                    System.out.print("enter Department Id: ");
                    int dId = sc1.nextInt();
                    System.out.print("enter Department Name: ");
                    String dName = sc2.next();
                    departmentService.addNewDepartment(new Department(dId,dName));
                }
                break;
            case 110:
                System.out.println("Thank You");
                break;
        }
         System.out.println("the student records(Y/N): ");
         choice  = sc1.next().charAt(0);
         int i3 = (int) choice;
         switch(i3){
             case 121:
                 List<Student> studentList = studentService.showAllStudent();
                 for(Student s1 : studentList){
                     Department d11 = s1.getDepartment();
                     System.out.println(s1.getStudentId()+" "+s1.getStudentName()+" "+ d11.getDepartmentId());
                 }
         }

    }
}
