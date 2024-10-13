public class Personnes {

    String identite;
    int jour;
    int mois;
    int annee;
    String adresse;

    Personnes( String nIdentite, int nJour, int nMois, int nAnnee  , String nAdresse){
        identite = nIdentite;
        jour = nJour;
        mois = nMois;
        annee = nAnnee;
        adresse = nAdresse;
    }

    int calculerAgeActuel(){
        return 2023-annee;
    }
    int calculerAgeRandom(int anneeRandom){
        return anneeRandom - annee;
    }

    String donnerAdresse(){
        return adresse;
    }

    String donnerNaissance(){
        return jour+ "/" + mois+ "/" +annee;
    }
}
