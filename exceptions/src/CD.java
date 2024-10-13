public class CD extends Produit{
    private String titre, artiste;
    private int nbrMorceaux;

    public CD(double prix, String ref, String titre, String artiste, int nbrMorceaux) {
        super(prix, ref);
        if(titre.isEmpty()){
            throw new IllegalArgumentException("... le titre ne peut être vide");
        }
        if(artiste.isEmpty()){
            throw new IllegalArgumentException("... l'artiste doit exister");
        }
        if(nbrMorceaux==0){
            throw new IllegalArgumentException("... le nombre de morceaux ne peut être null");
        }

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
