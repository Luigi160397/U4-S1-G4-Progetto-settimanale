package application.media;

public abstract class ElementoMultimediale {
	private String tipoFile;
	private String titolo;

	public ElementoMultimediale(String tipoFile, String titolo) {

		setTipoFile(tipoFile);
		setTitolo(titolo);
	}

	public String getTipoFile() {
		return tipoFile;
	}

	public void setTipoFile(String tipoFile) {
		this.tipoFile = tipoFile;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

}
