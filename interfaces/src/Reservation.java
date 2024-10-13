public class Reservation {
    private double prixNuit;
    private int nbrEtoile;
    private String nomHotel;

    public Reservation(double prixNuit, int nbrEtoile, String nomHotel) {
        this.prixNuit = prixNuit;
        this.nbrEtoile = nbrEtoile;
        this.nomHotel = nomHotel;
    }
    public double getPrixNuit() {
        return prixNuit;
    }
    public int getNbrEtoile() {
        return nbrEtoile;
    }
    public String getNomHotel() {
        return nomHotel;
    }
    @Override
    public String toString() {
        return "Reservation{" +
                "pricNuit=" + prixNuit +
                ", nbrEtoile=" + nbrEtoile +
                ", nomHotel='" + nomHotel + '\'' +
                '}';
    }
}
