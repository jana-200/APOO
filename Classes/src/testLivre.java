public class testLivre {

    public static void main(String[] args) {

        Livre livre1 = new Livre(" ", "Mexico ", "Pablo Escobar ", " ", "2000 ","" );
        Livre livre2 = new Livre("52646 ", "No fucking fight ", "Thomas Shelby ", "10 ", "2010 ", "300 ");

        System.out.println("livre1:");
        System.out.println( "titre: " + livre1.titre+ "\n" + "auteur: " + livre1.identiteAuteur + "\n"+ "edition: " + livre1.anneeEdition );
        System.out.println("\n"+"livre2:");
        System.out.println( livre2);

    }
}
