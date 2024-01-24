package sites;

import personnages.Gaulois;
import personnages.Soldat;

public class Village {
	private Gaulois chef;
	private Gaulois[] gaulois = new Gaulois[50];
	public Village(Gaulois chef) {
		this.chef=chef;
	}
	public String getChef() {
		return this.chef.nom;
	}
	public void ajouterVillageois(Gaulois gaulois) {
		this.gaulois[this.gaulois.length]=gaulois;
	}
}
