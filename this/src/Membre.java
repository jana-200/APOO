public class Membre {
    private String nom, prenom , numeroTel;
    private Membre parrain;

    Membre(String nom, String prenom, String numeroTel){
        this.nom=nom;
        this.prenom=prenom;
        this.numeroTel=numeroTel;
    }
    public String getNom() {
        return this.nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public String getNumeroTel() {
        return this.numeroTel;
    }
    public Membre getParrain() {
        return this.parrain;
    }
    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public boolean initialiserParrain(Membre parrain){
        if(parrain.getNom()==this.getNom() && parrain.getPrenom()==this.getPrenom() || this.parrain!=null)
            return false;
        else {
            this.parrain = parrain;
            return true;
        }
    }

    public String toString() {
        if(this.parrain!=null){
            return "Membre : " +getNom()+ " "+ getPrenom() + " "+ getNumeroTel() + "\n"+"Parrain : "
                    + this.parrain.getNom()+ " "+ this.parrain.getPrenom();
        }
        else
            return "Membre : " +getNom()+ " "+ getPrenom() + " "+ getNumeroTel() +"\n"+"Ce membre n'a pas de parrain " ;
    }

}
