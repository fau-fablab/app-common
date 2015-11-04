package de.fau.fablab.app.rest.api;

import de.fau.fablab.app.rest.core.PlatformType;
import de.fau.fablab.app.rest.core.UpdateStatus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Api to check for newer application version.
 */
@Path("versionCheck")
public interface VersionCheckApi {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    UpdateStatus checkVersion(@QueryParam("platformType") PlatformType platformType, @QueryParam("currentVersion") int currentVersion);
}
