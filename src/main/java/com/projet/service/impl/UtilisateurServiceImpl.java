package com.projet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.dao.IUtilisateurDAO;
import com.projet.entities.Utilisateur;
import com.projet.service.IUtilisateurService;

@Service
public class UtilisateurServiceImpl implements IUtilisateurService {

	@Autowired
	private IUtilisateurDAO utilisateurDAO;
		
	@Override
	public Utilisateur findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Utilisateur> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Utilisateur entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Utilisateur update(Utilisateur entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
