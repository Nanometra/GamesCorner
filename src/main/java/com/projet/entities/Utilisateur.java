package com.projet.entities;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.joda.time.DateTime;

@Entity
@Table(name="utilisateur")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
/* Par défaut, avec cette stratégie, la colonne discriminante est setté à DTYPE.
 *  Avec @DiscriminatorColumn, on peut changer le nom de la colonne discriminante (ici 
 *  on la nomme ici "discriminant" en précisant que c'est un String. 
 */
@DiscriminatorColumn(name="discriminant", discriminatorType=DiscriminatorType.STRING)
public abstract class Utilisateur implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int id;
	protected String nom;
	protected String prenom;
	protected String motDePasse;
	protected String confirmationMotDePasse;
	protected String email;
	protected DateTime dateInscription;
	protected String imageProfil;
	// Indique si l'utilisateur est également vendeur sur la partie vente particulier à particulier
	protected Boolean vendeur;
	// Indique si l'utilisateur est également un admin sur la partie forum de l'application.
	protected Boolean admin;
	protected String description;
			
	// L'utilisateur devient actif après avoir validé son compte (validation envoyée par mail directement dans la boite mail du client).
	protected Boolean actif;
	
	// Constructeurs
	
	public Utilisateur() {
		super();
	}	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getConfirmationMotDePasse() {
		return confirmationMotDePasse;
	}

	public void setConfirmationMotDePasse(String confirmationMotDePasse) {
		this.confirmationMotDePasse = confirmationMotDePasse;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getActif() {
		return actif;
	}

	public void setActif(Boolean actif) {
		this.actif = actif;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	public Boolean getVendeur() {
		return vendeur;
	}

	public void setVendeur(Boolean vendeur) {
		this.vendeur = vendeur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public DateTime getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(DateTime dateInscription) {
		this.dateInscription = dateInscription;
	}

	public String getImageProfil() {
		return imageProfil;
	}

	public void setImageProfil(String imageProfil) {
		this.imageProfil = imageProfil;
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", motDePasse=" + motDePasse
				+ ", confirmationMotDePasse=" + confirmationMotDePasse + ", email=" + email + ", dateInscription="
				+ dateInscription + ", imageProfil=" + imageProfil + ", vendeur=" + vendeur + ", admin=" + admin
				+ ", description=" + description + ", actif=" + actif + "]";
	}
	
}
