package produit;

public class Sanglier extends Produit {
	private String nomChasseur;
	private int poids;
	public Sanglier(String nomProduit, String unite) {
		super(nomProduit, unite);
	}
	
	@Override
	public void description() {
		System.out.println("sanglier de " + poids + " " + this.getUnite());
		
	}
}
