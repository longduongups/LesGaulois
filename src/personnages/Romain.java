package personnages;

public class Romain extends Personnage{

	public Romain(String nom,int force) {
		super(nom, force);
	}
	 protected String donnerAuteur() {
	    	return "Le romain ";
	    }
	 public static void main(String[] args) {
	    	Romain minus =new Romain("Minus",6);
			System.out.println(minus.getNom());
			minus.parler(" UN GAU... UN GAUGAU...\n");
			for (int i =0;i<2;i++) {
			minus.recevoirCoup(3);
			}
	    }
}
