public class Club {
    private String nom, matricule;
    private Adresse adresse;
    private Joueur directeur;

    Club(String nom, String matricule, Adresse adresse){
        this.nom=nom;
        this.matricule=matricule;
        this.adresse=adresse;
    }
    public String getNom() {
        return this.nom;
    }
    public String getMatricule() {
        return this.matricule;
    }
    public Adresse getAdresse() {
        return this.adresse;
    }
    public Joueur getDirecteur() {
        return this.directeur;
    }
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
    public boolean elireDirecteur(Joueur directeur){
        if(this.directeur==null && directeur.getClub().getNom()==this.nom){
            this.directeur=directeur;
            return true;
        }
        else
            return false;
    }
    public void supprimerDirecteur(){
        this.directeur=null;
    }

    public String toString() {
        if(this.directeur==null)
            return getNom()+ " "+ getMatricule()+ " "+ getAdresse();
        else
            return getNom()+ " "+ getMatricule()+ " "+ getAdresse()+ "\n" + "Directeur : "+ directeur.getNom()+ " "+ directeur.getPrenom();
    }
}
