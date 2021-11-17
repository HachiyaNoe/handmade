package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/etoile")

public class HandmadeController {
	@RequestMapping("/") 
	public String index() {
		return "handmade_site";
	}

}
