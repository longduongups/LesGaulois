package sites;

import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] romains = new Soldat[3];
	public Camp(Soldat commandant) {
		this.commandant=commandant;
	}
	public String getCommandant() {
		return this.commandant.getNom();
	}
	public boolean ajouterSoldat(Soldat soldat) {
		for (int i=0; i< this.romains.length;i++) {
			if (this.romains[i]==null) {
				this.romains[i]=soldat;
				soldat.parler("Je mets mon épée au service de Rome dans le camp dirigé par Minus");
				return true;
			}
		}
				this.commandant.parler("Désolé " +soldat.getNom()+" notre camp est complet");
					return false;
		}
	public void afficherCamp() {
		System.out.println("Le camp dirigé par "+this.commandant.getNom()+" contient les soldats :");
		for (int i=0;i<this.romains.length;i++) {
			System.out.println(this.romains[i].getNom());
		}
	}
	public boolean changerCommandant(Soldat soldat) {
		if (soldat.grade=="CENTURION") {
			this.commandant=soldat;
			soldat.parler(" Moi "+soldat.getNom()+" je prends la direction du camp romain.");
		return true;
		}
		else {
			soldat.parler(" Je ne suis pas suffisamment gradé pour prendre la direction du camp");
		return false;
		}
		
	}
}
