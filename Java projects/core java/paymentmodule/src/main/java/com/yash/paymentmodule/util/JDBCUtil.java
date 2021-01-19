package com.yash.paymentmodule.util;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * This class is used to provide utility for DataBase connection
 * @author admin
 *
 */
public class JDBCUtil {
	private static Connection con=null;
	private static PreparedStatement pstmt=null;

	private  Connection connect() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nutritionapp","Shivani Pareta","root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
		catch (SQLException e) {
			e.printStackTrace();

		}
		return con;

	}
	public  PreparedStatement getPreparedStatement(String sql) throws SQLException {
		try{
			pstmt=connect().prepareStatement(sql);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return pstmt;

	}
	public void closePreparedStatement() throws SQLException{
		con.close();
	}
	public void closeConnection() throws SQLException{
		pstmt.close();
	}

}




