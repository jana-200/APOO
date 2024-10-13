import java.util.ArrayList;

public class Projet {
    private int num;
    private String nom;
    private boolean termine;
    private ArrayList<Developpeur> developpeurs= new ArrayList<>();
    private static int nbrDeProjets=0;

    public Projet(String nom) {
        this.nom = nom;
        this.termine=false;
        this.num=++nbrDeProjets;
    }

    public int getNum() {
        return num;
    }

    public String getNom() {
        return nom;
    }
    public boolean isTermine(){
        return termine;
    }
    public boolean terminer(){
        if(this.termine) return false;
        for (Developpeur dev: developpeurs) {
            dev.signalerFinProjet();
        }
        this.termine=true;
        return true;
    }
    public boolean ajouter(Developpeur dev){
        if(this.termine) return false;
        if(developpeurs.contains(dev)) return false;
        this.developpeurs.add(dev);
        dev.signalerNvProjet();
        return true;
    }
    public boolean retirer(Developpeur dev){
        if(this.termine) return false;
        if(!developpeurs.contains(dev)) return false;
        this.developpeurs.remove(dev);
        dev.signalerFinProjet();
        return true;
    }
    public Iterable<Developpeur> iterator(){
        return this.developpeurs;
    }

    @Override
    public String toString() {
        String text="Projet " +num +
                " : Site stages en cours\n" +
                "Developpeur(s) sur le projet : \n" ;
        for (Developpeur dev:developpeurs) {
            text+= dev.toString() + "\n";
        }
        return text;
    }
}
