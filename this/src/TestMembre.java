public class TestMembre {

    public static void main(String[] args) {
        Membre membre1 = new Membre("Leconte","Emmeline","0489086058");
        System.out.println(membre1.initialiserParrain(membre1));
        System.out.println(membre1);
        Membre membre2 = new Membre("Cambron","Isabelle","0489086058");
        System.out.println(membre1.initialiserParrain(membre2));
        System.out.println(membre1);
        Membre membre3 = new Membre("Baroni","Raphaël","0489086058");
        System.out.println(membre1.initialiserParrain(membre3));
        System.out.println(membre1);

    }
}
