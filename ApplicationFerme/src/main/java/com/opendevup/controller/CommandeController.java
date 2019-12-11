package com.opendevup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CommandeController {

	
	@RequestMapping(value = "/recapitulatifCommande")
	public String commande(Model model) {

		return "recapitulatifCommande";
	}
	
	@RequestMapping(value = "/commandePoulet")
	public String commandePoulet(Model model) {

		return "commandePoulet";
	}
	
	@RequestMapping(value = "/commandePouletPC")
	public String commandePouletPC(Model model) {

		return "commandePouletPC"; 
	}
	
	@RequestMapping(value = "/commandeCuisse")
	public String commandeCuisse(Model model) {

		return "commandeCuisse";
	}
	
	@RequestMapping(value = "/commandeFillet")
	public String commandeFillet(Model model) {

		return "commandeFillet";
	}
	
	@RequestMapping(value = "/commandeOeuf")
	public String commandeOeuf(Model model) {

		return "commandeOeuf";
	}
	
	@RequestMapping(value = "/commandeAilleP")
	public String commandeAilleP(Model model) {

		return "commandeAilleP";
	}
}
