package com.app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.UserDao;
import com.app.dto.RegisterDto;


public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RegistrationController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RegisterDto dto = new RegisterDto();
		dto.setFirstName(request.getParameter("firstName"));
		dto.setLastName(request.getParameter("lastName"));
		dto.setPassword(request.getParameter("password"));
		dto.setUsername(request.getParameter("username"));
		dto.setPhneNumber(request.getParameter("phneNumber"));
		dto.setGender(request.getParameter("gender"));
		
		UserDao dao = new UserDao();
		Boolean flag = dao.register(dto);
		
		if(flag)
		{
			RequestDispatcher rd = request.getRequestDispatcher("sucess.html");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.forward(request, response);
		}
		
	}

}
