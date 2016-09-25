package fr.romainmoreau.transiliennextdepartures.transilien;

public enum Mode {
	R("Réel"), T("Théorique");

	private final String libelle;

	private Mode(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}
}
