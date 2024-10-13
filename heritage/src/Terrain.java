public class Terrain {
    private int cout;
    private char couleur;
    private static char[] COULEURS_PREMISES= {'B','b','n','r','v'};
    public Terrain(char couleur){
        for (int i = 0; i < COULEURS_PREMISES.length; i++) {
            if(COULEURS_PREMISES[i]==couleur);{
                this.couleur=couleur;
                break;}
        }
        this.cout=0;
    }

    public String fournirDetail(){
        return "t";
    }
}