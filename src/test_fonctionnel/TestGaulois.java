package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;
import personnages.Personnage;
import personnages.Soldat;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix =new Gaulois("Asterix",5);
		//System.out.println(asterix.getNom());
		//asterix.parler(": Bonjour a tous \n");
		Soldat minus = new Soldat("Minus",6, "CENTURION");
		//System.out.println(minus.getNom());
		//minus.parler(": UN GAU... UN GAUGAU...\n");
		//for (int i =0;i<2;i++) {
		//minus.recevoirCoup(3);
		//}
	    //for (int i =0;i<5;i++) {
			//asterix.frapper(minus);	
		//}
		 minus.equiper(Soldat.Equipement.BOUCLIER);
	     minus.equiper(Soldat.Equipement.CASQUE);
	     minus.equiper(Soldat.Equipement.PLASTRON);
		Gaulois agecanonix = new Gaulois("Agecanonix",1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix",2);
		Gaulois obelix = new Gaulois("Obélix",15);
		Gaulois abraracourcix = new Gaulois("Abraracourcix",5);
		Gaulois prolix = new Gaulois("Prolix",2);
		Druide panoramix= new Druide("Panoramix",2);
		panoramix.fabriquerPotion(3);
		panoramix.boosterGaulois(asterix);
		panoramix.boosterGaulois(obelix);
		panoramix.boosterGaulois(assurancetourix);
		panoramix.boosterGaulois(abraracourcix);
		panoramix.boosterGaulois(agecanonix);
		minus.parler(": UN GAU... UN GAUGAU...\n");
		while((asterix.aTerre()!=true)&&(minus.aTerre()!=true)) {
		asterix.frapper(minus);
		if ((asterix.aTerre()!=true)&&(minus.aTerre()!=true))
		minus.frapper(asterix);
		}
	}
}
