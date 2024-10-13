import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.lang.*;
public class AppelTelephonique {
    private LocalDateTime dateHeure;
    private String numeroAppele;
    private Duration dureeAppel;
    private double tarif;
    private static double tarifParDefaut=0.15;

    public AppelTelephonique(LocalDateTime dateHeure,String numeroAppele, Duration dureeAppel, double tarif) {
        if(dateHeure.isAfter(LocalDateTime.now()))
            throw new IllegalArgumentException("le moment de l’appel (date et heure) doit être antérieur au moment actuel");

        if(numeroAppele.isEmpty())
            throw new IllegalArgumentException("Le numéro appelé ne peut pas être nul");

        if(dureeAppel.isNegative() || dureeAppel.isZero())
            throw new IllegalArgumentException("La durée ne peut pas être inférieure ou égale à 0");

        if(tarif<=0)
            throw new IllegalArgumentException("le tarif doit être strictement supérieur à 0");

        this.numeroAppele = numeroAppele;
        this.tarif = tarif;
        this.dateHeure = dateHeure;
        this.dureeAppel=dureeAppel;
    }

    public AppelTelephonique(LocalDateTime dateHeure,String numeroAppele, Duration dureeAppel) {
        this.numeroAppele = numeroAppele;
        this.tarif = tarifParDefaut;
        this.dateHeure = dateHeure;
        this.dureeAppel=dureeAppel;
    }

    public static double getTarifParDefaut() {
        return tarifParDefaut;
    }

    public static void setTarifParDefaut(double tarif) {
        if(tarif<=0)
            throw new IllegalArgumentException("le tarif doit etre strictement superieur à 0");
        AppelTelephonique.tarifParDefaut = tarif;
    }

    public LocalDateTime getDateHeure() {
        return dateHeure;
    }


    public String getNumeroAppele() {
        return numeroAppele;
    }

    public Duration getDureeAppel() {
        return dureeAppel;
    }

    public double getTarif() {
        return tarif;
    }
    public double calculerCoutTotal(){
        if((dureeAppel.getSeconds())%60==0)
            return ((double) dureeAppel.getSeconds() /60)*this.tarif;
        double reste = dureeAppel.getSeconds()%60;
        double minutes = ((dureeAppel.getSeconds()-reste)/60)+1;
        return minutes*tarif;
    }

    @Override
    public String toString() {
        double minutes=0;
        if((dureeAppel.getSeconds())%60==0)
            minutes=(dureeAppel.getSeconds()/60);
        double reste = dureeAppel.getSeconds()%60;
        minutes = ((dureeAppel.getSeconds()-reste)/60);

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String infos = "Appel passé le " + formatter.format(getDateHeure())
                +"\n"+"D'une durée de " + (int)minutes+"m"+(int)reste+"s"
                +"\n"+"Traif Total = "+calculerCoutTotal();

        return infos;
    }
}
