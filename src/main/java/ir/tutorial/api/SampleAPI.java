package ir.tutorial.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/sample")
public class SampleAPI {

    @Path("/hello")
    @GET
    public void sayHello() {
        System.out.println("Hello !");
    }
}
