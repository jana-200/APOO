import java.util.ArrayList;
public class Catalogue {
    private ArrayList<Livre> livres;
    public Catalogue(){
        livres= new ArrayList<Livre>();
    }
    public boolean ajouter(Livre livre){
        if(this.contient(livre)) return false;
        return livres.add(livre);
    }
    public boolean supprimer(Livre livre){
        return livres.remove(livre);
    }
    public boolean contient(Livre livre){
        return livres.contains(livre);
    }
    public int nombreDeLivres(){
        return livres.size();
    }
    public boolean estVide(){
        return livres.isEmpty();
    }

    public Livre chercherLivre(String isbn){
        Livre livre1= null;
        for (Livre livre :livres){
            if(livre.getIsbn().equals(isbn)) {
                livre1 = livre;
                return livre1;
            }
        }
        return null;
    }

    public String toString() {
        String text = "le Catalogue contient les livres suivants : " ;
        for (Livre livre: livres) {
            text+="\n"+ livre.toString();
        }
        return text;
    }
}
