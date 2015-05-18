package com.kms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	
	@RequestMapping("/index.do")  //parameter address
	public ModelAndView hello(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Hello Spring !!!");
		mav.setViewName("index");
		
		return mav;
	}
}
