/*
@file        :HelloService.java
@overview    :first simple app for basic understanding of JAX-RS
@author      :Hrishikesh <rishibodake@gmail.com>
@version     :1.0
@since       : 19th May 2020
 */
package org.service.webapp;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/welcome") //path to the API
public class HelloService {

    @GET //Http method which will be hit once path will direct here
    @Path("{clientName}")
    @Produces(MediaType.TEXT_PLAIN)//it denotes that this app will produce simple text
    public Response greetClient(@PathParam("clientName") String name) {
        String output = "Hi " + name;
        return Response.status(200).entity(output).build();
    }
}
