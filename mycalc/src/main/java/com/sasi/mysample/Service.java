package com.sasi.mysample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Date;

@Path("/mycalc")
public class Service {

    @GET
    @Path("ping")
    @Produces(MediaType.TEXT_PLAIN)
    public String ping() {
        return "Welcome to Java Maven Calculator Web App!!!\n" + new Date().toString();
    }

    @GET
    @Path("add")
    @Produces(MediaType.APPLICATION_JSON)
    public MyResponse Add(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new MyResponse(x, y, x + y);
    }

    @GET
    @Path("sub")
    @Produces(MediaType.APPLICATION_JSON)
    public MyResponse Sub(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new MyResponse(x, y, x - y);
    }

    @GET
    @Path("mul")
    @Produces(MediaType.APPLICATION_JSON)
    public MyResponse Mul(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new MyResponse(x, y, x * y);
    }

    @GET
    @Path("div")
    @Produces(MediaType.APPLICATION_JSON)
    public MyResponse Div(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new MyResponse(x, y, x / y);
    }
}