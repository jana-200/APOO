public class Eleve {

    private String nom, prenom;
    private Cours coursPrincipal,coursComplementaire;

    public Eleve(String nNom, String nPrenomn ,Cours nCoursPrincipal,Cours nCoursComplementaire){
        nom = nNom;
        prenom = nPrenomn;
        coursPrincipal = nCoursPrincipal;
        coursPrincipal.signalerInscription();
        coursComplementaire = nCoursComplementaire;
        coursComplementaire.signalerInscription();
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public Cours getCoursPrincipal() {
        return coursPrincipal;
    }
    public Cours getCoursComplementaire() {
        return coursComplementaire;
    }
    public void setCoursComplementaire(Cours coursComplementaire) {
        this.coursComplementaire = coursComplementaire;
    }

    public String toString() {
        return "Eléve :"+getNom()+" "+getPrenom() + "\n" + "Cours Principal : "+ getCoursPrincipal().getIntitule()+ "\n" + "Cours complémentaire : "+ getCoursComplementaire().getIntitule();
    }
}
