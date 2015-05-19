package com.kms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kms.dao.TestDao;

@Controller
public class IndexController {
	
	private TestDao dao;
	
	//spring에서 생성을 위해 필요
	public void setDao(TestDao dao) {
		this.dao = dao;
	}

	@RequestMapping("/index.do")  //parameter address
	public ModelAndView hello(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Hello Spring !!!");
		mav.setViewName("index");
		
		return mav;
	}
	
	@RequestMapping("/dbStart.do")  //parameter address
	public ModelAndView dbStart(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",dao.getDbValue());
		mav.addObject("message", "Hello Spring !!!");
		mav.setViewName("dbList");
		
		return mav;
	}
}
