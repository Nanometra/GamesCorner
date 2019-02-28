package com.projet.entities;

import java.util.Date;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Vendeur extends Utilisateur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(unique = true, nullable = true)
	private Date dateDebutVendeur;
	// % de commission prélevé par le site au vendeur
	private Float commission;
	
	// Liste articles à vendre
	@OneToMany(mappedBy="vendeur")
	private Map<Long, Article> listeArticles;
	
	public Vendeur() {
		super();
	}

	public Vendeur(Date dateDebutVendeur, Float commission, Map<Long, Article> listeArticles) {
		super();
		this.dateDebutVendeur = dateDebutVendeur;
		this.commission = commission;
		this.listeArticles = listeArticles;
	}

	public Date getDateDebutVendeur() {
		return dateDebutVendeur;
	}

	public void setDateDebutVendeur(Date dateDebutVendeur) {
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
