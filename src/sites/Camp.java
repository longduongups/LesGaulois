package sites;

import personnages.Soldat;

public class Camp {
	public Soldat commandant;
	public Soldat[] romains = new Soldat[3];
	public Camp(Soldat commandant) {
		this.commandant=commandant;
	}
	public String getCommandant() {
		return this.commandant.nom;
	}
	public boolean ajouterSoldat(Soldat soldat) {
		for (int i=0; i< this.romains.length;i++) {
			if (this.romains[i]==null) {
				this.romains[i]=soldat;
				soldat.parler("Je mets mon épée au service de Rome dans le camp dirigé par Minus");
				return true;
			}
		}
				this.commandant.parler("Désolé " +soldat+" notre camp est complet");
					return false;
		}
	public void afficherCamp() {
		System.out.println("Le camp dirigé par "+this.commandant+" contient les soldats :");
		for (int i=0;i<this.romains.length;i++) {
			System.out.println(this.romains[i].nom);
		}
	}
	public boolean changerCommandant(Soldat soldat) {
		if (soldat.grade=="CENTURION") {
			this.commandant=soldat;
			soldat.parler(" Moi "+soldat.nom+" je prends la direction du camp romain.");
		return true;
		}
		else {
			soldat.parler(" Je ne suis pas suffisamment gradé pour prendre la direction du camp");
		return false;
		}
		
	}
}
