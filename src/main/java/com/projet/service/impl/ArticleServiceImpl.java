package com.projet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.dao.IArticleDAO;
import com.projet.entities.Article;
import com.projet.service.IArticleService;

@Service
public class ArticleServiceImpl implements IArticleService {

	@Autowired
	private IArticleDAO articleDAO;
	
	@Override
	public Article findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Article entity) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Article update(Article entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
