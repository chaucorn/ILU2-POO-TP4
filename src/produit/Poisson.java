package produit;

public class Poisson extends Produit {
	private String date;
	public Poisson(String nomProduit, String unite) {
		super(nomProduit, unite);
	}
	
	@Override
	public void description() {
		System.out.println("poisson peche " + date);
		
	}
}
