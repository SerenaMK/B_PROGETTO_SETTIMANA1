package LettoreMultimediale;

public class Video extends Audio implements Playable {
	
	private int luminosita = 10;
	private int durata = 5; //interface requires it
	
	public Video (String titolo) {
		super(titolo);
	}
	
	
	// Metodi

	public void play() {
		System.out.println("- PLAY VIDEO -");
		
		for(int i = 0; i < this.durata; i++) {
			System.out.print(this.titolo);
			
			esclamazioni();
			asterischi();
			
			System.out.println("");
		}
	}
	
	public void diminuisciLuminosita() {
		this.luminosita--;
		System.out.println("Luminosità diminuita a: " + this.luminosita);
	}
	
	public void aumentaLuminosita() {
		this.luminosita++;
		System.out.println("Luminosità aumentata a: " + this.luminosita);
	}
	
	protected void asterischi() {
		for(int i = 0; i < this.luminosita; i++) {
			System.out.print("*");
		}
	}

}
