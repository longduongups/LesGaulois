package personnages;

public class Soldat extends Romain {
    public enum Equipement {
        CASQUE("Casque"), PLASTRON("Plastron"), BOUCLIER("Bouclier");

        private String nom;

        Equipement(String nom) {
            this.nom = nom;
        }

        @Override
        public String toString() {
            return nom;
        }
    }

    private Equipement[] equipements = new Equipement[3]; 
    public String grade;
    public Soldat(String nom, int force, String grade) {
        super(nom, force);
        this.grade = grade;
    }
    public void equiper(Equipement equipement) {
        // V�rifier si le soldat porte d�j� un �quipement du m�me type
        for (Equipement e : equipements) {
            if (e == equipement) {
                System.out.println("Le soldat porte d�j� un(e) " + equipement);
                return;
            }
        }
        
        // Si le soldat ne porte pas d�j� un �quipement du m�me type, �quiper le nouvel �quipement
        for (int i = 0; i < equipements.length; i++) {
            if (equipements[i] == null) {
                equipements[i] = equipement;
                System.out.println(getNom() + " �quipe " + equipement);
                return;
            }
        }
        System.out.println("Impossible d'�quiper plus d'un �quipement de ce type.");
    }
    public void desequiper(Equipement equipement) {
        for (int i = 0; i < equipements.length; i++) {
            if (equipements[i] == equipement) {
                equipements[i] = null;
                System.out.println(getNom() + " retire " + equipement);
                return;
            }
        }
        System.out.println("Cet �quipement n'est pas �quip�.");
    }
    @Override
    public void frapper(Personnage adversaire) {
        double forceCoup = getForce(); // Force de base du coup
        for (Equipement equipement : equipements) {
            if (equipement == Equipement.CASQUE) {
                forceCoup -= 2; // Un casque diminue la force de coup de 2
            } else if (equipement == Equipement.PLASTRON || equipement == Equipement.BOUCLIER) {
                forceCoup -= 3; // Un plastron ou un bouclier diminue la force de coup de 3
            }
        }
        System.out.println(this.donnerAuteur() + " " + this.getNom() + " frappe avec toute sa force " + forceCoup + " au " + adversaire.getNom());
        adversaire.recevoirCoup((int) forceCoup); // Forcer la conversion en int
    }
    public void parler(String text) {
        System.out.println(grade + " " + this.donnerAuteur() + " " + this.getNom() + " : " + text);
    }
}
