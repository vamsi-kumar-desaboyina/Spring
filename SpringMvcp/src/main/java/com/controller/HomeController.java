package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

	@RequestMapping("/hi")
	@ResponseBody
	public String hi()
	{
		return "hi";
	}
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/data")
	public String data(Model model)
	{
		model.addAttribute("name","vamsi");
		return "home";
	}
	@RequestMapping("/signup")
	public String signUp(Model model,HttpServletRequest request)
	{
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		model.addAttribute("email",email);
		model.addAttribute("password",password);
		return "data";
	}
	
}
