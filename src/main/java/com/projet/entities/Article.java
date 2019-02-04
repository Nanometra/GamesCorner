package com.projet.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.joda.time.DateTime;

@Entity
@Table(name="article")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class Article implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String type;
	private Float prix;
	private String description;
	// Neuf ou d'occasion
	private String etat;
	private String image;
	private String rating;
	private String commentaire;
	// date de sortie de l'article
	private DateTime dateSortie;
	
	// Constructeur
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Getters et Setters
	
	public String getType() {
		return type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Float getPrix() {
		return prix;
	}

	public void setPrix(Float prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public DateTime getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(DateTime dateSortie) {
		this.dateSortie = dateSortie;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", type=" + type + ", prix=" + prix + ", description=" + description + ", etat="
				+ etat + ", image=" + image + ", rating=" + rating + ", commentaire=" + commentaire + ", dateSortie="
				+ dateSortie + "]";
	}
	
}
