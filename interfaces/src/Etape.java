import java.time.LocalDate;

public class Etape {
    public String ville;
    public LocalDate date;

    public Etape(String ville, LocalDate date) {
        this.ville = ville;
        this.date = date;
    }

    public String getVille() {
        return ville;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return " ville= " + ville + '\n' +
                "date= " + date ;
    }
}
