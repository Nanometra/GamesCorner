package com.projet.entities;

import java.util.Iterator;
import java.util.List;

public class Panier {

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
		// TODO Auto-generated constructor stub
	}

	public Float getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(Float prixTotal) {
		prixTotal = calculerPrixTotal(listeCommandes);
		this.prixTotal = prixTotal;
	}
	
	private Float calculerPrixTotal(List<Commande> listeCommandes) {
		
		Float prixTotal = 0f;
		Iterator<Commande> itr = listeCommandes.iterator();
		
		while (itr.hasNext()) {
			Commande commande = itr.next();
			prixTotal = prixTotal + commande.getArticle().getPrix(); 
		}
		
		return prixTotal;
	}
	
	@Override
	public String toString() {
		return "Panier [prixTotal=" + prixTotal + ", listeCommandes=" + listeCommandes + "]";
	}
		
}
