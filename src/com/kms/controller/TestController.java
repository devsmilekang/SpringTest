package com.kms.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kms.dao.TestDao;
import com.kms.model.TestModel;


@Controller
public class TestController {
	
private TestDao dao;

	public void setDao(TestDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/jstl.do")  
	public ModelAndView dbStart(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",dao.getDbValue());
		mav.addObject("message", "db Spring !!!");
		mav.setViewName("jstlTest");
		
		return mav;
	}
	
	@RequestMapping("/list.do")
	public ModelAndView list(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",dao.getDbValue());
		mav.addObject("message", "db Spring !!!");
		mav.setViewName("list");		
		return mav;
	}
	
	@RequestMapping("/insert.do")
	public String insertValue(@Valid TestModel testModel, BindingResult result){
		System.out.println(result.getObjectName());
		if(result.hasErrors()){
			 List<ObjectError> list = result.getAllErrors();
	            for (ObjectError e : list) {
	            	System.out.println(" ObjectError : " + e);
	            }

			return "list";
		}
		
		return "redirect:/index.do";
	}
}
