import java.util.Objects;

public abstract class ContenuVideo {
    private int id;
    private String titre, categorie;
    private static int idSuivant=1;
    private static final String[] CATEGORIES_POSSIBLES= {"action","science-fiction", "drame","comédie","horreur", "thriller","documentaire", "animation" };

    public ContenuVideo(String categorie, String titre) {
        for (String cat: CATEGORIES_POSSIBLES) {
            if (cat.equals(categorie)) {
                this.categorie = categorie;
            }
        }
        if(this.categorie== null)
            throw new IllegalArgumentException("Catégorie inexistante");

        if(titre == null)
            throw new IllegalArgumentException();

        this.titre=titre;
        this.id=idSuivant++;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContenuVideo that = (ContenuVideo) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "[id= " + id + ", titre='" + titre  + ", categorie= " + categorie ;

    }
}
