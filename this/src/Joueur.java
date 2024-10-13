public class Joueur {
    private String matricule, nom, prenom;
    private Date dateNaissance;
    private Club club;
    private int partieJouees, elo=0;

    Joueur(String matricule, String nom, String prenom,Date dateNaissance, Club club){
        this.nom= nom;
        this.club= club;
        this.prenom= prenom;
        this.matricule= matricule;
        this.dateNaissance=dateNaissance;
    }
    public String getNom() {
        return this.nom;
    }
    public Club getClub() {
        return this.club;
    }
    public String getMatricule() {
        return this.matricule;
    }
    public Date getDateNaissance() {
        return this.dateNaissance;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public int getElo() {
        return this.elo;
    }
    public int getPartieJouees() {
        return this.partieJouees;
    }
    public void incrementerNbrParties(){
        this.partieJouees++;
    }
    public boolean modifierElo(int elo){
        if(elo>=1500 && partieJouees>=10){
            this.elo=elo;
            return true;
        }
        else
            return false;
    }
    public boolean changerClub(Club club){
        if(this.club.getNom()== club.getNom())
            return false;
        else{
            if(this.nom == this.getClub().getDirecteur().getNom()){
                this.club.supprimerDirecteur();
                this.club=club;
            }
            else
                this.club=club;
            return true;
        }
    }
    public String toString(){
        return getMatricule()+" "+ getPrenom()+" "+ getNom()+" Club: " +getClub().getNom()+" né le : "+ getDateNaissance()+ "\n"+ "nbr de parties: "+ getPartieJouees()+ "\n"+ "Points elo: "+ getElo();
    }

}
