package com.projet.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.joda.time.DateTime;

@Entity
@Table(name="commentaire")
public class Commentaire implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private DateTime dateCommentaire;
	private String commentaireUtilisateur;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="client_id")
	private Client client;
	
	public Commentaire() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DateTime getDateCommentaire() {
		return dateCommentaire;
	}

	public void setDateCommentaire(DateTime dateCommentaire) {
		this.dateCommentaire = dateCommentaire;
	}

	public String getCommentaireUtilisateur() {
		return commentaireUtilisateur;
	}

	public void setCommentaireUtilisateur(String commentaireUtilisateur) {
		this.commentaireUtilisateur = commentaireUtilisateur;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Commentaire [id=" + id + ", dateCommentaire=" + dateCommentaire + ", commentaireUtilisateur="
				+ commentaireUtilisateur + ", client=" + client + "]";
	}

}
