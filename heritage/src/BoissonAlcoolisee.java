public class BoissonAlcoolisee extends Boisson{
    private double degreAlcool;
    public BoissonAlcoolisee(String nom, double prix, double contenance,double degreAlcool) {
        super(nom, prix,contenance);
        this.degreAlcool=degreAlcool;
    }

    public double getDegreAloccol() {
        return degreAlcool;
    }

    @Override
    public String toString() {
        return super.toString() + " (Degré d'alcool : " + degreAlcool+"°)";
    }
}
