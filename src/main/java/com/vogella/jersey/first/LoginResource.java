package com.vogella.jersey.first;
import com.vogella.jersey.first.Model.Employee;
import com.vogella.jersey.first.Model.Employees;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

/**
 * Created by marti on 13-6-2017.
 */
@Path("login")
public class LoginResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Employees Login() {


        Employees list = new Employees();
        list.setEmployeeList(new ArrayList<Employee>());

        list.getEmployeeList().add(new Employee(1, "Lokesh Gupta"));
        list.getEmployeeList().add(new Employee(2, "Alex Kolenchiskey"));
        list.getEmployeeList().add(new Employee(3, "David Kameron"));

        return list;


    }
}
