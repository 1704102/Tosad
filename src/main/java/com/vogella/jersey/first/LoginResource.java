package com.vogella.jersey.first;

import com.sun.jersey.api.json.JSONWithPadding;
import com.vogella.jersey.first.Model.Employee;
import com.vogella.jersey.first.Model.Employees;
import com.vogella.jersey.first.Model.User;
import com.vogella.jersey.first.database.LoginDatabase;

import javax.json.*;
import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

/**
 * Created by marti on 13-6-2017.
 */
@Path("login")
public class LoginResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String Login() {


        JsonArrayBuilder jab = Json.createArrayBuilder();


            JsonObjectBuilder job = Json.createObjectBuilder();
            job.add("id", "0");
            job.add("username", "martijn");

            jab.add(job);
            JsonArray array = jab.build();




        return "jsonCallback(\n" +
                array.toString() +
                ");";

    }
}