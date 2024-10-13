public class Date {

    private int jour, mois, annee;

    public Date(int nJour,int nMois, int nAnnee ){
        jour = nJour;
        mois = nMois;
        annee = nAnnee;
    }

    public int getJour() {
        return jour;
    }

    public int getMois() {
        return mois;
    }

    public int getAnnee() {
        return annee;
    }

    public String toString() {
        return getJour()+"/"+getMois()+"/"+getAnnee();
    }
}
