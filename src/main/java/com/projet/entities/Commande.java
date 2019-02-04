package com.projet.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Commande implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Article article;
	private int quantite;

	
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Commande(int id, Article article, int quantite) {
		super();
		this.id = id;
		this.article = article;
		this.quantite = quantite;
	}

	public Commande(Article article, int quantite) {
		super();
		this.article = article;
		this.quantite = quantite;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", article=" + article + ", quantite=" + quantite + "]";
	}

}
