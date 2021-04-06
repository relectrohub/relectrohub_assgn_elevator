package com.project.assignment.resource;

import com.project.assignment.service.DirectionService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import com.project.assignment.model.Elevator;
import java.util.ArrayList;

import javax.ws.rs.core.MediaType;

@Path("direction")
public class DirectionResource {
	
	DirectionService directionservice = new DirectionService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Elevator> getallmessages(){
		
		return DirectionService.getallElevaor(); 
	}
	
}
