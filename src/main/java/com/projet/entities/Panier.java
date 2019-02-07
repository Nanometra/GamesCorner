package com.projet.entities;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class Panier implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Float prixTotal;
	private List<Commande> listeCommandes;
	
	public Panier(Float prixTotal, List<Commande> listeCommandes) {
		super();
		this.prixTotal = prixTotal;
		this.listeCommandes = listeCommandes;
	}

	public List<Commande> getListeCommandes() {
		return listeCommandes;
	}

	public void setListeCommandes(List<Commande> listeCommandes) {
		this.listeCommandes = listeCommandes;
	}

	public Panier() {
		super();
	}

	public Float getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal() {
		Float prixTotalCalcule = calculerPrixTotal(listeCommandes);
		this.prixTotal = prixTotalCalcule;
	}
	
	private Float calculerPrixTotal(List<Commande> listeCommandes) {
		
		Float prixTotalCalcule = 0f;
		Iterator<Commande> itr = listeCommandes.iterator();
		
		while (itr.hasNext()) {
			Commande commande = itr.next();
			prixTotalCalcule = prixTotalCalcule + commande.getArticle().getPrix(); 
		}
		
		return prixTotalCalcule;
	}
	
	@Override
	public String toString() {
		return "Panier [prixTotal=" + prixTotal + ", listeCommandes=" + listeCommandes + "]";
	}
		
}
