package com.app.controller;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public Response login()
	{
		return Response.status(Status.OK).entity("Login").build();
	}
}
