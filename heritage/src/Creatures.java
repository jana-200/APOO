public class Creatures {
    private int cout;
    private String nom;
    private int ptVie, ptDegats;
    public Creatures(String nom, int ptVie, int ptDegats){
        this.nom= nom;
        this.ptVie= ptVie;
        this.ptDegats=ptDegats;
    }
    public Creatures(String nom){
        this.nom=nom;
        this.ptVie= 0;
        this.ptDegats=0;
    }
}