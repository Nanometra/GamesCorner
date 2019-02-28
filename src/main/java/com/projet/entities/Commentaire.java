package com.projet.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Commentaire extends Post {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String commentaireUtilisateur;
	
	
	public Commentaire() {
		super();
	}

	public String getCommentaireUtilisateur() {
		return commentaireUtilisateur;
	}

	public void setCommentaireUtilisateur(String commentaireUtilisateur) {
		this.commentaireUtilisateur = commentaireUtilisateur;
	}

	@Override
	public String toString() {
		return "Commentaire [commentaireUtilisateur=" + commentaireUtilisateur + "]";
	}

}
