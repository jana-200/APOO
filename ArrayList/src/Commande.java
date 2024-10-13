import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
public class Commande {
	private ArrayList<LigneDeCommande> lignes;
	private LocalDate date;





	private Article article;
	public Commande(){
		lignes =new ArrayList<LigneDeCommande>();
		date = LocalDate.now();
	}

	public void ajouter(Article article,int quantite){
		LigneDeCommande ligne =new LigneDeCommande(article, quantite);
		this.lignes.add(ligne);

	}
	public boolean supprimer(LigneDeCommande ligne){
		return lignes.remove(ligne);
	}
	public boolean contient(Article article){
		return lignes.contains(article);
	}
	public double calculerPrix(){
		double prix=0;
		for (LigneDeCommande ligne :lignes) {
			prix+= ligne.calculerPrixTVAComprise();
		}
		return prix;
	}
	public LocalDate getDate() {
		return date;
	}

	public String toString(){
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String infosCommande = date.format(formatter)+"\n";
		for (LigneDeCommande ligne:lignes) {
			infosCommande += ligne.toString() +"\n";
		}
		infosCommande+= "le prix total est de " + calculerPrix()+" euros";
		
		return infosCommande;
	}
}
