public class Livre extends Produit{
    private String titre, auteur;
    private int nbrPages;

    public Livre(double prix, String ref, String titre, String auteur, int nbrPages) {
        super(prix, ref);
        this.titre = titre;
        this.auteur = auteur;
        this.nbrPages = nbrPages;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNbrPages() {
        return nbrPages;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                '}';
    }
}
