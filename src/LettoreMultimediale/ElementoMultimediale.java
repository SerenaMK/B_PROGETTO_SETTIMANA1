package LettoreMultimediale;

public abstract class ElementoMultimediale {
	
	private String titolo;
	
	public ElementoMultimediale (String titolo) {
		this.titolo = titolo;
	}
	
	public String getTitle() {
		return this.titolo;
	}
	
	public void play() {
		if (this instanceof Playable) {
			System.out.println("[PLAY]");
		}
	}

}
