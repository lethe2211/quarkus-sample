package com.sample;

import com.sample.pojo.ResponseObj;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.jboss.resteasy.reactive.RestPath;

@Path("api")
public class SampleResource {

    @Path("{number}")
    @GET
    public ResponseObj get(@RestPath int number) {
        return new ResponseObj(number, "Hi");
    }
}
