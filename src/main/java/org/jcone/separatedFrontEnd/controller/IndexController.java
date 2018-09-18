package org.jcone.separatedFrontEnd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * [Acts 1:8]
 * But you will receive power when the Holy Spirit comes on you;
 * and you will be my witnesses in Jerusalem,
 * and in all Judea and Samaria,
 * and to the ends of the earth.
 */
@Controller
public class IndexController {
	
	/**
	 * [Matthew 28:19-20]
	 * Therefore go and make disciples of all nations,
	 * baptizing them in the name of the Father and of the Son and of the Holy Spirit,
	 * and teaching them to obey everything I have commanded you.
	 * And surely I am with you always, to the very end of the age.
	 */
	@RequestMapping("/")
	public String angularTree(Model model){
		model.addAttribute("name", "World");
		return "/index";
	}
}
