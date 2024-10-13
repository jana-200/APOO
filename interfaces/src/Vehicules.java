import java.time.LocalDate;
import java.util.Objects;
public abstract class Vehicules {
    private String num, immatriculation ;
    private LocalDate miseEnCirculation,dernierControle;
    private double kilometrage;

    public Vehicules(String num, String immatriculation, LocalDate miseEnCirculation, LocalDate dernierControle, double kilometrage) {
        if(Objects.equals(immatriculation, ""))
            throw new IllegalArgumentException("immatriculation ne peut etre vide");
        if(kilometrage<0)
            throw new IllegalArgumentException("le kilometrage ne peut etre inferieur à 0");
        this.num = num;
        this.immatriculation = immatriculation;
        this.miseEnCirculation = miseEnCirculation;
        this.dernierControle = dernierControle;
        this.kilometrage = kilometrage;
    }

    public void setImmatriculation(String immatriculation) {
        if(Objects.equals(immatriculation, ""))
            throw new IllegalArgumentException("immatriculation ne peut etre vide");
        this.immatriculation = immatriculation;
    }

    public void setDernierControle(LocalDate dernierControle) {
        if (dernierControle.isBefore(this.dernierControle))
            throw new IllegalArgumentException("la date ne peut etre antérieur à la date du dernier controle");
        this.dernierControle = dernierControle;
    }

    public void setKilometrage(double kilometrage) {
        if(kilometrage<0)
            throw new IllegalArgumentException("le kilometrage ne peut etre inferieur à 0");
        this.kilometrage = kilometrage;
    }

    public String getNum() {
        return num;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public LocalDate getMiseEnCirculation() {
        return miseEnCirculation;
    }

    public LocalDate getDernierControle() {
        return dernierControle;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    public abstract boolean ordreControleTechnique();

    @Override
    public String toString() {
        return "Numéro de chassis : " + num + "\n Immatriculation : " + immatriculation + "\n Date de mise en circulation : " + miseEnCirculation + "\n Date du dernier controle technique : " + dernierControle + " \n Kilométrage : " + kilometrage;
    }
}
