package com.opendevup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.opendevup.model.Client;
import com.opendevup.repository.ClientRepository;


@Controller
public class ClientController {


    @Autowired
    ClientRepository clientRepository;
/*
	@RequestMapping(value = "/")
	public String acceuil(Model model) {

		return "redirect:/index";
	}
	*/

    @RequestMapping(value = "/inscription", method = RequestMethod.GET)
    public String inscription(Model model) {
        model.addAttribute("client", new Client());
        return "inscription";
    }

    @RequestMapping(value = "/saveClient", method = RequestMethod.POST)
    public String save(Model model, Client c) {

        clientRepository.save(c);
        return "confirmationInscription";
    }

    @RequestMapping(value = "/connexion")
    public String connexion(Model model) {

        return "connexion";
    }

    @RequestMapping(value = "/home")
    public String home(Model model) {

        return "home";
    }

    @RequestMapping(value = "/register")
    public String register(Model model) {

        return "register";
    }

    @RequestMapping(value = "/InfoVisite")
    public String InfoVisite(Model model) {

        return "infoVisite";
    }

    @RequestMapping(value = "/Livraison")
    public String Livraison(Model model) {

        return "livraison";
    }

    @RequestMapping(value = "/Commander")
    public String Commander(Model model) {

        return "commander";
    }
}
