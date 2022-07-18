package com.board.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.board.domain.BoardVo;
import com.board.mapper.BoardMapper;
import com.board.mapper.LoginMapper;

@Controller
public class UserController {
	
	@Autowired
	private LoginMapper loginMapper;
	
	@RequestMapping("/loginProcess")
	public ModelAndView loginprocess() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("redirect:/");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/login");
		return mv;
	}
	
	
	
}
