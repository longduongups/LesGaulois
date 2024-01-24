package sites;

import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] romains = new Soldat[80];
	public Camp(Soldat commandant) {
		this.commandant=commandant;
	}
	public String getCommandant() {
		return this.commandant.nom;
	}
	public void ajouterSoldat(Soldat soldat) {
		this.romains[this.romains.length]=soldat;
	}
}
