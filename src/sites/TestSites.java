package sites;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Soldat;

public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingetorix = new Gaulois("Vercingetorix", 5);
		Soldat minus = new Soldat("Minus",2, "CENTURION");
		vercingetorix.parler("Je suis un grand guerrier et je vais créer mon village");
		minus.parler("Je suis en charge de créer un nouveau camp romain.");
		Gaulois agecanonix = new Gaulois("Agecanonix",1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix",2);
		Gaulois astérix = new Gaulois("Astérix",5);
		Gaulois obelix = new Gaulois("Obelix",15);
		Gaulois prolix = new Gaulois("Prolix",2);
		Soldat brutus = new Soldat("Brutus",5,"centurion");
		Soldat milexcus = new Soldat("Milexcus",2,"soldat");
		Soldat tulliusOctopus = new Soldat("Tullius Octopus",2,"tesserarius");
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus",3,"optio");
	}
}
