package com.yash.cmsapp.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.yash.cmsapp.dao.UserDAO;
import com.yash.cmsapp.domain.Contact;
import com.yash.cmsapp.domain.User;
import com.yash.cmsapp.service.UserService;
import com.yash.cmsapp.util.DBUtil;
/*
 * It it just implementation of each method declared in UserDAO
 */
public class UserDAOImpl extends DBUtil implements UserDAO{
	
	
	@Override
	public void save(User user) {
		String sql="insert into users(name, contact, role, loginname,password) values(?,?,?,?,?)";
		PreparedStatement pstmt=getPreparedStatement(sql);
		try {
			pstmt.setString(1,user.getName());
			pstmt.setString(2,user.getContact());
			pstmt.setInt(3, UserService.ROLE_GUEST_USER);	
			pstmt.setString(4,user.getLoginName());
			pstmt.setString(5,user.getPassword());
			pstmt.executeUpdate();
		} catch (Exception e) {
			
		}
	}

	@Override
	public List<User> findAll() {
		String sql="Select * from users where role=2";
		User user ;
		List<User> list=new ArrayList<User>();
		PreparedStatement pstmt=getPreparedStatement(sql);
		try {
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				user =new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setAddress(rs.getString("address"));
				user.setContact(rs.getString("contact"));
				user.setEmail(rs.getString("email"));
				user.setStatus(rs.getInt("status"));
				list.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
