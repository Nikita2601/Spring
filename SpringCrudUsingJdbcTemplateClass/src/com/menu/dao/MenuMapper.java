package com.menu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.menu.entity.Menu;

public class MenuMapper implements RowMapper<Menu> {

	@Override
	public Menu mapRow(ResultSet rs, int rowNum) throws SQLException {
		Menu m=new Menu();
		m.setId(rs.getInt("menuid"));
		m.setMenuName(rs.getString("menuName"));
		m.setPrise(rs.getInt("prise"));
		m.setQuantity(rs.getInt("quantity"));
		return m;
	}

}
