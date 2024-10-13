public class LigneDeCommande {
    private Article article;
    private int quantity;

    public LigneDeCommande(Article article) {
        this.article = article;
        this.quantity=1;
    }
    public LigneDeCommande(Article article, int quantity) {
        this.article = article;
        this.quantity = quantity;
    }
    public Article getArticle() {
        return article;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double calculerPrixTVAComprise() {
        return article.calculerPrixTVAComprise()*quantity;
    }

    @Override
    public String toString() {
        return quantity+ "x "+ article.toString();
    }

}
