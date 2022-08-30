package org.eni.encheres.controller;

import java.util.Locale;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.SessionAttributes;

import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import bo.Utilisateur;

@Controller

@SessionAttributes(names = { "userInSession" })

/**
 * Class controller permettant l'acces aux données puis les redirections
 */
public class ConnexionController {

	private static Logger logger = Logger.getLogger("ConnexionController");
	@Autowired
	private SessionLocaleResolver localeResolver;

	/**
	 * injecte un utilisateur en session 
	 * @return une instance de la class Utilisateur
	 */
	@ModelAttribute("userInSession") // annotation permettant l'ajout de userInSession

	public Utilisateur addMyBean1ToSessionScope() {

		logger.warning("Injection de l'attribut en session");

		return new Utilisateur();

	}

	/**
	 * redirige vers la page pointée sous forme de String en return
	 * @return
	 */
	
	@RequestMapping(value = "/", method = RequestMethod.GET)

	public String accueilExt() {

		return "accueilExterne";

	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)

	public String connecterUtilisateur() {

		return "login";

	}

	

	@RequestMapping(value = "/login", method = RequestMethod.POST)

	public String verifConnectionUtilisateur(@ModelAttribute("userInSession") Utilisateur user) {

		logger.warning("Voici les données saisies par le client : " + user);

		return "accueilInterne";

	}

	@RequestMapping(value = "/deconnexion", method = RequestMethod.GET)

	public String deconnecterUtilisateur(SessionStatus status) {

		status.setComplete();

		return "redirect:/";/*
							 * par défaut, Spring recherche une JSP dans WEB-INF.
							 * 
							 * En utilisant "redirect", on lui passe une URL
							 */

	}

	@RequestMapping(value = "/i18n", method = RequestMethod.GET)
	public String choixDeLaLangue(String lg) {
		Locale locale = new Locale(lg);
		localeResolver.setDefaultLocale(locale);
		return "login";
	}

}
