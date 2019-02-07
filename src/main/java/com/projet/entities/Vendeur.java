package com.projet.entities;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.joda.time.DateTime;

@Entity
@Table(name="vendeur")
public class Vendeur extends Utilisateur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private DateTime dateDebutVendeur;
	// % de commission prélevé par le site au vendeur
	private Float commission;
	// Liste articles à vendre
	private Map<Long, Article> listeArticles;
	
	public Vendeur() {
		super();
	}

	public Vendeur(DateTime dateDebutVendeur, Float commission, Map<Long, Article> listeArticles) {
		super();
		this.dateDebutVendeur = dateDebutVendeur;
		this.commission = commission;
		this.listeArticles = listeArticles;
	}

	public DateTime getDateDebutVendeur() {
		return dateDebutVendeur;
	}

	public void setDateDebutVendeur(DateTime dateDebutVendeur) {
		this.dateDebutVendeur = dateDebutVendeur;
	}

	public Float getCommission() {
		return commission;
	}

	public void setCommission(Float commission) {
		this.commission = commission;
	}

	public Map<Long, Article> getListeArticles() {
		return listeArticles;
	}

	public void setListeArticles(Map<Long, Article> listeArticles) {
		this.listeArticles = listeArticles;
	}

	@Override
	public String toString() {
		return "Vendeur [dateDebutVendeur=" + dateDebutVendeur + ", commission=" + commission + ", listeArticles="
				+ listeArticles + "]";
	}
	
}
