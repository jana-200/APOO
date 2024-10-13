public class TestArticle {
    public static void main(String[] args) {
        System.out.println(Article.getNbrArticles());
        Article article1 = new Article("1135352","Veste","fourrure naturelle",79.99,20);
        System.out.println(Article.getNbrArticles());

        Article article2 = new Article("2135352","Pantalon","street wear",39.99);
        System.out.println(Article.getNbrArticles());

        Article article3 = new Article("3135352","t-shirt","laine",15.99);
        System.out.println(Article.getNbrArticles());

        Article article4 = new Article("4135352","chaussettes","colorées",7.99);
        System.out.println(Article.getNbrArticles());

        System.out.println("----------------------- Article 1 -----------------------");
        System.out.println(article1);
        System.out.println("----------------------- Article 2 -----------------------");
        System.out.println(article2);
        System.out.println("----------------------- Article 3 -----------------------");
        System.out.println(article3);
        System.out.println("----------------------- Article 4 -----------------------");
        System.out.println(article4);

        /* ------------- test exceptions ------------- */

        System.out.println("----------------------- test exceptions -----------------------");
        try{
            Article article5 = new Article("","veste","fourrure naturelle",79.99,20);
            System.out.println("----------------------- Article 5 -----------------------");
            System.out.println(article5);
        }
        catch (IllegalArgumentException | NullPointerException e){System.out.println(e.getMessage());
        }

        try{
            Article article6 = new Article("6135352","","street wear",39.99);
            System.out.println("----------------------- Article 6 -----------------------");
            System.out.println(article6);
        }
        catch (IllegalArgumentException | NullPointerException e){System.out.println(e.getMessage());
        }

        try{
            Article article7 = new Article("7135352","t-shirt","laine",0);
            System.out.println("----------------------- Article 7 -----------------------");
            System.out.println(article7);
        }
        catch (IllegalArgumentException | NullPointerException e){System.out.println(e.getMessage());
        }

        try{
            Article article8 = new Article("8135352","chaussettes","colorées",7.99,-1);
            System.out.println("----------------------- Article 8 -----------------------");
            System.out.println(article8);
        }
        catch (IllegalArgumentException | NullPointerException e){System.out.println(e.getMessage());
        }
    }
}
