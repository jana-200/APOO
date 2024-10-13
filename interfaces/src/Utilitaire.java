import java.time.LocalDate;
public class Utilitaire extends Vehicules{
     public static final double kilomPermis=20000;
     public double kilomAuDernierControle=45000;
    public Utilitaire(String num, String immatriculation, LocalDate miseEnCirculation, LocalDate dernierControle, double kilometrage, double kilomAuDernierControle) {
        super(num, immatriculation, miseEnCirculation, dernierControle, kilometrage);
    }
    public Utilitaire(String num, String immatriculation, LocalDate miseEnCirculation, LocalDate dernierControle, double kilomAuDernierControle) {
        super(num, immatriculation, miseEnCirculation, dernierControle, 50000);
    }
    public double getKilomPermis() {
        return kilomPermis;
    }

    public double getKilomAuDernierControle() {
        return kilomAuDernierControle;
    }

    public void setKilomAuDernierControle(double kilomAuDernierControle) {
        this.kilomAuDernierControle = kilomAuDernierControle;
    }

    @Override
    public boolean ordreControleTechnique() {
        return (getKilometrage()-getKilomAuDernierControle()<=getKilomPermis());
    }

    @Override
    public String toString() {
        return "utilitaire \n"+ super.toString();
    }
}
