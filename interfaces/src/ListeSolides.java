import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
public class ListeSolides implements Iterable<Solide>{
    private ArrayList<Solide> liste = new ArrayList<>();
    public boolean estVide(){
        return this.liste.isEmpty();
    }

    public int nombreDeSolides(){
        return this.liste.size();
    }
    public boolean contient(Solide solide){
        return this.liste.contains(solide);
    }

    public boolean ajouter(Solide solide){
        if(contient(solide))
            return false;
        return liste.add(solide);
    }

    public boolean supprimer(Solide solide){
        if(!contient(solide))
            return false;
        return liste.remove(solide);
    }

    @Override
    public Iterator<Solide> iterator() {
        return this.liste.iterator();
    }

    public ArrayList<Solide> trouverPlusGrand(){
        double volMax=0;
        ArrayList<Solide> newListe= new ArrayList<>();
        for (Solide solide :liste) {
            if (solide.calculerVolume() >= volMax) {
                volMax = solide.calculerVolume();
            }
        }
        for (Solide solide :liste) {
            if (solide.calculerVolume() == volMax) {
                newListe.add(solide);
            }
        }
        return newListe;
    }

    public String toString(){
        String texte="Liste des solides \n";
        for (Solide solide :liste) {
            texte+= solide.toString()+"\n";
        }
        return texte;
    }

}
