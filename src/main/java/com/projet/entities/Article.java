package com.projet.entities;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.joda.time.DateTime;

@Entity
@Table(name = "article")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Article implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	protected String type;
	protected Float prix;
	protected String description;
	// Neuf ou d'occasion
	protected String etat;
	protected String image;
	protected Float rating;
	// date de sortie de l'article
	@Temporal(TemporalType.TIMESTAMP)
	protected DateTime dateSortie;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vendeur_id")
	protected Vendeur vendeur;

	@OneToMany(mappedBy = "article", cascade = CascadeType.ALL, orphanRemoval = true)
	protected Map<Integer, Selection> listeSelection;

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

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public Vendeur getVendeur() {
		return vendeur;
	}

	public void setVendeur(Vendeur vendeur) {
		this.vendeur = vendeur;
	}

	public Map<Integer, Selection> getListeSelection() {
		return listeSelection;
	}

	public void setListeSelection(Map<Integer, Selection> listeSelection) {
		this.listeSelection = listeSelection;
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
				+ etat + ", image=" + image + ", rating=" + rating + ", dateSortie=" + dateSortie + ", vendeur="
				+ vendeur + ", listeSelection=" + listeSelection + "]";
	}

}
