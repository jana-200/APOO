import java.util.ArrayList;

public class Site {
    private String url;
    private ArrayList<ContenuVideo> liste = new ArrayList<>();

    public Site(String url) {
        this.url = url;
    }

    public boolean ajouter(ContenuVideo vid){
        if(liste.contains(vid))
            return false;
        liste.add(vid);
        return true;
    }

    public boolean supprimer(ContenuVideo vid){
        if(!liste.contains(vid))
            return false;
        liste.remove(vid);
        return true;
    }

    @Override
    public String toString() {
        String text= "Site [url=" + url + "]\n" + "Liste de contenus vidéos\n" ;
        if(liste.isEmpty())
            text+= "Aucun contenu vidéo";
        else{
            for (ContenuVideo contenu : liste) {
                text+= contenu.toString()+"\n";
            }
        }
        return text;
    }
}
