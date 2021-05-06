/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author S542040
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void printingList(List<Employee> list) {
        list.forEach(emp -> {
            System.out.println(emp);
        });
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> arr = new ArrayList<>();
        Employee employee1 = new Employee(10, "IronMan", 9500000);
        Employee employee2 = new Employee(45, "CaptainAmerica", 6500000);
        Employee employee3 = new Employee(18, "Thor", 7500000);
        Employee employee4 = new Employee(7, "Ant Man", 1000000);
        Employee employee5 = new Employee(228, "Flash", 8500000);
        Employee employee6 = new Employee(33, "Arrow", 6000000);
        arr.add(employee1);
        arr.add(employee2);
        arr.add(employee3);
        arr.add(employee4);
        arr.add(employee5);
        arr.add(employee6);
        System.out.println("Printing the values");
        printingList(arr);
        Collections.sort(arr);
        System.out.println("*********************************************");
        System.out.println("*********************************************");
        System.out.println("Sorting w.r.t EMPID");
        System.out.println("*********************************************");
        System.out.println("*********************************************");
        printingList(arr);
        System.out.println("*********************************************");
        System.out.println("*********************************************");
        System.out.println("Sorting w.r.t SALARY");
        System.out.println("*********************************************");
        System.out.println("*********************************************");
        Collections.sort(arr, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return Double.compare(employee1.getEmpSalary(), employee2.getEmpSalary());
            }

        });
        printingList(arr);
        System.out.println("*********************************************");
        System.out.println("*********************************************");
        System.out.println("Sorting w.r.t NAME");
        System.out.println("*********************************************");
        System.out.println("*********************************************");
        Collections.sort(arr, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getEmpName().compareTo(emp2.getEmpName());
            }

        });
        printingList(arr);
        System.out.println("*********************************************");
    }

}

