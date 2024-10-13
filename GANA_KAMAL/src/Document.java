public class Document extends Element {
    private String contenu;
    public static final int POINTS=1;

    public Document(String titre, String contenu) {
        super(titre, POINTS);
        this.contenu = contenu;
    }
    public Document(String titre) {
        super(titre, POINTS);
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public String toString() {
        return super.toString() + " : Document dont le contenu est " + contenu;

    }
}
