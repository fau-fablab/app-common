package de.fau.fablab.app.rest.api;

import de.fau.fablab.app.rest.core.FabTool;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("drupal")
public interface DrupalApi {

    @GET
    @Path("/tools")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    List<FabTool> findAllTools();

    @GET
    @Path("/tools/{id}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    FabTool findToolById(@PathParam("id")long id);
}
