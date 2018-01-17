package com.vogella.jersey.first.Model;

import java.util.List;

/**
 * Created by marti on 17-1-2018.
 */
public class Employees
{
    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}