public class Tournoi {
    private String nom;
    private Date dateDebut, dateFin;
    private Club organisateur;

    Tournoi(String nom,Date dateDebut, Date dateFin){
        this.nom=nom;
        this.dateDebut=dateDebut;
        this.dateFin=dateFin;
    }
    Tournoi(String nom,Date dateDebut, Date dateFin,Club organisateur ){
        this.nom=nom;
        this.dateDebut=dateDebut;
        this.dateFin=dateFin;
        this.organisateur=organisateur;
    }
    public String getNom() {
        return this.nom;
    }
    public Date getDateDebut() {
        return this.dateDebut;
    }
    public Date getDateFin() {
        return this.dateFin;
    }
    public Club getOrganisateur() {
        return this.organisateur;
    }

    public String toString() {
        if(this.getOrganisateur()!=null)
            return getNom()+ " "+ getDateDebut()+"-->"+ getDateFin()+ "\n"+ "Organisé par: "+ getOrganisateur().getNom();
        else
            return getNom()+ " "+ getDateDebut()+"-->"+ getDateFin();
    }
}
