package com.vogella.jersey.first;

import com.vogella.jersey.first.DOA.OracleConnector;

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


        OracleConnector c = new OracleConnector("jdbc:oracle:thin:https://ondora02.hu.nl:8080/ords/", "", "tosad_2017_2b_team5_target", "tosad_2017_2b_team5_target");
        JsonArrayBuilder jab = Json.createArrayBuilder();


            JsonObjectBuilder job = Json.createObjectBuilder();
            job.add("id", "0");
            job.add("username", "martijn");

            jab.add(job);
        job.add("id", "1");
        job.add("username", "Jan");

        jab.add(job);
        JsonObjectBuilder job2 = Json.createObjectBuilder();
        job2.add("employees", jab);
            JsonObject array = job2.build();




        return "0,martijn" + "\n" + "1,jan";


    }
}