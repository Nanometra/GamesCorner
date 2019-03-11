package com.projet.managedBeans;

import java.io.Serializable;

import javax.faces.bean.RequestScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.projet.service.IUtilisateurService;

@Controller
@Named("inscription")
@RequestScoped
public class InscriptionBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private IUtilisateurService utilisateurService;
	
	
}
