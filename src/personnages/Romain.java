package personnages;

public class Romain {
	public String nom;
	private int force;
	public Romain(String nom,int force) {
		this.nom=nom;
		this.force=force;
	}
	public String getNom() {
		return this.nom;
	}
	 public void parler(String text) {
	    	System.out.println("Le romain " + this.nom +": " +text);
	    }
	 public void recevoirCoup(int forceCoup){
		 this.force=this.force-forceCoup;
		 if (this.force>0) {
			 this.parler("Aie!");	 
		 }else {
			 this.force=0;
			 this.parler("J'abandonne...");
		 }
		 
	 }
	 public static void main(String[] args) {
	    	Romain minus =new Romain("Minus",6);
			System.out.println(minus.getNom());
			minus.parler("UN GAU... UN GAUGAU...");
			for (int i =0;i<2;i++) {
			minus.recevoirCoup(3);
			}
	    }
}
