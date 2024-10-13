public class testCompteEnBanque {

    public static void main(String[] args) {
        Date naissance = new Date(1,1,2004);
        Adresse adresse = new Adresse("avenue","240","1200","Bruxelles");
        Personne personne1 = new Personne("Kamal","Gana",naissance,adresse);
        Date dateOuverture = new Date(1,1,2020);
        Date validiteId = new Date(1,1,2027);
        CompteEnBanque compte1 = new CompteEnBanque(personne1,dateOuverture,validiteId,"19782004",1200);

        compte1.depot(100);
        System.out.println(compte1);

    }
}
