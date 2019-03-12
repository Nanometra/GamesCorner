package com.projet.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.projet.dao.IGeneriqueDAO;
import com.projet.entities.Article;

@Repository
public class ArticleDAOImpl implements IGeneriqueDAO<Article> {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Article findById(Integer id) {
		return em.find(Article.class, id);
	}

	@Override
	public List<Article> findAll() {
		return null;
	}

	@Override
	public void add(Article article) {
		em.persist(article);
	}

	@Override
	public void delete(Integer id) {
		Article article = em.find(Article.class, id);
		em.remove(article);
	}

	@Override
	public Article update(Article article) {
		return em.merge(article);
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
