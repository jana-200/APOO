public class CD extends Produit{
    private String titre, artiste;
    private int nbrMorceaux;

    public CD(double prix, String ref, String titre, String artiste, int nbrMorceaux) {
        super(prix, ref);
        this.titre = titre;
        this.artiste = artiste;
        this.nbrMorceaux = nbrMorceaux;
    }

    public int getNbrMorceaux() {
        return nbrMorceaux;
    }

    public String getTitre() {
        return titre;
    }

    public String getArtiste() {
        return artiste;
    }

    @Override
    public String toString() {
        return "CD{" +
                "titre='" + titre + '\'' +
                ", artiste='" + artiste + '\'' +
                ", nbrMorceaux=" + nbrMorceaux +
                '}';
    }
}
