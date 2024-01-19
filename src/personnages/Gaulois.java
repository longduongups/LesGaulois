package personnages;

public class Gaulois {
    private String nom;
    private int force;
    public Gaulois(String nom, int force) {
    	this.nom=nom;
    	this.force=force;
    }
    public String getNom() {
    	return this.nom;
    }
    void parler(String text) {
    	System.out.print("Le gaulois " + this.nom +": " +text);
    }
    public static void main(String[] args) {
    	Gaulois asterix =new Gaulois("Asterix",8);
		System.out.println(asterix.getNom());
		asterix.parler("Bonjour a tous");
    }
   
}
	