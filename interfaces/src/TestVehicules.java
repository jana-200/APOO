import java.time.LocalDate;

public class TestVehicules {
    public static void main(String[] args) {
        LocalDate dateCircul = LocalDate.of(2023,11,22);
        LocalDate dateCircul2 = LocalDate.of(2023,11,22);
        LocalDate dateCircul3 = LocalDate.of(2017,11,22);
        Voiture voiture1 = new Voiture("12P4","I LUV HARY STYL",dateCircul2);
        Utilitaire utilitaire1 = new Utilitaire("221B","PAS SHERLY",dateCircul,dateCircul2,250);

        System.out.println(voiture1);
        System.out.println(utilitaire1);


        System.out.println(utilitaire1.ordreControleTechnique()); // true
        utilitaire1.setKilometrage(100000);
        utilitaire1.setKilomAuDernierControle(50000);
        System.out.println(utilitaire1.ordreControleTechnique()); // false

        System.out.println(voiture1.ordreControleTechnique()); // true
        Voiture voiture2 = new Voiture("hfhhf","gfdssffgfg",dateCircul3);
        System.out.println(voiture2.ordreControleTechnique()); // false

    }
}
