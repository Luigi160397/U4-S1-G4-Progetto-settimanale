package application;

import java.util.Scanner;

import application.media.Audio;
import application.media.ElementoMultimediale;
import application.media.Immagine;
import application.media.Video;

public class Main {

	public static void main(String[] args) {
//		Immagine imm1 = new Immagine("immagine", "nature", 10);
//		Luminosita.show(imm1.getTitolo(), imm1.getLuminosita());
//
//		Audio song = new Audio("audio", "queen", 5);
//
//		song.setVolume(30);
//		Riproducibile.play(song.getDurata(), song.getTitolo(), song.getVolume());
//
//		Video video1 = new Video("video", "avatar", 10, 20);
//
//		Riproducibile.play(video1.getDurata(), video1.getTitolo(), video1.getVolume(),
//				Luminosita.show(video1.getLuminosita()));
		Scanner multimediaScan = new Scanner(System.in);
		System.out.println("Inserisci 5 elementi multimediali");

		ElementoMultimediale[] medias = new ElementoMultimediale[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Inserisci il tipo di file del " + (i + 1) + "° elemento (video, immagine o audio)");
			String mediaType = multimediaScan.nextLine();

			System.out.println("Inserisci il titolo del " + (i + 1) + "° elemento");
			String mediaTitle = multimediaScan.nextLine();

			if (mediaType.equalsIgnoreCase("video")) {
				Video video = new Video(mediaType, mediaTitle);
				medias[i] = video;
			} else if (mediaType.equalsIgnoreCase("audio")) {
				Audio audio = new Audio(mediaType, mediaTitle);
				medias[i] = audio;
			} else if (mediaType.equalsIgnoreCase("immagine")) {
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
	}

	/*
	 * scanner
	 * println("inserisci un elemento multimediale specificando tipo di file e titolo"
	 * )
	 * 
	 * println("inserisci il tipo del primo file")
	 * 
	 * string file1 = scanner.nextLine;
	 * println("inserisci il titolo del primo file")
	 * 
	 * string titolo1 = scanner.nextLine; ElementoMultimediale[] media = new
	 * ElementoMultimediale[5] if (file1.equals("video")){ Video video1 = new
	 * Video(file, titolo) }else if (file1.equals("audio")){ Audio audio1 = new
	 * Audio(file, titolo) }else if (file1.equals("immagine")){ Immagine imm1 = new
	 * Immagine (file, titolo) }else{ println("file non supp") }
	 * 
	 * media[i] = file; scanner.close() ciclo chiuso****
	 * println("Inserisci un numero da 1 a 5 per riprodurre uno dei file inseriti"
	 * 
	 * 
	 */
}
