package org.jcone.separatedFrontEnd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String angularTree(Model model){
		model.addAttribute("name", "World");
		return "/index";
	}
}
