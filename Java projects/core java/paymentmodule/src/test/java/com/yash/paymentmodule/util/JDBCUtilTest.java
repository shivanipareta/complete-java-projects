package com.yash.paymentmodule.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
/**
 * This is an Test class of JDBC connection
 * @author admin
 *
 */
public class JDBCUtilTest {
	
	private JDBCUtil jdbcutil=null;
	@Before
	public void setup() {
		jdbcutil=new JDBCUtil();
	}
@Test
public void test_connect_ShouldReturnConnectionObject() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
 Method method=JDBCUtil.class.getDeclaredMethod("connect");
 method.setAccessible(true);
 JDBCUtil jdbcutil=new JDBCUtil();
 Connection con=(Connection) method.invoke(jdbcutil);
 assertTrue(con!=null);
 }

@Test
public void test_PreparedStatement_ShouldReturnPreparedStatementObject() throws SQLException {
	PreparedStatement pstmt=jdbcutil.getPreparedStatement("insert into payments(payment,discount,created_At,updated_At,userId,palnId) values(1000,0,null,null,110,11)");
	assertTrue(pstmt!=null);
}


}
