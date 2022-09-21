package quizComparable;

public class Participante implements Comparable<Object> {
	
	private int nJuegos;
	private int puntaje;
	private String nombre;
	
	public Participante(int pnJuegos, int ppuntaje, String pnombre) {
		this.nJuegos = pnJuegos;
		this.puntaje = ppuntaje;
		this.nombre = pnombre;
	}

	@Override
	public int compareTo(Object o) {
		
		Participante p2 = (Participante) o;
		
		return (this.nJuegos < p2.getnJuegos() ? -1 : (this.nJuegos > p2.getnJuegos()) ? 1 : (this.puntaje < p2.getPuntaje()) ? 1 : (this.puntaje > p2.getPuntaje()) ? -1 : 0);
		
	}

	public int getnJuegos() {
		return nJuegos;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public String getNombre() {
		return nombre;
	}
	
	

}
