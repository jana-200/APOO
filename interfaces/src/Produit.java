import java.util.Objects;

public abstract class Produit {
    private double prix;
    private String ref;

    public Produit(double prix, String ref) {
        this.prix = prix;
        this.ref = ref;
    }

    public double getPrix() {
        return prix;
    }

    public String getRef() {
        return ref;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produit produit = (Produit) o;
        return Objects.equals(ref, produit.ref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ref);
    }

    @Override
    public String toString() {
        return "Produit{" +
                "prix=" + prix +
                ", ref='" + ref + '\'' +
                '}';
    }
}
