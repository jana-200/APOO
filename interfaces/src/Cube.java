import java.util.Objects;

public class Cube implements Solide {
    private double cote;

    public Cube(double cote) {
        if(cote<=0)
            throw new IllegalArgumentException("le côté ne peut etre nul");
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return Double.compare(cote, cube.cote) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cote);
    }

    @Override
    public double calculerVolume() {
        return Math.pow(cote,3);
    }

    @Override
    public double calculerSurface() {
        return (cote*cote)*6;
    }

    @Override
    public String toString() {
        return "Cube de côté " + cote ;
    }
}
