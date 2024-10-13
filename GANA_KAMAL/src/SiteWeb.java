public class SiteWeb extends Element {
    private String url, technologies;
    public static final int POINTS=2;

    public SiteWeb(String titre, String url, String technologies) {
        super(titre, POINTS);
        this.url = url;
        this.technologies = technologies;
    }

    @Override
    public String toString() {
        return super.toString() + " : SiteWeb " + this.url + " avec comme technologies : " + technologies;
    }
}
