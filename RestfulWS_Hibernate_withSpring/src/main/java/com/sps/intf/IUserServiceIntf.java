package com.sps.intf;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.sps.entity.Person;

@Produces("application/json")
@Consumes("application/json")
public interface IUserServiceIntf {
	
	@GET
	@Path("/getUser/{id}")
	public Person getUser(@PathParam("id") Integer id);
	
	
	@POST
	@Path("/saveUsers")
	public Person saveUser(Person person);
}
