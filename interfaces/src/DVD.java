public class DVD extends Produit{
    private String titre, realisateur;

    public DVD(double prix, String ref, String titre, String realisateur) {
        super(prix, ref);
        this.titre = titre;
        this.realisateur = realisateur;
    }

    public String getTitre() {
        return titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "titre='" + titre + '\'' +
                ", realisateur='" + realisateur + '\'' +
                '}';
    }
}
