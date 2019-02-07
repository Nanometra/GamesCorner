package com.projet.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="facture")
public class Facture implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private Double prixTotal;
	private Utilisateur client;
	private String moyenPaiement;
	// Paramètre déterminant si le client a payé sa commande.
	private Boolean finalisationTransaction;
	private List<Commande> commandes; 
	
	public Facture() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(Double prixTotal) {
		this.prixTotal = prixTotal;
	}

	public Utilisateur getClient() {
		return client;
	}

	public void setClient(Utilisateur client) {
		this.client = client;
	}

	public String getMoyenPaiement() {
		return moyenPaiement;
	}

	public void setMoyenPaiement(String moyenPaiement) {
		this.moyenPaiement = moyenPaiement;
	}

	public Boolean getFinalisationTransaction() {
		return finalisationTransaction;
	}

	public void setFinalisationTransaction(Boolean finalisationTransaction) {
		this.finalisationTransaction = finalisationTransaction;
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	@Override
	public String toString() {
		return "Facture [id=" + id + ", prixTotal=" + prixTotal + ", client=" + client + ", moyenPaiement="
				+ moyenPaiement + ", finalisationTransaction=" + finalisationTransaction + ", commandes=" + commandes
				+ "]";
	}
	
}
