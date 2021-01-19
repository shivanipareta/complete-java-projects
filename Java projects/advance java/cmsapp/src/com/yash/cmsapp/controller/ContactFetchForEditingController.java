package com.yash.cmsapp.controller;

import java.io.IOException;
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
 * Servlet implementation class ContactFetchForEditingController
 */
@WebServlet("/ContactFetchForEditingController")
public class ContactFetchForEditingController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ContactService contactService=null;
	public ContactFetchForEditingController() {
		contactService=new ContactServiceImpl();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		Contact contact=new Contact();
		contact=contactService.searchContact(id);
		if(contact==null) {
			response.sendRedirect("./noContactFound.jsp");
		}else {
			HttpSession session=request.getSession();
			session.setAttribute("contactId", contact.getId());
			response.sendRedirect("./displayContactForEditing.jsp");
		}
	}

}
