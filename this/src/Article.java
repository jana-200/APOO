public class Article {
    private String ref, nom, description;
    private double prixHtva , tauxTva;

    Article(String ref, String nom, String description, double prixHtva, double tauxTva ){
        this.ref=ref;
        this.nom=nom;
        this.description=description;
        this.prixHtva=prixHtva;
        this.tauxTva=tauxTva;

    }
    Article(String ref, String nom, String description, double prixHtva){
        this.ref=ref;
        this.nom=nom;
        this.description=description;
        this.prixHtva=prixHtva;
        this.tauxTva=21;
    }
    public String getRef() {
        return this.ref;
    }
    public String getNom() {
        return this.nom;
    }
    public String getDescription() {
        return this.description;
    }
    public double getPrixHtva() {
        return this.prixHtva;
    }
    public double getTauxTva() {
        return this.tauxTva;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrixHtva(double prixHtva) {
        this.prixHtva = prixHtva;
    }
    public void setTauxTva(int tauxTva) {
        this.tauxTva = tauxTva;
    }
    public double calculerPrix(){
        double tva=(this.tauxTva+100)/100.0;
        double prix = this.prixHtva*tva;
        return prix ;
    }
    public double calculerPrix(double reduction){
        reduction= (100-reduction)/100.0;
        double tva=(this.tauxTva+100)/100.0;
        double prix = this.prixHtva*tva*reduction;
        return prix;
    }
    public String toString() {
        return "Nom : "+ getNom()+ "\n" + "Référence : "+ getRef();
    }
}
