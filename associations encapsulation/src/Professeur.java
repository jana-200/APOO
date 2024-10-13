public class Professeur {

     private String matricule, nom, prenom,specialistaion;

     public Professeur(String nMatricule, String nNom, String nPrenom, String nSpecialisation){
         matricule = nMatricule;
         nom = nNom;
         prenom = nPrenom;
         specialistaion = nSpecialisation ;
     }
    public String getMatricule() {
        return matricule;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getSpecialistaion() {
        return specialistaion;
    }
    public String toString() {
        return getMatricule()+ " " + getNom() +" "+ getPrenom() + "\n"+ "Spécialisation : "+ getSpecialistaion();
    }
}
