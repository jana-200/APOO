import java.time.LocalDate;
import java.util.ArrayList;

public class Croisiere extends VoyageOrganise {
    private Bateau bateau;

    public Croisiere(LocalDate dateDepart, int dureeSejours, ArrayList<Etape> liste, String nom, double prix, Bateau bateau) {
        super(dateDepart, dureeSejours, liste, nom, prix);
        this.bateau = bateau;
    }

    public Bateau getBateau() {
        return bateau;
    }
    @Override
    public String toString() {
        return "Croisiere{ " +
                "bateau= " + bateau ;
    }
}
