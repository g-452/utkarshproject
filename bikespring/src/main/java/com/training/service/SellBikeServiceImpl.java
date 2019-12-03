package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.beans.Bike;
import com.training.beans.SellBike;
import com.training.dao.SellBikeDao;

@Service
public class SellBikeServiceImpl implements SellBikeService{
	@Autowired
	private SellBikeDao sellBikeDao;

	public void showdetails(SellBike b) {
		 sellBikeDao.showdetails(b);
		
		
	}

	public List<Bike> showdetails() {
		
		return null;
	}

	@Override
	public void insertdetails(SellBike b) {
		sellBikeDao.insertdetails(b);
		
	}
	
	
}
