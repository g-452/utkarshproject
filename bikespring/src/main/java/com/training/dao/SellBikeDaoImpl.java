package com.training.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.training.beans.Bike;
import com.training.beans.SellBike;

@Repository
public class SellBikeDaoImpl implements SellBikeDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public  List<Bike> showdetails(SellBike b) {
		String sql="select * from sellbike1";	
		 List<Bike> blist=jdbcTemplate.query(sql,new RowMapper<Bike>() {

			@Override
			public Bike mapRow(ResultSet rs, int rowNum) throws SQLException {
				SellBike b=new SellBike();
			b.setOwnm(rs.getString(1));
			b.setBnm(rs.getString(2));
			b.setColor(rs.getString(3));
			b.setDate(rs.getString(4));
			b.setDesc(rs.getString(5));
			b.setScost(rs.getString(6));
			b.setNegotiable(rs.getString(7));
			System.out.println(b);
			return b;
			
			}
			
		});	
		 return blist;
	
	}

	@Override
	public void insertdetails(SellBike b) {
		String sql="insert into sellbike1 values(?,?,?,?,?,?,?)"; 
		
	}
	
}
