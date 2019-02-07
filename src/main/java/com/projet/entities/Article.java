package com.projet.entities;

import java.io.Serializable;

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
@Table(name="article")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class Article implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int id;
	protected String type;
	protected Float prix;
	protected String description;
	// Neuf ou d'occasion
	protected String etat;
	protected String image;
	protected String rating;
	// date de sortie de l'article
	protected DateTime dateSortie;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="vendeur_id")
	protected Vendeur vendeur;
	
	
	// Constructeur
	public Article() {
		super();
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

	public DateTime getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(DateTime dateSortie) {
		this.dateSortie = dateSortie;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", type=" + type + ", prix=" + prix + ", description=" + description + ", etat="
				+ etat + ", image=" + image + ", rating=" + rating + ", dateSortie=" + dateSortie + "]";
	}
	
}
