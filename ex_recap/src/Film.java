public class Film extends ContenuVideo  {
    private int duree;
    private long recettes;

    public Film(String categorie, String titre, int duree, long recettes) {
        this(categorie,titre, duree);
        this.recettes=recettes;
    }

    public Film(String categorie, String titre, int duree) {
        super(categorie, titre);
        if(categorie== null || titre == null)
            throw new IllegalArgumentException();
        this.duree = duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setRecettes(long recettes) {
        this.recettes = recettes;
    }

    @Override
    public String toString() {
        return "Film " + super.toString()+ " ,durée="+ duree+ ", recettes="+ recettes+ "]";

    }
}
