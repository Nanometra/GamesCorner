package com.projet.enums;

public enum Type {
	Action, Aventure, RPG, Rythme("Jeux de rythme"), Sport, Stratégie, Tactique;

	private String name;

	private Type() {
	}

	Type(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
