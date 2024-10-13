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
        return panier.contains(prod);
    }
    public boolean ajouterProduit(Produit prod){
        panier.add(prod);
        return true;
    }
    public boolean supprimerPrdouit(Produit prod){
        if(contient(prod)){
            panier.remove(prod);
            return true;
        }
        return false;
    }
    public Produit retrouverProduit(String ref){
        for (Produit produit: panier) {
            if(produit.getRef().equals(ref))
                return produit;
        }
        throw new IllegalArgumentException("produit non présent");
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
