package application.media;

public interface Luminosita {

	public static void show(String title, int luminosita) {

		System.out.println(title + " " + stampaLum(luminosita));

	}

	public static String stampaLum(int luminosita) {
		String strVol = "*";
		for (int i = 0; i < luminosita; i++) {
			strVol += strVol;
		}
		return strVol;
	}

	public static void alzaLuminosita() {

	}

	public static void abbassaLuminosita() {

	}
}
