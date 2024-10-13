public class Serie extends ContenuVideo {
    private int nombreEpiosdes;

    public Serie(String categorie, String titre, int nombreEpiosdes) {
        super(categorie, titre);
        this.nombreEpiosdes = nombreEpiosdes;
    }

    public void setNombreEpiosdes(int nombreEpiosdes) {
        this.nombreEpiosdes = nombreEpiosdes;
    }

    @Override
    public String toString() {
        return "Serie "+ super.toString()+ " ,nombre d'épisodes="+ nombreEpiosdes+"]";
    }
}
