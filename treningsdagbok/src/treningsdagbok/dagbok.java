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
					//kjør ny økt metode
					break;
				case "okter":
					//kjøre se okter metode
					break;
				case "leggTilOvelse":
					//kjør legg til øvelse metode
					break;
				case "seMaal":
					//kjør se mål metode
					break;
				case "settMaal":
					//kjør settMaal metode
					break;
				case "seResultater":
					//kjør se resultat metode
					break;
				case "seProgresjon":
					//kjør metode for å se progresjon
					break;
				case "resultatDifferanse":
					//kjør metode for å se differanse mellom resultat og beste
					break;
				case "seMal":
					driver.seMal();
					break;
				case "sammenlignFormResultat":
					//kjør metode for å sammenligne form og resultat
					break;
				case "lesLogg":
					//kjør metode for å se logg
					break;
				case "connect":
					driver.connect();
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
