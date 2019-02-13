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
	private List<Selection> listeSelection;
	private Client client;
	private Commande commande;	
	// Paramètre déterminant si le client valide son panier.
	private Boolean validerPanier;
	
	public Panier() {
		super();
	}

	public Float getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal() {
		Float prixTotalCalcule = calculerPrixTotal(listeSelection);
		this.prixTotal = prixTotalCalcule;
	}
	
	private Float calculerPrixTotal(List<Selection> listeSelection) {
		
		Float prixTotalCalcule = 0f;
		Iterator<Selection> itr = listeSelection.iterator();
		
		while (itr.hasNext()) {
			Selection selection = itr.next();
			prixTotalCalcule = prixTotalCalcule + selection.getArticle().getPrix(); 
		}
		
		return prixTotalCalcule;
	}
	
	public List<Selection> getListeSelection() {
		return listeSelection;
	}

	public void setListeSelection(List<Selection> listeSelection) {
		this.listeSelection = listeSelection;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public void setPrixTotal(Float prixTotal) {
		this.prixTotal = prixTotal;
	}

	public Boolean getValiderPanier() {
		return validerPanier;
	}

	public void setValiderPanier(Boolean validerPanier) {
		this.validerPanier = validerPanier;
	}

	@Override
	public String toString() {
		return "Panier [prixTotal=" + prixTotal + ", listeSelection=" + listeSelection + ", client=" + client
				+ ", commande=" + commande + "]";
	}
		
}
