package personnages;

public class Soldat extends Romain {
	public String grade;
	public Soldat(String nom, int force,String grade ) {
	    	super(nom, force);
	    	this.grade=grade;
	    }
}
