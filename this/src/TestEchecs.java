public class TestEchecs {
    public static void main(String[] args) {

        Adresse adresse1 = new Adresse("frog street","23","1200","Frog city");
        Adresse adresse2  = new Adresse("piggy street","24","1200","Pig city");

        Club club1= new Club("froggy","12345",adresse1);
        Club club2 = new Club("piggy","23456",adresse2);

        Date tomDate = new Date(25,9,1965);
        Date pierreDate =new Date(29,4,1975);
        Date dateDebut = new Date(1,1,2001);
        Date dateFin = new Date(11,1,2001);

        Joueur tom = new Joueur("30","Tom","Jerry",tomDate,club2);
        Joueur pierre = new Joueur("99","DeLacroix","Pierre",pierreDate, club1);

        Tournoi tournoi = new Tournoi("animal chess",dateDebut, dateFin);

        Partie partie1 = new Partie(dateDebut,tom, pierre, tournoi);

        System.out.println(club1);
        System.out.println(club2);
        System.out.println(tom);
        System.out.println(pierre);
        System.out.println(tournoi);
        System.out.println(partie1);

        club2.elireDirecteur(tom);
        System.out.println(club2);

        tom.changerClub(club1);
        System.out.println(tom);

        System.out.println(club2);

        partie1.enregistrerResultat(0);
        System.out.println(partie1.recupererGagnant());


    }
}
