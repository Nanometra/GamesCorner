package com.projet.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.joda.time.DateTime;

@Entity
@Table(name="post")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Post implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = true)
	protected int id;
	
	@Column(unique = true, nullable = true)
	protected DateTime datePoste;
	
	protected DateTime dateModification;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="utilisateur_id")
	protected Utilisateur utilisateur;
	
	public Post() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DateTime getDatePoste() {
		return datePoste;
	}

	public void setDatePoste(DateTime datePoste) {
		this.datePoste = datePoste;
	}
	
	public DateTime getDateModification() {
		return dateModification;
	}

	public void setDateModification(DateTime dateModification) {
		this.dateModification = dateModification;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", datePoste=" + datePoste + ", utilisateur=" + utilisateur + "]";
	}
}
