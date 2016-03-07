package treningsdagbok;

import java.util.Scanner;

public class dagbok {
	private static Driver driver;
	static void init() {
		driver = new Driver();
	}
	
	static void run() {
		Scanner in = new Scanner(System.in);
		driver.connect();
		
		while(true) {
			System.out.println("> ");
			String[] line = in.nextLine().split("\\ ");
			
			switch(line[0]) {
				case "nyOkt":
					//kj�r ny �kt metode
					break;
				case "okter":
					//kj�re se okter metodeseleg
					break;
				case "leggTilOvelse":
					String ovelseNavn = line[1];
					String ovelseBeskrivelse = "";
					if(line.length > 2) {
						for(int i = 2; i < line.length; i++) {
							ovelseBeskrivelse += line[i]+ " ";
						}
					}
					System.out.println(ovelseNavn);
					System.out.println(ovelseBeskrivelse);
					driver.leggTilOvelse(ovelseNavn, ovelseBeskrivelse);
					//kj�r legg til �velse metode
					break;
				case "leggTilOktOvelse":
					// kj�r legg til �kt�velse metode
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
				case "seMal":
					driver.seMal();
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
		init();
		run();
	}

}
