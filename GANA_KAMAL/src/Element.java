import java.util.Objects;

public abstract class Element {
    private String titre;
    private int idDansPortfolio, points;

    public Element(String titre, int points) {
        this.titre = titre;
        this.points = points;
    }


    public boolean attribuerDansPortfolio(int id){
        if (this.idDansPortfolio==0) {
            this.idDansPortfolio=id;
            return true;
        }
        return false;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "\nElement N° "+ idDansPortfolio + " - " + this.titre ;
    }
}
