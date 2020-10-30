package com.simpleChess.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SimpleChess {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		return new ModelAndView("welcome", "message", "test");
	}
	
	
	@RequestMapping("/chessgame")
	public ModelAndView chess() {
		return new ModelAndView("chessgame", "message", "test");
	}

}
