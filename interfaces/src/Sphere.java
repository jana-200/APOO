import java.util.Objects;

public class Sphere implements Solide{
    private double rayon;

    public Sphere(double rayon){
        if(rayon<=0)
            throw new IllegalArgumentException("le rayon ne peut etre nul");
        this.rayon=rayon;
    }

    public double getRayon() {
        return rayon;
    }

    @Override
    public double calculerVolume() {
        return 4*Math.PI*Math.pow(rayon,3)/3;
    }

    @Override
    public double calculerSurface() {
        return 4*Math.PI*Math.pow(rayon,2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sphere sphere = (Sphere) o;
        return Double.compare(rayon, sphere.rayon) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rayon);
    }

    @Override
    public String toString() {
        return "Sphere de rayon " + rayon ;
    }
}
