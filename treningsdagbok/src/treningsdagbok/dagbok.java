package treningsdagbok;

import java.util.Scanner;

public class dagbok {
	private Driver driver;
	void init() {
		driver = new Driver();
	}
	
	void run() {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("> ");
			String[] line = in.nextLine().split("\\ ");
			
			switch(line[0]) {
				case "nyOkt":
					//kj�r ny �kt metode
					break;
				case "okter":
					//kj�re se okter metode
					break;
				case "leggTilOvelse":
					//kj�r legg til �velse metode
					break;
				case "seMaal":
					//kj�r se m�l metode
					break;
				case "settMaal":
					//kj�r settMaal metode
					break;
				case "seResultater":
					//kj�r se resultat metode
					break;
				case "seProgresjon":
					//kj�r metode for � se progresjon
					break;
				case "resultatDifferanse":
					//kj�r metode for � se differanse mellom resultat og beste
					break;
				case "lagMal":
					//kj�r metode for � lage mal
					break;
				case "sammenlignFormResultat":
					//kj�r metode for � sammenligne form og resultat
					break;
				case "lesLogg":
					//kj�r metode for � se logg
					break;
				case "exit":
					in.close();
					return;
				default:
					System.out.println("Kommandoer:"
							+ "List kommandoer");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
