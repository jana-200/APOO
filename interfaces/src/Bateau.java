import java.util.ArrayList;

public class Bateau {
    private String nom;
    private int nbrCabines;
    private ArrayList<String> activites= new ArrayList<>();

    public Bateau(String nom, int nbrCabines, ArrayList<String> activites) {
        this.nom = nom;
        this.nbrCabines = nbrCabines;
        this.activites = activites;
    }
    public String getNom() {
        return nom;
    }
    public int getNbrCabines() {
        return nbrCabines;
    }
    public boolean contient(String activite){
        return this.activites.contains(activite);
    }
    public boolean ajouter(String activite){
        if(contient(activite))
            return false;
        return activites.add(activite);
    }
    public boolean supprimer(String activite){
        if(!contient(activite))
            return false;
        return activites.remove(activite);
    }

    @Override
    public String toString() {
        return "Bateau{" +
                "nom='" + nom + '\'' +
                ", nbrCabines=" + nbrCabines +
                '}';
    }
}
