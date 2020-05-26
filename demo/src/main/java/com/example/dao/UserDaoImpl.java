package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.model.User;

@Repository
public class UserDaoImpl {

	@Autowired
	public JdbcTemplate jdbctemplate;

	public boolean insertUserDetail(User user) {
		System.out.println("-++" + user);
		String sql = "INSERT INTO user 	VALUES (?, ?, ?)";
		System.out.println("***" + jdbctemplate);
		int update = jdbctemplate.update(sql, new Object[] { user.getId(), user.getName(), user.getMobile() });
		if (update > 0) {
			return true;
		}
		return false;
	}

	public List<User> getAllUserDetails() {
		String sql = "select * from user";
		List<User> query = jdbctemplate.query(sql, new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setMobile(rs.getLong("mobile"));
				return user;
			}
		});
		return query;
	}

	public boolean deleteByUserId(int userId) {

		String sql = "delete from user where id=?";
		int update = jdbctemplate.update(sql, userId);
		if (update > 0) {
			return true;
		}
		return false;

	}

	public User getUserById(int id) {
		String sql = "select * from user where id=?";
		User user = (User) jdbctemplate.queryForObject(sql, new Object[] { id }, new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setMobile(rs.getLong("mobile"));
				return user;
			}
		});
		return user;
	}

	public boolean deleteUserById(int id) {
		String sql = "delete from user where id=?";
		int update = jdbctemplate.update(sql, id);
		if (update > 0) {
			return true;
		}
		return false;
	}

	public boolean updateUserById(User user) {
		System.out.println("inside dao >" + user);
		String sql = "update user set name=?,mobile=? where id=?";
		int update = jdbctemplate.update(sql, new Object[] { user.getName(), user.getMobile(), user.getId() });
		if (update > 0) {
			return true;
		}
		return false;
	}
}
