package produit;

public abstract class Produit {
	private String nomProduit;
	private String unite;
	public Produit(String nomProduit, String unite) {
		this.nomProduit = nomProduit;
		this.unite = unite;
		
	}
	private void donnerNom(String nomProduit ) {
		this.nomProduit = nomProduit;
	}
	
	private void donnerUnite(String unite) {
		this.unite = unite;
	}
	
	private String getNom() {
		return nomProduit;
	}
	
	protected String getUnite() { // accessible pour les classe fille
		return unite;
	}
	public abstract void description();	
}

