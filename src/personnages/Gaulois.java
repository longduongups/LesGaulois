package personnages;

public class Gaulois extends Personnage{

    public Gaulois(String nom, int force) {
    	super(nom, force);
    }

   
    protected String donnerAuteur() {
    	return "Le gaulois";
    }
   
    public static void main(String[] args) {
    	Gaulois asterix =new Gaulois("Asterix",8);
		System.out.println(asterix.getNom());
		asterix.parler("Bonjour a tous");	
    }
    public void booster() {
    	
    }
}
	