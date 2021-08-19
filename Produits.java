/**
 * 
 */
package PaginationEntite;

/**
 * Classe en charge de
 * @author user
 * @version Pagination - V1.0
 * @date 2 août 2021 - 08:55:55
 */
public class Produit {

	private String designation;
	private float prix;
	private int quantite;
	
///////////CONSTRUCTEUR//////////////////////////	
	
	public Produit() {
		super();
	}

	public Produit(String designation, float prix, int quantite) {
		super();
		this.designation = designation;
		this.prix = prix;
		this.quantite = quantite;
	}
	
	
///////////METHODE//////////////////////////		
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("-----------PRODUITS-----------\n");
		sb.append("Description : ");
		sb.append(this.designation);
		sb.append("\n");
		sb.append("Prix : ");
		sb.append(this.prix);
		sb.append("\n");
		sb.append("Quantité : ");
		sb.append(this.quantite);
		sb.append("\n");
		sb.append("------------------------------\n");
		
		return sb.toString();
	}
	
	
///////////GETTER SETTER//////////////////////////		
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	
	
}
