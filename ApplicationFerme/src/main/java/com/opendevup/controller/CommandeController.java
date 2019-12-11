package com.opendevup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CommandeController {

	
	@RequestMapping(value = "/commandePoulet")
	public String commandePoulet(Model model) {

		return "commandePoulet";
	}
	
	@RequestMapping(value = "/commandePouletPC")
	public String commandePouletPC(Model model) {

		return "commandePouletPC";
	}
}
