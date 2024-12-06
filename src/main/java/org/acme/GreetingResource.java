package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.time.LocalTime;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public DTO hello() {
        return new DTO()
          .setName("Hello from Quarkus REST")
          .setLocalTime(LocalTime.now());
    }
}
