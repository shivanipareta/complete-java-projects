package com.yash.customermvcdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yash.customermvcdemo.daoimpl.CustomerDAOImpl;
import com.yash.customermvcdemo.model.Customer;


@Controller
public class CustomerController {
	@Autowired
	 CustomerDAOImpl customerdaoimpl;
	
	@RequestMapping("/")
	public String index()
	{
	return "index";	
	}
	
	 @RequestMapping("/customerform")    
	    public String showform(Model m){    
	        m.addAttribute("command", new Customer());  
	        return "customerform";   
	    } 
	 @RequestMapping(value="/save",method = RequestMethod.POST)    
	    public String save(@ModelAttribute("customer") Customer customer){    
	    	customerdaoimpl.save(customer);    
	        return "redirect:/viewcustomer";//will redirect to viewemp request mapping    
	    }   
	
	 @RequestMapping("/viewcustomer")    
	    public String viewcustomer(Model m){    
	        List<Customer> list=customerdaoimpl.findAll();    
	        m.addAttribute("list",list);  
	        return "viewcustomer";    
	    }    
	

}
