package com.cabral;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String geRessouces() {

        int a=0, b=0, c;
        c= a/b;
        return "Hello from Quarkus REST"+ c;

    }
}
