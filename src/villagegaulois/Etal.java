package villagegaulois;

import personnages.Gaulois;
import produit.*;

public class Etal <P extends Produit> {
	private P produit;
	private Gaulois vendeur;
	private int quantiteDebutMarche;
	private int quantite;
	private boolean etalOccupe = false;

	public boolean isEtalOccupe() {
		return etalOccupe;
	}

	public Gaulois getVendeur() {
		return vendeur;
	}

	public int getQuantite() {
		return quantite;
	}
	
	public P getProduit() {
		return produit;
	}

}


