package com.menu.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.menu.entity.Menu;

public class MenuDaoImpl  {
//connect with database
	//execute sql queries
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public void createMenu(Menu m) {
		
		String sql="insert into menu(menuName,prise,quantity)values('"+m.getMenuName()+"','"+m.getPrise()+"','"+m.getQuantity()+"')";
		jdbcTemplate.update(sql);
		System.out.println("Data inserted successfully");
	}


	public Menu getMenuById(int id) {
		
		String sql="select * from menu where menuid=?";
		return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) ->
        new Menu(
                rs.getInt("menuid"),
                rs.getString("menuName"),
                rs.getInt("prise"),
                rs.getInt("quantity")
        ));
	}


	public List<Menu> listMenus() {
		
		String sql="select * from menu";
		List<Menu>menus=jdbcTemplate.query(sql,new MenuMapper());
		return menus;
	}


	public void updateMenu(Menu e){
		String query="update menu set menuName=?, prise=?,quantity=? where menuid=?";
		 jdbcTemplate.update(query,e.getMenuName(),e.getPrise(), e.getQuantity(),e.getId());
		 System.out.println(" Record Updated successfully");
	}

	public int deleteMenu(Menu m) {
		String query="delete from menu where menuid='"+m.getId()+"' ";
		return jdbcTemplate.update(query);
		
	}

}
