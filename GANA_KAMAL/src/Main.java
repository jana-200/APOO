
public class Main {
    public static void main(String[] args) {

        // scénario 1 : créer les instances
        PortfolioEtudiant portfolioKen= new PortfolioEtudiant("ken.masters@vinci.be");

        SiteWeb webKen= new SiteWeb("Ken sur le web","www.ken.io", "html, css, js");
        Document motivationKen = new Document("Motivation de Ken");
        Document cvKen = new Document("CV de Ken Masters", "bla bla...");

        Analyse analyseKenParTencent= new Analyse(portfolioKen,"Tencent");

        // scénario 2 : test de l’exception associée à l’analyse d’un portfolio d’étudiant non interviewé
        try{
            analyseKenParTencent.terminerAnalyseAvecInteret();
        } catch(IllegalStateException e){
            System.out.println(e.getMessage());
        }

        // scénario 3 : test d’ajout et de suppression d’éléments à un portfolio
        portfolioKen.ajouter(webKen); //n°1
        portfolioKen.ajouter(motivationKen); //n°2
        portfolioKen.ajouter(cvKen); //n°3
        portfolioKen.supprimer(motivationKen); // on supprime n°2

        System.out.println();
        System.out.println("---------------- portfolio aprés ajouts et supressions -------------");
        System.out.println(portfolioKen);

        // scénario 4 : test de la finalisation des analyses des étudiants
        analyseKenParTencent.determinerCompletudePortfolio();
        analyseKenParTencent.terminerAnalyseAvecInteret();

        System.out.println();
        System.out.println("--------- aprés que analyse soit faite----------");
        System.out.println(analyseKenParTencent);

    }
}