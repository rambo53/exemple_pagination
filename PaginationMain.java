/**
 * 
 */
package PaginationMain;

import java.util.ArrayList;
import java.util.List;

import PaginationEntite.Produit;
import PaginationUtil.Pagination;

/**
 * Classe en charge de
 * @author user
 * @version Pagination - V1.0
 * @date 2 août 2021 - 08:56:17
 */
public class PaginationMain {

	/**
	 * Methode
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Produit> produits=new ArrayList<>();
		
		Produit crayonPapier = new Produit("Crayon à papier", 1.5f, 5);
		produits.add(crayonPapier);
		Produit cahier = new Produit("Cahier 92 pages", 5.5f, 3);
		produits.add(cahier);
		Produit feutre = new Produit("Feutre rouge", 2.0f, 2);
		produits.add(feutre);
		Produit trousse = new Produit("Trousse tissue", 5.4f,1);
		produits.add(trousse);
		Produit ciseau = new Produit("Ciseau bout rond",4.7f,1);
		produits.add(ciseau);
		Produit calculatrice = new Produit("Calculatrice Lycée",99.99f,1);
		produits.add(calculatrice);
		Produit regle = new Produit("Règle double décimètre", 5.5f,1);
		produits.add(regle);
		Produit compas = new Produit("Compas", 8.6f,1);
		produits.add(compas);

		
		Pagination pagination = new Pagination();
		System.out.println("J'aurais "+pagination.nombrePages(3, produits)+" pages.");
		pagination.instancierTabPagination(pagination.getNbPages(), produits);
		System.out.println("j'aurais "+pagination.getArtParPages()+" articles par pages.");
		pagination.remplirTabPagination(produits);
		System.out.println("-------------------------Affichage page------------------------");
		pagination.afficherPage(2);
	}

}
