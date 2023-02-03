package LettoreMultimediale;

public class Immagine extends ElementoMultimediale implements Showable {
	
	private int luminosita = 10;
	
	public Immagine (String titolo) {
		super(titolo);
	}
	
	
	// Metodi
	
	public void show() {
		
		System.out.println("- SHOW IMAGE -");
		System.out.print(this.getTitle());
			
		asterischi();
		
		System.out.println("");
	}
	
	protected void asterischi() {
		for(int i = 0; i < this.luminosita; i++) {
			System.out.print("*");
		}
	}

}
