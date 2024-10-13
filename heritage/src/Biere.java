public class Biere extends BoissonAlcoolisee {
    private boolean pression;

    public Biere(String nom, double prix, double contenance,double degreAloccol, boolean pression) {
        super(nom, prix, contenance, degreAloccol);
        this.pression = pression;
    }

    public boolean isPression() {
        return pression;
    }

    @Override
    public String toString() {
        if(pression)
            return "Bière pression : "+  super.toString();
        return  "Bière en bouteille : "+  super.toString();
    }
}
