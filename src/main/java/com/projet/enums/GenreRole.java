package com.projet.enums;

public enum GenreRole {
	PostApocalypse, Fantasy, Cyberpunk;

	private String name;

	private GenreRole(String name) {
		this.name = name;
	}

	private GenreRole() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
}
