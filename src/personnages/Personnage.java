package personnages;

public abstract class Personnage {
	 private String nom;
	 protected int force;
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
	 public double getForce() {
	    	return this.force;
	    }
	 public void setForce(int force) {
		 this.force=force;
	 }
	 public void recevoirCoup(int d){
		 this.force=this.force-d;
		 if (this.force>0) {
			 this.parler(": Aie!\n");	 
		 }else {
			 this.force=0;
			 this.parler(": J'abandonne...\n");
		 }
	 }
	 protected abstract String donnerAuteur();
	 public void frapper(Personnage adversaire) {
	    	System.out.println(this.donnerAuteur()+ " "+this.nom+" envoie un coup de force"+this.getForce() +" au "+adversaire.nom);
	    	adversaire.recevoirCoup(this.force/3);
	    }
	 public boolean aTerre() {
		 return this.getForce()<=0;
	 }
}
