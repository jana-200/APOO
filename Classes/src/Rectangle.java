public class Rectangle {
    double longueur;
    double largeur;

    Rectangle(double nLongueur, double nLargeur){
        longueur = nLongueur;
        largeur = nLargeur;
    }

    double calculerAire(){
        return largeur * longueur;
    }

    double calculerPerimetre(){
        return 2*(largeur + longueur);
    }

    public String toString(){
        return " la largeur du triangle est "+ largeur +" et sa longueur est "+ longueur;
    }
}
