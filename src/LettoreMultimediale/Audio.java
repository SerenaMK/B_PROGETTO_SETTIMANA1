package LettoreMultimediale;

public class Audio extends ElementoMultimediale implements Playable {
	
	private int durata = 3;
	private int volume = 10;
	
	public Audio (String titolo) {
		super(titolo);
	}
	
	
	// Metodi

	public void play() {
		
		System.out.println("- PLAY AUDIO -");
		
		for(int i = 0; i < this.durata; i++) {
			System.out.print(this.titolo);
			
			esclamazioni();
			
			System.out.println("");
		}
		
	}
	
	public void abbassaVolume() {
		this.volume--;
		System.out.println("Volume abbassato a: " + this.volume);
	}
	
	public void alzaVolume() {
		this.volume++;
		System.out.println("Volume alzato a: " + this.volume);
	}
	
	protected void esclamazioni() {
		for(int i = 0; i < this.volume; i++) {
			System.out.print("!");
		}
	}

}
