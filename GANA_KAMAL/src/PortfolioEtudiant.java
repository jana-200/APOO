import java.util.ArrayList;
import java.util.Iterator;

public class PortfolioEtudiant {
    private String emailEtudiant;
    private ArrayList<Element> elements= new ArrayList<>();
    private int nombreOperationsDAjout=0;

    public PortfolioEtudiant(String emailEtudiant) {
        if(emailEtudiant == "" || emailEtudiant==null)
            throw new IllegalArgumentException("email Etudiant ne doit être vide");
        this.emailEtudiant = emailEtudiant;
    }

    public boolean ajouter(Element element){
        if(elements.contains(element))
            return false;

        ++nombreOperationsDAjout;
        element.attribuerDansPortfolio(nombreOperationsDAjout);
        return elements.add(element);

    }

    public boolean supprimer(Element element){
        if(elements.contains(element)){
            elements.remove(element);
            return true;
        }
        return false;
    }
    public boolean estComplet(){
        int points=0;
        for (Element el : elements) {
            points+=el.getPoints();
        }

        return points>=3;
    }
    public int fournirNbrElements(){
        return elements.size();
    }

    @Override
    public String toString() {
        String text= "Etudiant(e) : "+ emailEtudiant ;
        for (Element element: elements) {
            text +=  element.toString();
        }
        return text;
    }
}
