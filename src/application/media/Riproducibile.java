package application.media;

public interface Riproducibile {
	public static void play(int durata, String title, int volume) {

		for (int i = 0; i < durata; i++) {
			System.out.println(title + " " + stampaVol(volume));
		}

	}

	private static String stampaVol(int volume) {
		String strVol = "!";
		for (int i = 0; i < volume; i++) {
			strVol += strVol;
		}
		return strVol;
	}

	public static int alzaVolume(int volume) {
		return volume++;
	}

	public static int abbassaVolume(int volume) {
		return volume--;
	}

}
