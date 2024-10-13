import java.util.Objects;

public class Cylindre implements Solide{
    private double rayon, hauteur;

    public Cylindre(double rayon, double hauteur) {
        if(rayon<=0 || hauteur<=0)
            throw new IllegalArgumentException("le rayon et la hauteur ne peuvent etre nul");
        this.rayon = rayon;
        this.hauteur = hauteur;
    }

    public double getRayon() {
        return rayon;
    }

    public double getHauteur() {
        return hauteur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cylindre cylindre = (Cylindre) o;
        return Double.compare(rayon, cylindre.rayon) == 0 && Double.compare(hauteur, cylindre.hauteur) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rayon, hauteur);
    }

    @Override
    public double calculerVolume() {
        return Math.PI*Math.pow(rayon,2)*hauteur;
    }

    @Override
    public double calculerSurface() {
        return 2*Math.PI*Math.pow(rayon,2)+2*Math.PI*rayon*hauteur;
    }

    @Override
    public String toString() {
        return "Cylindre rayon " + rayon + " et de hauteur " + hauteur;
    }
}
