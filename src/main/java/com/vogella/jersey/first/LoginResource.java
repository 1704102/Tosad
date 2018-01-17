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

        return "jsonCallback(\n" +
                "{\n" +
                "    \"sites\":\n" +
                "    [\n" +
                "        {\n" +
                "            \"siteName\": \"JQUERY4U\",\n" +
                "            \"domainName\": \"http://www.jquery4u.com\",\n" +
                "            \"description\": \"#1 jQuery Blog for your Daily News, Plugins, Tuts/Tips &amp; Code Snippets.\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"siteName\": \"BLOGOOLA\",\n" +
                "            \"domainName\": \"http://www.blogoola.com\",\n" +
                "            \"description\": \"Expose your blog to millions and increase your audience.\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"siteName\": \"PHPSCRIPTS4U\",\n" +
                "            \"domainName\": \"http://www.phpscripts4u.com\",\n" +
                "            \"description\": \"The Blog of Enthusiastic PHP Scripters\"\n" +
                "        }\n" +
                "    ]\n" +
                "});";

    }
}