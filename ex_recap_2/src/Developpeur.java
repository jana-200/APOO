public class Developpeur {
    private String nom, specialite;
    private double salaire;
    private int nbrProjetsEnCours;
    public static final String SPECIALTE_PAR_DEFAUT = "full-stack";


    public Developpeur(String nom, double salaire) {
        this.specialite=SPECIALTE_PAR_DEFAUT;
        this.nom = nom;
        this.salaire = salaire;
    }
    public Developpeur(String nom, String specialite, double salaire) {
        if(nom== null || nom.isEmpty()) throw new IllegalArgumentException();
        if(specialite== null || specialite.isEmpty()) throw new IllegalArgumentException();
        this.nom = nom;
        this.specialite = specialite;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public double getSalaire() {
        return salaire;
    }

    public int getNbrProjetsEnCours() {
        return nbrProjetsEnCours;
    }

    public void setSpecialite(String specialite) {
        if(specialite== null || specialite.isEmpty()) throw new IllegalArgumentException();
        this.specialite = specialite;
    }
    public void signalerNvProjet(){
        nbrProjetsEnCours++;
    }
    public void signalerFinProjet(){
        nbrProjetsEnCours--;
    }

    @Override
    public String toString() {
        return "Developpeur : " + nom  + ", specialite : " + specialite + ", salaire : " + salaire + ", nbrProjetsEnCours : " + nbrProjetsEnCours ;
    }
}



