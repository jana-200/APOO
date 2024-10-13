import java.time.LocalDate;
public class Voiture extends Vehicules {
    public Voiture(String num, String immatriculation, LocalDate miseEnCirculation) {
        super(num, immatriculation, miseEnCirculation, miseEnCirculation,0);
    }

    @Override
    public boolean ordreControleTechnique() {
        return (getMiseEnCirculation().isAfter(LocalDate.now().minusYears(4)) || (getDernierControle().isAfter(LocalDate.now().minusYears(1))));
    }

    @Override
    public String toString() {
        return "voiture \n"+ super.toString();
    }
}
