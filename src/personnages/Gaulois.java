package personnages;

public class Gaulois extends Personnage{
	int puissance;
    public Gaulois(String nom, int force) {
    	super(nom, force);
    	puissance=1;
    }

   
    protected String donnerAuteur() {
    	return "Le gaulois";
    }
   
    public static void main(String[] args) {
    	Gaulois asterix =new Gaulois("Asterix",8);
		System.out.println(asterix.getNom());
		asterix.parler("Bonjour a tous");	
    }
    public void booste(int puissance) {
    	this.puissance=puissance;
    	this.force=this.force*this.puissance;
    }
    public void frapper(Personnage adversaire) { 	
    	System.out.println(this.donnerAuteur()+ " "+this.getNom()+" envoie un coup de force"+this.getForce() +" au "+adversaire.getNom());
    	adversaire.recevoirCoup(this.force/3);
    	if (this.puissance>1) {
        	this.puissance= (int) (this.puissance-0.5);
        	this.force=this.force-this.force*0.5;
        	}
    }
}
	