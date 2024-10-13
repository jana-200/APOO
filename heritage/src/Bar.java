import java.util.ArrayList;
public class Bar {
    private ArrayList<Boisson> carte;
    public  Bar(){
        carte= new ArrayList<Boisson>();
    }
    public boolean ajouterBoisson(Boisson boisson){
        if(!this.contient(boisson)){
            carte.add(boisson);
            return true;}
        return false;
    }
    public boolean contient(Boisson boisson){
        return carte.contains(boisson);
    }

    public boolean retirerBoisson(Boisson boisson){
        if(this.contient(boisson)){
            carte.remove(boisson);
            return true;}
        return false;
    }

    public int nombreDeBoisson(){
        int nombre=0;
        for (Boisson boisson: carte) {
            nombre++;
        }
        return nombre;
    }

    @Override
    public String toString() {
        String text="";
        for (Boisson boisson: carte) {
            text+=boisson.toString();
        }
        return text;
    }
}