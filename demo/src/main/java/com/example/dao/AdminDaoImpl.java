package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.model.Admin;

@Repository
public class AdminDaoImpl {
	
	@Autowired
	public JdbcTemplate jdbctemplate;
	
	public Admin adminLoginCheck(int id,String password) {
		String sql = "select * from admin where id=? and password=?";
		
		List<Admin> admin =  jdbctemplate.query(sql, new Object[] {id,password }, new RowMapper<Admin>() {

			@Override
			public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
				Admin admin=new Admin();
				admin.setId(rs.getInt("id"));
				admin.setName(rs.getString("name"));
				admin.setPassword(rs.getString("password"));
				return admin;
				}
		});
		
		if(admin.isEmpty()) {
			return null;
		}
		return admin.get(0);
		
	}
	
	

}
