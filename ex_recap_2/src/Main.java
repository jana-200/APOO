public class Main {
    public static void main(String[] args) {
        // scénario 1
        Projet projet1= new Projet("projet1");
        Developpeur olivier= new Developpeur("olivier","infra",3500.0);
        Developpeur loic= new Developpeur("loic",3000.0);
        Developpeur zoe = new DeveloppeurStagiaire("zoe","back-end","IPL");

        // scénario 2
        System.out.println("------------------ ajouts ------------------");
        projet1.ajouter(olivier);
        projet1.ajouter(loic);
        projet1.ajouter(zoe);
        System.out.println(projet1);

        System.out.println("------------------ aprés supression ------------------");
        projet1.retirer(loic);
        System.out.println(projet1);

        // scénario 3
        System.out.println("------------------ projet fini ------------------");
        projet1.terminer();
        System.out.println(projet1);

        // tests sup
        System.out.println("------------------ test sup ------------------");
        Projet projet2= new Projet("projet2");
        Projet projet3= new Projet("projet3");
        projet2.ajouter(olivier);
        projet3.ajouter(olivier);
        System.out.println(projet2); // olivier doit avoir 2 projets en cours


    }
}