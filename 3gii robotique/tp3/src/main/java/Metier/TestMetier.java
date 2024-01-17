package Metier;

import java.util.List;

public class TestMetier {
	public static void main(String[] args) {
		MetierImpl metier= new MetierImpl();
		List<Produit> prods = metier.getProduitsParMotCle("p");
		for (Produit p : prods)
		System.out.println(p.getNomProduit());
		}
}
