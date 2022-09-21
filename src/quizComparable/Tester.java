package quizComparable;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {

		ArrayList<Participante> participantes = new ArrayList<Participante>();
		
		Participante p1 = new Participante(10, 20,"Ana"); 
		Participante p2 = new Participante(9, 20,"Natasha");
		Participante p3 = new Participante(12, 17,"Walter");
		Participante p4 = new Participante(13, 18,"Saul");
		Participante p5 = new Participante(11, 21,"Tomas");
		Participante p6 = new Participante(9, 21,"Legolas");
		Participante p7 = new Participante(9, 7,"Jimena");
		Participante p8 = new Participante(10, 23,"Alexandra");
		Participante p9 = new Participante(11, 25,"Borja");
		
		participantes.add(p1);
		participantes.add(p2);
		participantes.add(p3);
		participantes.add(p4);
		participantes.add(p5);
		participantes.add(p6);
		participantes.add(p7);
		participantes.add(p8);
		participantes.add(p9);
		
		participantes.sort(null);
		
		int a = 1;
		
		System.out.println("Ranking de participantes Tiro con arco:");
		System.out.println();
		
		for (Participante i : participantes) {
			System.out.println(a + ". Nombre: " + i.getNombre() +  " / Juegos: " + i.getnJuegos() + " / Puntaje: " + i.getPuntaje());
			a++;
		}
		
		
		
		
		
		
	}

}
