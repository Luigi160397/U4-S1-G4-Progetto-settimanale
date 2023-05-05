package application.media;

public class Audio extends ElementoMultimediale implements Riproducibile {
	private int volume = 10;
	private int durata = 3;

	public Audio(String tipoFile, String titolo) {
		super(tipoFile, titolo, true);
		setDurata(durata);

	}

	public Audio(String tipoFile, String titolo, int durata) {
		super(tipoFile, titolo, true);
		setDurata(durata);

	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

}
