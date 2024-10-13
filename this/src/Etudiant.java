public class Etudiant {
    private String matricule, nom, prenom;
    private Serie serie;
    Etudiant(String matricule, String nom, String prenom, Serie serie){
        this.matricule=matricule;
        this.nom=nom;
        this.prenom=prenom;
        this.serie=serie;
    }
    public String getMatricule() {
        return this.matricule;
    }
    public String getNom() {
        return this.nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public Serie getSerie() {
        return this.serie;
    }
    public void changerSerie(Serie serie){
        if(this.serie==serie || serie==null)
            throw new IllegalArgumentException("le changement n'est pas possible");
        if( this.serie.getDelegue()!= null && this.serie.getDelegue().getNom()==this.getNom())
            throw new IllegalStateException("l'etudiant est le delegue, il ne peut pas changer de serie");
    }

    public String toString() {
        return getPrenom()+ " "+ getNom() + " "+ "\n" + "Matricule : "+getMatricule() + "\n" +"Serie : "+ serie.getNom();
    }
}
