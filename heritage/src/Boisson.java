import java.util.Objects;
public class Boisson {
    private String nom;
    private double prix ,contenance;
    public Boisson(String nom, double prix, double contenance) {
        this.nom = nom;
        this.prix = prix;
        this.contenance = contenance;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public double getContenance() {
        return contenance;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boisson boisson = (Boisson) o;
        return Double.compare(contenance, boisson.contenance) == 0 && Objects.equals(nom, boisson.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, contenance);
    }

    @Override
    public String toString() {
        return  nom + " (" + contenance + " cl)"+ " à " + prix + " euros";
    }
}
