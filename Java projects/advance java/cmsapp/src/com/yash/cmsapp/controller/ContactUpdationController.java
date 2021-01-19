package com.yash.cmsapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.cmsapp.domain.Contact;
import com.yash.cmsapp.domain.User;
import com.yash.cmsapp.service.ContactService;
import com.yash.cmsapp.serviceimpl.ContactServiceImpl;

/**
 * Servlet implementation class ContactUpdationController
 */
@WebServlet("/ContactUpdationController")
public class ContactUpdationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ContactService contactService=null;
	public ContactUpdationController() {
		contactService=new ContactServiceImpl();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("name").equals("")||request.getParameter("contact").equals("")) {
			response.sendRedirect("./noDataEntered.jsp");	
		}else {
			Contact contact=new Contact();
			contact.setName(request.getParameter("name"));
			contact.setContact(request.getParameter("contact"));
			contact.setAddress(request.getParameter("address"));
			contact.setEmail(request.getParameter("email"));
			HttpSession session=request.getSession();
			//getting contact id of contact that is going to updated and getting user Id.
			int id=(int)session.getAttribute("contactId");
			contact.setId(id);
			contact.setUserId((int)session.getAttribute("id"));
			//sharing model with service
			contactService.editContact(contact);
			// redirecting on view 
			response.sendRedirect("./userDashboard.jsp");
		}

	}

}
