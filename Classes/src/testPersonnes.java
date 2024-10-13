public class testPersonnes {

    public static void main(String[] args) {

        Personnes personnes1 = new Personnes("Jana Kamal", 1, 1, 2004, "Avenue de Broqueville 240, 1200 Bruxelles");

        personnes1.calculerAgeActuel();
        personnes1.calculerAgeRandom(2011);
        personnes1.donnerNaissance();
        personnes1.donnerAdresse();



    }
}
