package com.projet.entities;

import javax.persistence.Entity;
import javax.persistence.Enumerated;

import com.projet.enums.GenreJV;

@Entity
public class JeuxVideo extends Article {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Enumerated
	private GenreJV genre;
	private Boolean collector;
	
	public JeuxVideo() {
		super();
	}

	public GenreJV getGenre() {
		return genre;
	}

	public void setGenre(GenreJV genre) {
		this.genre = genre;
	}

	public Boolean getCollector() {
		return collector;
	}

	public void setCollector(Boolean collector) {
		this.collector = collector;
	}

	@Override
	public String toString() {
		return "JeuxVideo [genre=" + genre + ", collector=" + collector + "]";
	}

}
