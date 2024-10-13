public class Partie {
    private Date date;
    private Joueur joueurBlanc, joueurNoir;
    private Tournoi tournoi;
    private double pointsBlanc,pointsNoir=0;

    Partie(Date date,Joueur joueurBlanc, Joueur joueurNoir,Tournoi tournoi ){
        this.date=date;
        this.joueurBlanc=joueurBlanc;
        this.joueurNoir=joueurNoir;
        this.tournoi=tournoi;
    }
    public Date getDate() {
        return this.date;
    }
    public Joueur getJoueurBlanc() {
        return this.joueurBlanc;
    }
    public Joueur getJoueurNoir() {
        return this.joueurNoir;
    }
    public Tournoi getTournoi() {
        return this.tournoi;
    }
    public double getPointsBlanc() {
        return this.pointsBlanc;
    }
    public double getPointsNoir() {
        return this.pointsNoir;
    }
    public boolean enregistrerResultat(double pointsBlanc){
        if(pointsBlanc==1||pointsBlanc==0||pointsBlanc==0.5 && (this.pointsBlanc==0 && this.pointsNoir==0) ){
            this.pointsBlanc=pointsBlanc;
            this.pointsNoir=1-pointsBlanc;
            joueurBlanc.incrementerNbrParties();
            joueurNoir.incrementerNbrParties();
            return true;
        }
        else
            return false;
    }
    public Joueur recupererGagnant(){
        Joueur gagnant;
        if(pointsBlanc>pointsNoir){
            gagnant=joueurBlanc;
            return gagnant;}
        else{
            if(pointsBlanc<pointsNoir){
                gagnant=joueurNoir;
                return gagnant;}
            else{
                return null;
            }
        }
    }

    public String toString() {
        return getTournoi().getNom()+" " +getJoueurBlanc().getNom() + " "+ getJoueurBlanc().getPrenom() + " VS " + getJoueurNoir().getNom()+ " "+getJoueurNoir().getPrenom();
    }
}
