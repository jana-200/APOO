public class Livre {

    String isbn;
    String titre;
    String identiteAuteur;
    String prix;
    String anneeEdition;
    String nombreDePage;

    Livre(String nIsbn,String nTitre, String nIdentiteAuteur, String nPrix, String nAnneeEdition, String nNombreDePage){
        isbn = nIsbn;
        titre = nTitre;
        identiteAuteur = nIdentiteAuteur;
        prix = nPrix;
        anneeEdition = nAnneeEdition;
        nombreDePage = nNombreDePage;
    }

    public String toString(){
        return  "INSB: "+ isbn + "\n"+ "titre: "+ titre + "\n"+ "auteur: "+ identiteAuteur + "\n"+ "prix: "+  prix + "\n"+ "edition: "+ anneeEdition + "\n"+ "nbr de page: "+ nombreDePage ;
    }
}

