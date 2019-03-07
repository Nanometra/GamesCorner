package com.projet.entities;

import javax.persistence.Enumerated;

import com.projet.enums.GenreRole;

public class JeuxDeRole extends Article {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Enumerated
	private GenreRole role;

	public JeuxDeRole() {
		super();
	}

	public JeuxDeRole(GenreRole role) {
		super();
		this.role = role;
	}

	public GenreRole getRole() {
		return role;
	}

	public void setRole(GenreRole role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "JeuxDeRole [role=" + role + "]";
	}

}
