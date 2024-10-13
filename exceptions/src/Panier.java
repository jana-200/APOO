import java.util.ArrayList;
import java.util.Iterator;

public class Panier {
    private ArrayList<Produit>panier;

    public Panier() {
        panier= new ArrayList<>();
    }
    public ArrayList<Produit> getPanier() {
        return panier;
    }
    public boolean contient(Produit prod){
        if(prod == null ){
            throw new IllegalArgumentException("... le produit ne peut être null");
        }
        return panier.contains(prod);
    }
    public boolean ajouterProduit(Produit prod) throws PanierPleinException {
        if(prod == null ){
            throw new IllegalArgumentException("... le produit ne peut être null");
        }
        if(panier.size()==10)
            throw new PanierPleinException("pardon ... le panier et plein");
        panier.add(prod);
        return true;
    }
    public boolean supprimerProduit(Produit prod) throws ProduitNonPresentException{
        if(prod == null ){
            throw new IllegalArgumentException("... le produit ne peut être null");
        }
        if(!contient(prod))
            throw new ProduitNonPresentException("... le produit n'est pas dans le panier");

        panier.remove(prod);
        return true;
    }
    public Produit retrouverProduit(String ref) throws ProduitNonPresentException{
        if(ref== null ){
            throw new IllegalArgumentException("... la référence ne peut être null");
        }
        if(ref.isEmpty() ){
            throw new IllegalArgumentException("... la référence ne peut être null");
        }
        for (Produit produit: panier) {
            if(produit.getRef().equals(ref))
                return produit;
        }
        throw new ProduitNonPresentException("... le produit n'est pas dans le panier");
    }
    public double prixTotal(){
        double prix=0;
        for (Produit produit: panier) {
            prix += produit.getPrix();
        }
        return prix;
    }
    public int nombreProduits(){
        return panier.size();
    }
    public Iterator<Produit> iterator(){
        return panier.iterator();
    }

    @Override
    public String toString() {
        String texte="";
        for (Produit prod:panier) {
            texte+= prod.toString()+ "\n";
        }
        return texte;
    }
}
