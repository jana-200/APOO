public class Vin extends BoissonAlcoolisee {
    private String cepage,couleur, region, pays;
    public Vin(String nom, double prix, double contenance, double degreAloccol, String cepage, String couleur, String region, String pays) {
        super(nom, prix, contenance, degreAloccol);
        if(couleur!="rouge" && couleur!="blanc" && couleur!="rosé")
            throw new IllegalArgumentException("La couleur doit être choisie parmi les valeurs suivantes : rouge, blanc, rosé");
        this.cepage = cepage;
        this.couleur = couleur;
        this.region = region;
        this.pays = pays;
    }

    public String getCepage() {
        return cepage;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getRegion() {
        return region;
    }

    public String getPays() {
        return pays;
    }

    @Override
    public String toString() {
        return "vin "+ couleur +" : " + super.toString() ;
    }

}
