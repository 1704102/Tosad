package com.vogella.jersey.first;

import com.vogella.jersey.first.Model.Employee;
import com.vogella.jersey.first.Model.Employees;
import com.vogella.jersey.first.Model.User;
import com.vogella.jersey.first.database.LoginDatabase;

import javax.json.*;
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
    public String Login() {

        JsonObject json = Json.createObjectBuilder()
                .add("name", "Falco")
                .add("age", "38")
                .add("biteable", "true").build();
        String result = json.toString();
        return result;

    }
}