public class TestPanier2 {
    public static void main(String[] args) throws PanierPleinException {
        Panier panier= new Panier();
        Livre livre1= new Livre(10.50,"123", "déchéance d'un homme", "Osamu Dazai", 60);
        CD cd1 = new CD(5.60, "cd1","love and hunger", "me", 5);
        Livre livre2 = new Livre(10,"123", "Ascension d'un homme", "Umaso Dazai", 60);

        System.out.println();
        System.out.println("============ supprimer livre nn présent ============");
        try {
            System.out.println(panier.supprimerProduit(livre1));
        }catch (ProduitNonPresentException p){
            System.out.println(p.getMessage());
        }

        System.out.println();
        System.out.println("============ supprimer null ============");
        try {
            System.out.println(panier.supprimerProduit(null));
        }catch (IllegalArgumentException i){
            System.out.println(i.getMessage());
        } catch (ProduitNonPresentException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        System.out.println("============ chercher livre nn présent ============");
        try {
            System.out.println(panier.retrouverProduit("123"));
        }catch (ProduitNonPresentException np){
            System.out.println(np.getMessage());
        }

        System.out.println();
        System.out.println("============ chercher livre null ============");
        try {
            System.out.println(panier.retrouverProduit(null));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch (ProduitNonPresentException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        System.out.println("============ ajouter livre null ============");
        try {
            System.out.println(panier.ajouterProduit(null));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch (PanierPleinException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        System.out.println("============ ajouter livre ============");
        try{
            System.out.println(panier.ajouterProduit(livre1));
        }catch (PanierPleinException p){
            System.out.println(p.getMessage());
        }

        System.out.println();
        System.out.println("============ chercher livre nn présent ============");
        try {
            System.out.println(panier.retrouverProduit("1234"));
        }catch (ProduitNonPresentException np){
            System.out.println(np.getMessage());
        }

        System.out.println();
        System.out.println("============ chercher livre présent ============");
        try {
            System.out.println(panier.retrouverProduit("123"));
        }catch (ProduitNonPresentException np){
            System.out.println(np.getMessage());
        }

        System.out.println();
        System.out.println("============ chercher livre avec string vide ============");
        try {
            System.out.println(panier.retrouverProduit(""));
        }catch (IllegalArgumentException np){
            System.out.println(np.getMessage());
        }catch (ProduitNonPresentException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        System.out.println("============ supprimer cd nn présent ============");
        try{
            System.out.println(panier.supprimerProduit(cd1));
        } catch (ProduitNonPresentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("============ ajouter cd1 ============");
        try{
            System.out.println(panier.ajouterProduit(cd1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("============ supprimer livre2  ============");
        try {
            System.out.println(panier.supprimerProduit(livre1));
        }catch (ProduitNonPresentException p){
            System.out.println(p.getMessage());
        }

        System.out.println();
        System.out.println("============ afficher panier  ============");
        System.out.println(panier);


        for (int i = 0; i <9 ; i++) {
            DVD dvd =new DVD(10,"12345","hate you", "barbara");
            panier.ajouterProduit(dvd);
        }

        System.out.println();
        System.out.println("============ ajouter livre1 ============");
        try{
            System.out.println(panier.ajouterProduit(livre1));
        } catch (PanierPleinException e) {
            System.out.println(e.getMessage());
        }


        System.out.println();
        System.out.println("============ afficher panier aprés ajout des dvd ============");
        System.out.println(panier);

    }
}
