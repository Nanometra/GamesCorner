package com.projet.entities;

import javax.persistence.Entity;
import javax.persistence.Enumerated;

import com.projet.enums.GenreSociete;

@Entity
public class JeuxSociete extends Article {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Enumerated
	private GenreSociete societe;

	public JeuxSociete() {
		super();
	}

	public JeuxSociete(GenreSociete societe) {
		super();
		this.societe = societe;
	}

	public GenreSociete getSociete() {
		return societe;
	}

	public void setSociete(GenreSociete societe) {
		this.societe = societe;
	}

	@Override
	public String toString() {
		return "JeuxSociete [societe=" + societe + "]";
	}
	
}
