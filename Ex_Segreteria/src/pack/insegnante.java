package pack;

public class insegnante {
	public int anniSer;
	public String indirizzo;
	public String materia;
	public float stipendio = 1200;
	public insegnante(int anniSer, String indirizzo, String materia ) {
		// TODO Auto-generated constructor stub
		this.anniSer = anniSer;
		this.materia = materia;
		this.indirizzo = indirizzo;
		
	}

	public float getSti() {
		return stipendio;
	}
	public int getSer() {
		return anniSer;
	}
	public String getMat() {
		return materia;
	}
	public String getInd() {
		return indirizzo;
	}
	
	
	public void setSti() {
		if (anniSer >= 10 && anniSer < 20) {
			stipendio = stipendio + ((stipendio/100)*15);
		}
		else if (anniSer >= 20) {
			stipendio = stipendio + ((stipendio/100)*25);
		}
	}
	
}
