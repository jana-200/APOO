import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class VoyageOrganise extends AgenceDeVoyage implements Iterable<Etape> {
    private ArrayList<Etape> liste = new ArrayList<>();
    private String nom;
    private double prix;

    public VoyageOrganise(LocalDate dateDepart, int dureeSejours, ArrayList<Etape> liste, String nom, double prix) {
        super(dateDepart, dureeSejours);
        this.liste = liste;
        this.nom = nom;
        this.prix = prix;
    }

    public boolean contient(Etape etape){
        return this.liste.contains(etape);
    }
    public boolean ajouter(Etape etape){
        if(contient(etape) || etape.getDate().isAfter(getDateDepart()))
            return false;
        return liste.add(etape);
    }
    public boolean supprimer(Etape etape){
        if(!contient(etape))
            return false;
        return liste.remove(etape);
    }

    @Override
    public Iterator<Etape> iterator() {
        return this.liste.iterator();
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public double calculerPrix(){
        return getPrix() ;
    }

    @Override
    public String toString() {
        String text="";
        for (Etape etape:liste) {
            text+= etape.getVille()+", ";
        }
        return text ;
    }
}
