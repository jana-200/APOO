public class CercleDansLePlan {

    private double rayon;
    private Point centre;

    public CercleDansLePlan(double nRayon, Point nCentre){
        rayon = nRayon;
        centre = nCentre;
    }
    public double getRayon() {
        return rayon;
    }
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    public Point getCentre() {
        return centre;
    }
    public void setCentre(Point centre) {
        this.centre = centre;
    }
    public String toString() {
        return "Rayon = "+ getRayon()+ " Coordonnées = "+ getCentre();
    }
}
