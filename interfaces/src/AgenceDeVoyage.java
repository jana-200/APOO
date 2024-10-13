import java.time.LocalDate;

public abstract class AgenceDeVoyage {
    private LocalDate dateDepart;
    private int dureeSejours;

    public AgenceDeVoyage(LocalDate dateDepart, int dureeSejours) {
        this.dateDepart = dateDepart;
        this.dureeSejours = dureeSejours;
    }
    public LocalDate getDateDepart() {
        return dateDepart;
    }
    public int getDureeSejours() {
        return dureeSejours;
    }
    public double calculerPrix() {
        return 0;
    }
    @Override
    public String toString() {
        return "Voyage \n" +
                "dateDepart= " + dateDepart +
                "\ndureeSejours= " + dureeSejours ;
    }
}
