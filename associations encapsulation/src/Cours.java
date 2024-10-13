public class Cours {

     private String intitule, niveau;
     private int nbrInscrits;
     private Professeur professeur;

     public Cours(String nIntitule, String nNiveau, Professeur nProfesseur){
          intitule = nIntitule;
          niveau = nNiveau;
          professeur = nProfesseur;
     }
     public String getIntitule() {
          return intitule;
     }
     public String getNiveau() {
          return niveau;
     }
     public Professeur getProfesseur() {
          return professeur;
     }
     public void setProfesseur(Professeur professeur) {
          this.professeur = professeur;
     }
     public int getNbrInscrits() {
          return nbrInscrits;
     }
     public void signalerInscription(){
          nbrInscrits++;
     }
     public void signalerDesinscription(){
          nbrInscrits--;
     }
     public String toString() {
          return  getIntitule()+"\n" +"Niveau "+getNiveau() + " Donné par "+ getProfesseur().getPrenom() +" "+getProfesseur().getNom() +"\n" + "Nombre d'inscrits : " + getNbrInscrits();
     }
}
