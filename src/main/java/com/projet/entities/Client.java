package com.projet.entities;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
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
	
	// Le panier ne sera pas persisté en base
	@Transient
	private Panier panier;
	
	private String adresseLivraison;
	private String codePostal;
	private String telephone;
	
	// Historique des articles achetés (spécifique au client, il est le seul qui peut passer commande)
	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
	private Map<Integer, Commande> historique;
	
	// Constructeurs
	
	public Client() {
		super();
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

	public Map<Integer, Commande> getHistorique() {
		return historique;
	}

	public void setHistorique(Map<Integer, Commande> historique) {
		this.historique = historique;
	}

	@Override
	public String toString() {
		return "Client [panier=" + panier + ", adresseLivraison=" + adresseLivraison + ", codePostal=" + codePostal
				+ ", telephone=" + telephone + ", historique=" + historique + "]";
	}
}
