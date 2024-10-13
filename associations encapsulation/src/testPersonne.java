public class testPersonne {

    public static void main(String[] args) {
        Date naissance1 = new Date(6,2,1968);
        Date naissance2 = new Date(7,3,1970);

        Adresse adresse1 = new Adresse("Rue de la gare ","n°34 ","à 5000 ", "Namur.");

        Personne personne1 = new Personne("Paul ","Schmidt ",naissance1, adresse1);
        Personne personne2 = new Personne("Valerie ", "Gobert ", naissance2, adresse1);

        personne1.demenager("Frog Street 08 080808 Frog EMPIRE");


        System.out.println(personne1);
        System.out.println(personne2);
    }
}
