public class CompteEnBanque {

    private Personne titulaire;
    private Date dateOuverture ,validiteId;
    private String numero;
    private double solde;

    public CompteEnBanque(Personne nTitulaire,Date nDateOuverture,Date nValiditeId,String nNumero,double nSolde ){
        titulaire = nTitulaire ;
        dateOuverture = nDateOuverture;
        validiteId = nValiditeId;
        numero = nNumero;
        solde = nSolde;
    }
    public Personne getTitulaire() {
        return titulaire;
    }
    public Date getDateOuverture() {
        return dateOuverture;
    }
    public Date getValiditeId() {
        return validiteId;
    }
    public String getNumero() {
        return numero;
    }
    public double getSolde() {
        return solde;
    }
    public void setValiditeId(Date validiteId) {
        this.validiteId = validiteId;
    }
    public boolean retrait(double montant){
        solde = solde-montant;
        if(montant>getSolde())
            return false;
        else
            return true;
    }
    public void depot(double montant){
        solde=solde+montant;
    }

    public boolean virement(double montant,CompteEnBanque compteDestinataire ){
        solde = solde-montant;
        if(montant>getSolde())
            return false;
        else
            return true;
    }
    public String toString(){
        return "numero de compte : "+ getNumero()+"\n" +"titulaire : "+ getTitulaire().getNom() + " " + getTitulaire().getPrenom() + "\n" +"date d'ouverture : " +getDateOuverture() + "\n" + "solde : " + getSolde() +" $";
    }
}
