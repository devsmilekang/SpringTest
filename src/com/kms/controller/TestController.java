package com.kms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kms.dao.TestDao;


@Controller
public class TestController {
	
private TestDao dao;

	public void setDao(TestDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/dbTest.do")  //parameter address
	public ModelAndView dbStart(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",dao.getDbValue());
		mav.addObject("message", "db Spring !!!");
		mav.setViewName("index");
		
		return mav;
	}
}
