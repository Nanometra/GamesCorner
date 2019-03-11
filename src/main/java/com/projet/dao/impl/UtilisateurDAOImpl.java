package com.projet.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.projet.dao.IUtilisateurDAO;
import com.projet.entities.Utilisateur;

@Component
public class UtilisateurDAOImpl implements IUtilisateurDAO {

	@Override
	public Utilisateur findById(Integer id) {
		return null;
	}

	@Override
	public List<Utilisateur> findAll() {
		return null;
	}

	@Override
	public void add(Utilisateur entity) {
		
	}

	@Override
	public void delete(Integer id) {
		
	}

	@Override
	public Utilisateur update(Utilisateur entity) {
		return null;
	}

}
