package com.projet.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="client")
/*
 * On peut déterminer le nom de la valeur qui sera rentrée dans la colonne discriminante 
 * dans la table avec l'annotation @DiscriminationValue. Par défaut, cette valeur est settée 
 * au nom de la classe. 
 */
//@DiscriminatorValue(value="CLT")
public class Client extends Utilisateur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Panier panier;
	private String adresseLivraison;
	private String codePostal;
	private String telephone;

	
	// Constructeurs
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Client(Panier panier, String adresseLivraison, String codePostal, String telephone) {
		super();
		this.panier = panier;
		this.adresseLivraison = adresseLivraison;
		this.codePostal = codePostal;
		this.telephone = telephone;
	}

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	public String getAdresseLivraison() {
		return adresseLivraison;
	}

	public void setAdresseLivraison(String adresseLivraison) {
		this.adresseLivraison = adresseLivraison;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Client [panier=" + panier + ", adresseLivraison=" + adresseLivraison + ", codePostal=" + codePostal
				+ ", telephone=" + telephone + "]";
	}

}
