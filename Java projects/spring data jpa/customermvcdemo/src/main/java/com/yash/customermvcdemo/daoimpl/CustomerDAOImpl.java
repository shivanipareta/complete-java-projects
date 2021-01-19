package com.yash.customermvcdemo.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.customermvcdemo.dao.CustomerDAO;
import com.yash.customermvcdemo.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	 JdbcTemplate template;
	 
	 public void setTemplate(JdbcTemplate template) {  
		    this.template = template;  
		}  

	@Override
	public void save(Customer customer) {
		String sql="insert into Customer(id,name) values("+customer.getId()+",'"+customer.getName()+"')";  	
		template.update(sql);  
	}

	@Override
	public List<Customer> findAll() {
		return template.query("select * from Customer",new RowMapper<Customer>(){    
	        public Customer mapRow(ResultSet rs, int row) throws SQLException {  
		            Customer c=new Customer();    
		            c.setId(rs.getInt(1));    
		            c.setName(rs.getString(2));  
		            
		             
		            return c; 
	}});}

}
