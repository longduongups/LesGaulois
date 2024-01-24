package personnages;

public abstract class Personnage {
	 public String nom;
	 private int force;
	 public Personnage(String nom, int force) {
	    	this.nom=nom;
	    	this.force=force;
	    }
	 public String getNom() {
	    	return this.nom;
	    }
	 public void parler(String text) {
	    	System.out.println(" "+ this.donnerAuteur()+" "+this.nom +": "+text);
	    }
	 public void recevoirCoup(int forceCoup){
		 this.force=this.force-forceCoup;
		 if (this.force>0) {
			 this.parler(": Aie!\n");	 
		 }else {
			 this.force=0;
			 this.parler(": J'abandonne...\n");
		 }
	 }
	 protected abstract String donnerAuteur();
	 public void frapper(Personnage adversaire) {
	    	System.out.println(this.donnerAuteur()+ " "+this.nom+" envoie un grand coup dans la machoire de "+adversaire.nom);
	    	adversaire.recevoirCoup(this.force/3);
	    }
}
