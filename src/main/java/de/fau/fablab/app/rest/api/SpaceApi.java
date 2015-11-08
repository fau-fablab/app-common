package de.fau.fablab.app.rest.api;

import net.spaceapi.HackerSpace;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Interface for accessing our local SpaceAPI representation
 * Information about SpaceAPI: https://spaceapi.net/
 */
@Path("/spaceapi")
@Produces(MediaType.APPLICATION_JSON)
public interface SpaceApi {

    @GET
    @Path("/spaces/{space}")
    @Produces(MediaType.APPLICATION_JSON)
    HackerSpace getSpace(@PathParam("space") String space);

}
