package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.beans.Bike;
import com.training.beans.SellBike;
import com.training.service.SellBikeService;

@Controller
public class SellBikeController {
	@Autowired
	private SellBikeService  sellBikeService;
	
	@RequestMapping("/")
	public String welcome()
	{
		return "index";
	}
	
	@RequestMapping("/sellbike")
	public String sellBike()
	{
		return "accpetdetails";
		
	}
	@RequestMapping("/showdetails")
	public ModelAndView showdetails(@RequestParam("nm")String nm,@RequestParam("select")String select,@RequestParam("color")String color,@RequestParam("date")String date,@RequestParam("desc")String desc,@RequestParam("scost")String scost,@RequestParam("chk")String chk )
	{
		SellBike b=new SellBike(nm,select,color,date,desc,chk,scost);
		System.out.println(b);
		sellBikeService.insertdetails(b);
		return new ModelAndView("showsellbike");
		
	}
	
	@RequestMapping("/buybike")
	public String buybike()
	{
		return "buybike";
	}

	@RequestMapping("/showbikes")
	public String showbikes() {
		return "showdata";
	}
	
}
