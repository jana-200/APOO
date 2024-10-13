public class TestPanier {
    public static void main(String[] args) {
        Produit CD1= new CD(15.11,"333333","greatest hit","Queen", 17);
        Produit livre1= new Livre(14.66,"66666","les piliers de la terre", "Ken Forrest",900);
        Produit DVD1 = new DVD(9.99,"546544","Princesse momonoke", "Hayao miyazaki");
        Produit DVD2 = new DVD(11,"6674346","Princesse", "Hayao miyazaki");

        Panier panier= new Panier();
        System.out.println(panier);
        panier.ajouterProduit(livre1);
        panier.ajouterProduit(CD1);
        panier.ajouterProduit(DVD1);
        System.out.println(panier);

        System.out.println();
        System.out.println("---------- remove ------------");
        System.out.println();

        System.out.println(panier.supprimerPrdouit(DVD2)); // false
        System.out.println(panier.supprimerPrdouit(DVD1)); // true

        System.out.println();
        System.out.println("---------- retrouver produit ------------");
        System.out.println();

        System.out.println(panier.retrouverProduit("333333"));

        System.out.println();
        System.out.println("---------- prix total ------------");
        System.out.println();

        System.out.println(panier.prixTotal());
        panier.ajouterProduit(DVD1);
        panier.ajouterProduit(DVD1);
        System.out.println(panier.prixTotal());

        System.out.println(panier.nombreProduits());

    }
}
