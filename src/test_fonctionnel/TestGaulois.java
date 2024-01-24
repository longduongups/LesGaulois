package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Personnage;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix =new Gaulois("Asterix",5);
		//System.out.println(asterix.getNom());
		asterix.parler(": Bonjour a tous \n");
		Romain minus =new Romain("Minus",5);
		//System.out.println(minus.getNom());
		minus.parler(": UN GAU... UN GAUGAU...\n");
		//for (int i =0;i<2;i++) {
		//minus.recevoirCoup(3);
		//}
		for (int i =0;i<5;i++) {
			asterix.frapper(minus);
		}
	}
}
