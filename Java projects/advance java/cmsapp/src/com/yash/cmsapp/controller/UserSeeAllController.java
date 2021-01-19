package com.yash.cmsapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.cmsapp.domain.Contact;
import com.yash.cmsapp.domain.User;
import com.yash.cmsapp.service.UserService;
import com.yash.cmsapp.serviceimpl.UserServiceImpl;

/**
 * Servlet implementation class UserSeeAllController
 */
@WebServlet("/UserSeeAllController")
public class UserSeeAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private UserService userService=null;
       public UserSeeAllController() {
    	   userService=new UserServiceImpl();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		List<User> allUsers= userService.listAllUser();
		if(allUsers==null) {
			response.sendRedirect("./noUserFound.jsp");
		}else {
		session.setAttribute("allUsers", allUsers);
		response.sendRedirect("./seeAllUser.jsp");
		}
	}

}
