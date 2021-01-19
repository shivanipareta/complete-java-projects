package com.yash.cmsapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.cmsapp.service.UserService;
import com.yash.cmsapp.serviceimpl.UserServiceImpl;

/**
 * Servlet implementation class UserBlockingController
 */
@WebServlet("/UserBlockingController")
public class UserBlockingController extends HttpServlet {
	private static final long serialVersionUID = 1L;   
    private UserService userService=null;
    public UserBlockingController() {
    	userService=new UserServiceImpl();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		int i=userService.blockUser(id);
		if(i==1) {
			response.sendRedirect("./adminDashboard.jsp");
		}else {
			response.sendRedirect("./noUserFound.jsp");
		}
	}

}
