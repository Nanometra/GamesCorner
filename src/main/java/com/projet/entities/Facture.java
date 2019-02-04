package com.projet.entities;

import java.io.Serializable;

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
	
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facture(int id, Double prixTotal, Utilisateur client, String moyenPaiement,
			Boolean finalisationTransaction) {
		super();
		this.id = id;
		this.prixTotal = prixTotal;
		this.client = client;
		this.moyenPaiement = moyenPaiement;
		this.finalisationTransaction = finalisationTransaction;
	}

	public Facture(Double prixTotal, Utilisateur client, String moyenPaiement, Boolean finalisationTransaction) {
		super();
		this.prixTotal = prixTotal;
		this.client = client;
		this.moyenPaiement = moyenPaiement;
		this.finalisationTransaction = finalisationTransaction;
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

	@Override
	public String toString() {
		return "Facture [id=" + id + ", prixTotal=" + prixTotal + ", client=" + client + ", moyenPaiement="
				+ moyenPaiement + ", finalisationTransaction=" + finalisationTransaction + "]";
	}
	
}
