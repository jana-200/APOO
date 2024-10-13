import java.util.Objects;

public class Article {
    private String reference;
    private String nom;
    private String description;
    private double prixHTVA;
    private double tauxTVA;
    final static double tauxTVAParDefaut=21;
    private static int nbrArticles;

    public Article(String reference, String nom, String description, double prixHTVA, double tauxTVA) {
        if(reference==null || reference.isEmpty())
            throw new IllegalArgumentException("la référence ne peut pas etre vide");
        if(nom==null || nom.isEmpty())
            throw new IllegalArgumentException("le nom ne peut pas etre vide");
        if(prixHTVA<=0)
            throw new IllegalArgumentException("le prix doit etre positif");
        if(tauxTVA <0 || tauxTVA>100)
            throw new IllegalArgumentException("le taux de TVA doit etre compris entre 0 et 100");

        setTauxTVA(tauxTVA);
        setDescription(description);
        setPrixHTVA(prixHTVA);
        this.reference = reference;
        this.nom = nom;
        nbrArticles++;
    }

    public Article(String reference, String nom, String description, double prixHTVA) {
        this(reference,nom,description,prixHTVA,tauxTVAParDefaut);
    }

    public static int getNbrArticles() {
        return nbrArticles;
    }


    public String getReference() {
        return reference;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrixHTVA() {
        return prixHTVA;
    }

    public void setPrixHTVA(double prixHTVA) {
        if(prixHTVA<=0)
            throw new IllegalArgumentException("le prix doit etre positif");
        this.prixHTVA = prixHTVA;
    }

    public double getTauxTVA() {
        return tauxTVA;
    }

    public void setTauxTVA(double tauxTVA) {
        if(tauxTVA <0 || tauxTVA>100)
            throw new IllegalArgumentException("le taux de TVA doit etre compris entre 0 et 100");
        this.tauxTVA = tauxTVA;
    }


    public double calculerPrixTVAComprise() {
        return prixHTVA * (1+ tauxTVA/100);
    }

    public double calculerPrixTVAComprise(int reduction) {
        if(reduction<=0 || reduction>=100)
            throw new IllegalArgumentException("la reduction doit etre comprise entre 0 et 100");
        return calculerPrixTVAComprise() * (1-reduction/100.0);
    }

    public String toString() {
        return "Référence : " + reference + "\nNom : " + nom + " (prix HTVA : " + prixHTVA + ", taux de TVA : " + tauxTVA +"%)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return reference.equals(article.reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reference);
    }
}
