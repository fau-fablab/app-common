package de.fau.fablab.app.rest.api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Interface for the doorstate
 */
@Path("/doorstate")
@Produces(MediaType.APPLICATION_JSON)
public interface DoorStateApi {

    @GET
    @Path("/update")
    String updateDoorState(@QueryParam("hash") String hash, @QueryParam("data") String data);

}
