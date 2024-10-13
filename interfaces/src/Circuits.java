import java.time.LocalDate;
public class Circuits extends AgenceDeVoyage{
    private String description;

    public Circuits(LocalDate dateDepart, int dureeSejours, String description) {
        super(dateDepart, dureeSejours);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Circuits{" +
                "description='" + description + '\'' +
                '}';
    }
}
