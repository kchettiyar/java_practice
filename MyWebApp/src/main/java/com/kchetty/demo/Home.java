package com.kchetty.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {

	@RequestMapping("home")
	public String home(HttpServletRequest req ) {
		HttpSession session = req.getSession();
		System.out.println("Hi " + req.getParameter("name"));
		session.setAttribute("name", req.getParameter("name") + " yes yes yes");
		return "home";
	}
	
	@RequestMapping("mvc")
	public ModelAndView mvc(AlienModel alien) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("mvc");
		return mv;
	}
}
