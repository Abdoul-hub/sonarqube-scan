package com.cabral;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/hello")
public class ExampleResource {

    private static String message;

    @GET
    public String hello() {
        String hello = "Hello World!";
        String hello2 = "Hello World!";
        return "Hello from Quarkus REST";
    }

    @GET
    @Path("/npe")
    public String npe() {
        String test = null;
        return test.toString(); // NPE
    }

    @GET
    @Path("/exception")
    public String exception() {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
        }
        return "done";
    }

    @GET
    @Path("/sql")
    public String sql(@QueryParam("id") String id) {
        String query = "SELECT * FROM users WHERE id = " + id;
        return query;
    }

    @GET
    @Path("/complex")
    public String complex(@QueryParam("n") int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (i % 3 == 0) {
                    if (i % 5 == 0) {
                        result += i;
                    } else {
                        result -= i;
                    }
                } else {
                    result += i * 2;
                }
            } else {
                result -= i * 2;
            }
        }
        return String.valueOf(result);
    }

    @GET
    @Path("/config")
    public String config() {
        String password = "admin123";
        return password;
    }

    @GET
    @Path("/update")
    public String update() {
        message = "updated";
        return "updated";
    }

    @GET
    @Path("/concat")
    public String concat() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            result = result + i;
        }
        return result;
    }

}
