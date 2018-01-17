package com.vogella.jersey.first;


import com.sun.jersey.api.json.JSONWithPadding;

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
    public JSONWithPadding Login() {

        ArrayList<String> orders = new ArrayList<String>();
        orders.add("hello");

        return new JSONWithPadding(new GenericEntity<ArrayList<String>>(orders){});


    }
}
