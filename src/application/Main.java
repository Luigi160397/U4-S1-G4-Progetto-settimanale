package application;

import java.util.Scanner;

import application.media.Audio;
import application.media.ElementoMultimediale;
import application.media.Immagine;
import application.media.Video;

public class Main {

	public static void main(String[] args) {

		Scanner multimediaScan = new Scanner(System.in);
		System.out.println("Inserisci 5 elementi multimediali");

		ElementoMultimediale[] medias = new ElementoMultimediale[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Inserisci il tipo di file del " + (i + 1) + "° elemento (video, immagine o audio)");
			String mediaType = multimediaScan.nextLine();

			if (mediaType.equalsIgnoreCase("video")) {
				System.out.println("Inserisci il titolo del " + (i + 1) + "° video");
				String mediaTitle = multimediaScan.nextLine();
				Video video = new Video(mediaType, mediaTitle);
				medias[i] = video;
			} else if (mediaType.equalsIgnoreCase("audio")) {
				System.out.println("Inserisci il titolo del " + (i + 1) + "° audio");
				String mediaTitle = multimediaScan.nextLine();
				Audio audio = new Audio(mediaType, mediaTitle);
				medias[i] = audio;
			} else if (mediaType.equalsIgnoreCase("immagine")) {
				System.out.println("Inserisci il titolo della " + (i + 1) + "° immagine");
				String mediaTitle = multimediaScan.nextLine();
				Immagine immagine = new Immagine(mediaType, mediaTitle);
				medias[i] = immagine;
			} else {
				System.out.println("File non supportato!");
				i--;
			}
		}

		System.out.println(medias[2].getTitolo());

		int choice = -1;
		while (choice != 0) {
			System.out.println("Inserisci il numero dell'elemento da eseguire (0 per uscire)");
			choice = multimediaScan.nextInt();
			multimediaScan.nextLine();

			if (choice > 0 && choice <= 5) {
				ElementoMultimediale media = medias[choice - 1];
				if (media != null) {
					media.esegui();
				} else {
					System.out.println("Elemento multimediale non presente!");
				}
			} else if (choice != 0) {
				System.out.println("Scelta non valida!");
			}
		}
		System.out.println("Arrivederci!");
		multimediaScan.close();
	}

}
