package LettoreMultimediale;

import java.util.Scanner;

public class LettoreMultimediale {
	
	static Scanner sc = new Scanner(System.in);
	static ElementoMultimediale[] media = new ElementoMultimediale[5];
	int traccia;

	public static void main(String[] args) {
		
		// File 1
		System.out.println("Inserire il titolo del primo file (audio):");
        String title1 = sc.nextLine();
        while (title1 == "") {
        	System.out.println("ERRORE: il titolo non può essere vuoto. Inserire un titolo valido.");
        	title1 = sc.nextLine();
        }
        Audio m1 = new Audio(title1);
        
        // File 2
        System.out.println("Inserire il titolo del secondo file (video):");
        String title2 = sc.nextLine();
        while (title2 == "") {
        	System.out.println("ERRORE: il titolo non può essere vuoto. Inserire un titolo valido.");
        	title2 = sc.nextLine();
        }
        Video m2 = new Video(title2);
        
        // File 3
        System.out.println("Inserire il titolo del terzo file (audio):");
        String title3 = sc.nextLine();
        while (title3 == "") {
        	System.out.println("ERRORE: il titolo non può essere vuoto. Inserire un titolo valido.");
        	title3 = sc.nextLine();
        }
        Audio m3 = new Audio(title3);
        
        // File 4
        System.out.println("Inserire il titolo del quarto file (video):");
        String title4 = sc.nextLine();
        while (title4 == "") {
        	System.out.println("ERRORE: il titolo non può essere vuoto. Inserire un titolo valido.");
        	title4 = sc.nextLine();
        }
        Video m4 = new Video(title4);
        
        // File 5        
        System.out.println("Inserire il titolo del quinto file (immagine):");
        String title5 = sc.nextLine();
        while (title5 == "") {
        	System.out.println("ERRORE: il titolo non può essere vuoto. Inserire un titolo valido.");
        	title5 = sc.nextLine();
        }
        Immagine m5 = new Immagine(title5);
        
        // Assegnazione dei file all'array
        media[0] = m1;
        media[1] = m2;
        media[2] = m3;
        media[3] = m4;
        media[4] = m5;
        
        System.out.println("\n- AZIONI POSSIBILI -");
        
        for (int i = 0; i < 5; i++ ) {
        	System.out.println( (i+1) + " - Play \"" + media[i].getTitle() + "\"");
        }
        System.out.println( "[ " + 0 + " - Spegni lettore ]");
        
        lettore();
        
	}
	
	public static void lettore() {
        
        System.out.println("\nScegli quale file o azione eseguire inserendo il numero associato:");
        int traccia = sc.nextInt() - 1;
        
        if ( traccia >= 0 && traccia <= 4 ) {
        	if ( media[traccia] instanceof Audio ) {
        		Audio m = (Audio) media[traccia];
        		m.play();
        	} else if ( media[traccia] instanceof Video ) {
        		Video m = (Video) media[traccia];
        		m.play();
        	} else {
        		Immagine m = (Immagine) media[traccia];
        		m.show();
        	}
        	
        	System.out.println("\n------------------------------");
        	lettore();
        } else if ( traccia == -1) {
        	System.out.println("Spegnimento in corso...");
        	System.out.println("Lettore spento.");
        	sc.close();
        } else {
        	System.out.println("\nERRORE: inserire solamente uno di questi numeri: 1, 2, 3, 4, 5, oppure 0 per spegnere il lettore.\n");
        	System.out.println("------------------------------");
        	lettore();
        }
        
    }
}
