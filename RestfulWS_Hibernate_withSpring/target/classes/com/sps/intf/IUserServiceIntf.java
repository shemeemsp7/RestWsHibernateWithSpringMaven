package com.sps.intf;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.sps.entity.Person;

@Produces("application/json")
@Consumes("application/json")
public interface IUserServiceIntf {
	@GET
	@Path("/getUsers")
	public Person getUsers();
	
	
	@POST
	@Path("/saveUsers")
	public Person saveUser(Person person);
}
