package ir.tutorial.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/bank")
public class BankAPI {

    @Path("/code")
    @GET
    public Response getBankCode() {
        return Response.ok().entity("123244").build();
    }
}
