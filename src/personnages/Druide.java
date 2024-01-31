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
		this.parler(" J'ai concocté "+nbDoseFab+" doses de potion magique. Elle a une force de "+this.puissance);
		nbDose=nbDose+nbDoseFab;
	}
	public int getNbDose() {
		return this.nbDose;
	}
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom()=="Obélix") {
			this.parler("« Non, Obélix Non !... Et tu le sais très bien");
		}
		else {
		if (this.nbDose!=0) {
			gaulois.setForce(gaulois.getForce()+this.puissance);
			this.parler("Tien "+gaulois.getNom()+" un peu de potion magique. ");
		}
		else {
			this.parler("Désolé "+gaulois.getNom()+" il n'y a plus une seule goutte de potion.");
		}
	}
	}
}
