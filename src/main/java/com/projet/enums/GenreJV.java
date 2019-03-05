package com.projet.enums;

public enum GenreJV {
	Action, Aventure, FPS, RPG, Rythme("Jeux de rythme"), Sport, Stratégie, Tactique;

	private String name;

	private GenreJV() {
	}

	GenreJV(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
