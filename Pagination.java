/**
 * 
 */
package PaginationUtil;

import java.util.List;

import PaginationEntite.Produit;

/**
 * Classe en charge de
 * @author user
 * @version Pagination - V1.0
 * @date 2 août 2021 - 08:56:31
 */
public class Pagination {
	
	private int nbPages;
	int artParPages;
	private Produit[][] tabProduitParPages;

	public Pagination() {
		super();
	}

	public int nombrePages(int nombreElementParPage, List<Produit> produits) {
		
		int nbPages=0;
		
		if(produits.size()%nombreElementParPage==0) {
			nbPages=produits.size()/nombreElementParPage;
		}
		else {
			nbPages=produits.size()/nombreElementParPage+1;
		}
		
		this.setNbPages(nbPages);
		
		return nbPages;
		
	}
	
	
	public void instancierTabPagination(int nbPages, List<Produit> article) {
		
		if(article.size()%nbPages==0) {
			artParPages=article.size()/nbPages;
		}
		else {
			artParPages=article.size()/nbPages+1;
		}
		this.setArtParPages(artParPages);
		
		this.tabProduitParPages=new Produit[this.nbPages][this.artParPages]; 
		
	}
	
	public void remplirTabPagination(List<Produit> article) {
	
		for(int i = 0; i<this.getNbPages();i++) {
			for(int j = 0; j<this.getArtParPages();j++) {
				if(article.size()>0) {
					tabProduitParPages[i][j]=(article.get(0));
					article.remove(0);
				}
				else {
					tabProduitParPages[i][j]=null;
				}
				
			}
		}
		
	}
	
	public void afficherPage(int page) {
		
		for (int i=0;i<this.getArtParPages();i++) {
			if(tabProduitParPages[page][i]==null) {
				System.out.println("");
			}
			else {
				System.out.println(tabProduitParPages[page][i]);
				System.out.println("Page="+page+" Article n°="+i+"\n");
			}

		}
	}
	

	public int getArtParPages() {
		return artParPages;
	}

	public void setArtParPages(int artParPages) {
		this.artParPages = artParPages;
	}

	public Produit[][] getTabProduitParPages() {
		return tabProduitParPages;
	}

	public void setTabProduitParPages(Produit[][] tabProduitParPages) {
		this.tabProduitParPages = tabProduitParPages;
	}

	public int getNbPages() {
		return nbPages;
	}

	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}
	
	
}
