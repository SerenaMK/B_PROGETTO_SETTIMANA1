package LettoreMultimediale;

public abstract class ElementoMultimediale {
	
	String titolo;
	
	public ElementoMultimediale (String titolo) {
		this.titolo = titolo;
	}
	
	public String getTitle() {
		return this.titolo;
	}

}
