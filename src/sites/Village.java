package sites;

import personnages.Gaulois;
import personnages.Soldat;

public class Village {
	private Gaulois chef;
	private Gaulois[] gaulois = new Gaulois[4];
	public Village(Gaulois chef) {
		this.chef=chef;
	}
	public String getChef() {
		return this.chef.nom;
	}
	public boolean ajouterVillageois(Gaulois gaulois) {
		for (int i=0; i< this.gaulois.length;i++) {
			if (this.gaulois[i]==null) {
				this.gaulois[i]=gaulois;
				this.chef.parler(" Bienvenue " +gaulois+"!");
				return true;
			}
		}
				this.chef.parler("Désolé " +gaulois+" mon village est déjà bien rempli");
					return false;
		}
	public void afficherVillage() {
		System.out.println("Le village de  "+this.chef+" est habité par");
		for (int i=0;i<this.gaulois.length;i++) {
			System.out.println(this.gaulois[i].nom);
		}
	}
	public void changerChef(Gaulois gaulois) {
		this.chef.parler(" Je laisse mon grand bouclier au grand "+gaulois.nom);
		this.chef=gaulois;
		gaulois.parler("Merci !");
		
	}
}
