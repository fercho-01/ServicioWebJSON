/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.ws;

import com.udea.Pojo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author LUIS
 */
@Path("/json/metallica")
public class JSONService {

    @Context
    private UriInfo context;

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Pojo getTrackInJSON(){
        Pojo track = new Pojo();
        track.setTitle("Enter Sadman");
        track.setSingle("Metallica");
        return track;
    }
    
    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(Pojo track){
        String result = "Track saver "+ track;
        return Response.status(201).entity(result).build();
                
    }
}
