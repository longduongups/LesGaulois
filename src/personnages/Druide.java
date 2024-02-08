package personnages;

import java.util.Random;

public class Druide extends Gaulois {
	private int nbDose;
	Random rand = new Random();
	private int puissance;
	public Druide(String nom, int force) {
		super(nom, force);
		nbDose=0;
		puissance=rand.nextInt(5)+2;
	}
	
	public void fabriquerPotion(int nbDoseFab) {
		this.parler(" J'ai concoct� "+nbDoseFab+" doses de potion magique. Elle a une force de "+this.puissance);
		nbDose=nbDose+nbDoseFab;
	}
	public int getNbDose() {
		return this.nbDose;
	}
	 public void boosterGaulois(Gaulois gaulois) {
	        if (gaulois.getNom().equals("Ob�lix")) {
	            this.parler("� Non, Ob�lix Non !... Et tu le sais tr�s bien");
	        } else {
	            if (this.nbDose > 0) {
	                gaulois.booste(this.puissance);
	                this.parler("Tiens " + gaulois.getNom() + ", un peu de potion magique.");
	                nbDose--;
	            } else {
	                this.parler("D�sol� " + gaulois.getNom() + ", il n'y a plus une seule goutte de potion.");
	            }
	        }
	    }
	}
