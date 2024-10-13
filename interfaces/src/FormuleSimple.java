import java.time.LocalDate;
public class FormuleSimple extends AgenceDeVoyage {
    private Vol volDepart, volArrive;

    public FormuleSimple(LocalDate dateDepart, int dureeSejours, Vol volDepart, Vol volArrive) {
        super(dateDepart, dureeSejours);
        this.volDepart = volDepart;
        this.volArrive = volArrive;
    }
    public Vol getVolDepart() {
        return volDepart;
    }
    public Vol getVolArrive() {
        return volArrive;
    }
    public double calculerPrix(){
        return volDepart.getPrixVol()+volArrive.getPrixVol();
    }

    @Override
    public String toString() {
        return "FormuleSimple " +
                "volDepart = " + volDepart +
                ", volArrive = " + volArrive +
                "\n + prix = "+ calculerPrix();
    }
}
