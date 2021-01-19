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
import com.yash.cmsapp.service.ContactService;
import com.yash.cmsapp.serviceimpl.ContactServiceImpl;

/**
 * Servlet implementation class ContactSeeAllController
 */
@WebServlet("/ContactSeeAllController")
public class ContactSeeAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ContactService contactService=null;
	public ContactSeeAllController() {
		contactService=new ContactServiceImpl();
	}	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session=request.getSession();
		int id=(int)session.getAttribute("id");
		List<Contact> allContacts= contactService.seeAllContact(id);
		if(allContacts==null) {
			response.sendRedirect("./noContactFound.jsp");
		}else {
		session.setAttribute("allContacts", allContacts);
		response.sendRedirect("./seeAllContact.jsp");
		}
	}

}
