public class Main {
    public static void main(String[] args) {

        Site superContent= new Site("www.superContent.com");

        ContenuVideo endagme = new Film("action","Avengers: Endgame",181,279800000);
        superContent.ajouter(endagme);
        ContenuVideo bigbang= new Serie("comédie","the Big Bang Theory",279);
        superContent.ajouter(bigbang);
        ContenuVideo avengers= new Film("action","Avengers",143);
        superContent.ajouter(avengers);

        System.out.println(superContent);
        try{
            ContenuVideo mEndgame = new Film("blalalnal","Avengers: Endgame",181, 51484);
        }catch(IllegalArgumentException i){
            System.out.println(i.getMessage());
        }

    }
}