package com.dawes.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MenuController {

	@RequestMapping("/index")
	public String menuPrincipal() {
		return "index";
	}
}
