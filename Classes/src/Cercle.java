public class Cercle {
    double rayon;
    Cercle(double nRayon){
        rayon = nRayon;
    }
    double calculerAire(){
        return rayon * rayon *Math.PI;
    }
    public String toString(){
        return "cercle de rayon " + rayon;
    }
}