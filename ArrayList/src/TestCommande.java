public class TestCommande {
	public static void main(String[] args) {
		Article article1 = new Article(
					"Lad700",
					"lapierre tecnic 700 lady",
					"Géométrie adaptée, composants et design spécifiques ont guidé la conception de notre gamme de VTT femme",
					899);
		Article article2 = new Article("TandFit",
					"lapierre tandem route 2 race fit",
					"le vélo tandem, ludique, convivial et performant", 1785,
					23);

		Commande c1= new Commande();
		c1.ajouter(article1,2);
		c1.ajouter(article2,1);

		Commande c2= new Commande();
		c2.ajouter(article2,1);

		System.out.println("---------------- commande 1 ----------------");
		System.out.println(c1);
		System.out.println();
		System.out.println("---------------- commande 2 ----------------");
		System.out.println(c2);
	}
}
