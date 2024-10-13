public class Serie {
    private char nom;
    private Etudiant delegue;

    Serie(char nom ){
        this.nom=nom;
    }
    public char getNom() {
        return this.nom;
    }
    public Etudiant getDelegue() {
        return this.delegue;
    }
    public void elireDelegue(Etudiant delegue){
        if(delegue.getSerie()!= this || this.getDelegue()!=null )
            throw new IllegalStateException("l'eleve ne peut etre delegue");
        if(delegue==null)
            throw new IllegalArgumentException("choiissez un delegue");
        this.delegue=delegue;
    }

    public String toString() {
        if(this.getDelegue()!=null)
            return "Série "+ getNom()+" Délégué : " +getDelegue().getPrenom()+ " " +getDelegue().getNom();
        else
            return "Série "+ getNom() ;
    }
}
