public class Livre extends Produit{
    private String titre, auteur;
    private int nbrPages;

    public Livre(double prix, String ref, String titre, String auteur, int nbrPages) {
        super(prix, ref);
        if(titre.isEmpty()){
            throw new IllegalArgumentException("... le titre ne peut être vide");
        }
        if(auteur.isEmpty()){
            throw new IllegalArgumentException("... l'auteur doit exister");
        }
        if(nbrPages==0){
            throw new IllegalArgumentException("... le nombre de pages ne peut être null");
        }

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
