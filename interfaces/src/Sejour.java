import java.time.LocalDate;
public class Sejour extends FormuleSimple {
    private Reservation resevation;

    public Sejour(LocalDate dateDepart, int dureeSejours, Vol volDepart, Vol volArrive, Reservation resevation) {
        super(dateDepart, dureeSejours, volDepart, volArrive);
        this.resevation = resevation;
    }
    public Reservation getResevation() {
        return resevation;
    }
    public double calculerPrix(){
        return  getResevation().getPrixNuit() + getVolArrive().getPrixVol()+getVolDepart().getPrixVol();
    }

    @Override
    public String toString() {
        return "Sejour " +
                "prix =" + calculerPrix();
    }
}
