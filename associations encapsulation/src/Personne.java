public class Personne {

    private final String nom;
    private final String prenom;
    private final Date naissance;
    private Adresse domicile;

    public Personne( String nNom,String nPrenom, Date nNaissance , Adresse nDomicile){
        nom = nNom;
        prenom = nPrenom;
        naissance = nNaissance;
        domicile = nDomicile;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }

    public void demenager(String nAdresse){
        String demengament = nAdresse;
    }
    public int calculerAgeActuel(){
        return 2023- naissance.getAnnee();
    }
    public int calculerAgeRandom(int anneeRandom){
        return anneeRandom - naissance.getAnnee();
    }
    public Adresse getDomicile() {
        return domicile;
    }
    public Date getNaissance() {
        return naissance;
    }
    public String toString(){
        return  getPrenom() + " " + getNom() + " né le " +getNaissance() +" et domicilié à " + getDomicile();
    }
}
