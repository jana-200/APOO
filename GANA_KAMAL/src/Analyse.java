public class Analyse  {
    private PortfolioEtudiant portfolio;
    private String resultat, interviewer;
    private static final String RESULTAT_NC="Portfolio non complet";
    private static final String RESULTAT_A_INTERVIEWER="A interviewer";
    private static final String RESULTAT_INTERESSE="interessé";
    private static final String RESULTAT_NON_INTERESSE="Non interessé";

    public Analyse(PortfolioEtudiant portfolio, String interviewer) {
        if(portfolio == null)
            throw  new IllegalArgumentException("le portfolio doit être initilaisé");
        this.portfolio = portfolio;
        this.interviewer = interviewer;
        determinerCompletudePortfolio();

    }

    public void determinerCompletudePortfolio(){
        if(!portfolio.estComplet())
            this.resultat=RESULTAT_NC;
        else
            this.resultat= RESULTAT_A_INTERVIEWER;
    }
    public void terminerAnalyseAvecInteret(){
        if(!this.resultat.equals(RESULTAT_A_INTERVIEWER))
            throw new IllegalStateException("Impossible de terminer l’analyse si l’étudiant n’a pas été interviewé");
        else this.resultat=RESULTAT_INTERESSE;
    }
    public void terminerAnalyseSansInteret(){
        if(this.resultat.equals( RESULTAT_A_INTERVIEWER) || this.resultat.equals( RESULTAT_NC))
            this.resultat=RESULTAT_NON_INTERESSE;
        else throw new IllegalStateException();
    }

    @Override
    public String toString() {
        return "Analyse par " + interviewer + " du portfolio \n"+ portfolio + "\nRésultat actuel de l'analyse : "+ resultat;
    }
}
