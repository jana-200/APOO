import java.time.LocalDate;

public class Vol {
    private LocalDate dateDepart;
    private double prixVol;
    private String numVol, aeroportDepart, aeroportArrive;

    public Vol(LocalDate dateDepart, double prixVol, String numVol, String aeroportDepart, String aeroportArrive) {
        this.dateDepart = dateDepart;
        this.prixVol = prixVol;
        this.numVol = numVol;
        this.aeroportDepart = aeroportDepart;
        this.aeroportArrive = aeroportArrive;
    }
    public LocalDate getDateDepart() {
        return dateDepart;
    }
    public double getPrixVol() {
        return prixVol;
    }
    public String getNumVol() {
        return numVol;
    }
    public String getAeroportDepart() {
        return aeroportDepart;
    }
    public String getAeroportArrive() {
        return aeroportArrive;
    }
    @Override
    public String toString() {
        return "Vol{" +
                "dateDepart=" + dateDepart +
                ", prixVol=" + prixVol +
                ", numVol='" + numVol + '\'' +
                ", aeroportDepart='" + aeroportDepart + '\'' +
                ", aeroportArrive='" + aeroportArrive + '\'' +
                '}';
    }
}
