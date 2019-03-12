package com.projet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projet.dao.IArticleDAO;
import com.projet.entities.Article;
import com.projet.service.IArticleService;

@Service
public class ArticleServiceImpl implements IArticleService {

	@Autowired
	private IArticleDAO articleDAO;
	
//	public ArticleServiceImpl(IArticleDAO articleDAO) {
//		super();
//		this.articleDAO = articleDAO;
//	}

	@Override
	public Article findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> findAll() {
		return articleDAO.findAll();
	}

	@Override
	@Transactional
	public void add(Article article) {
		this.articleDAO.add(article);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		this.articleDAO.delete(id);		
	}

	@Override
	@Transactional
	public Article update(Article article) {
		return articleDAO.update(article);
	}

//	@Autowired
	public void setArticleDAO(IArticleDAO articleDAO) {
		this.articleDAO = articleDAO;
	}

	public IArticleDAO getArticleDAO() {
		return articleDAO;
	}
	
}
