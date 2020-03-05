package tp3;

import java.util.Scanner;




public class ProduitEnStock {
	
	int Code ;
	 String Nom ;
	 float PU;
	protected int QS;
	private  int NP;
	
	public ProduitEnStock() {
		Scanner scanne = new Scanner(System.in);
		
		System.out.println("entrer le nom de produit");
		this.Nom = scanne.nextLine();
		
		System.out.println("entrer le code de produit");
		this.Code = scanne.nextInt();
		
	    System.out.println("entrer le prix unitaire");
		this.PU = scanne.nextFloat();
		
		System.out.println("entrer la quantité en Stock ");
		this.QS = scanne.nextInt();
		
		System.out.println("entrer le nombre de produit");
		this.NP = scanne.nextInt();
	}

	
	public ProduitEnStock( String nom ,Float pu,int qs,int np ) {
		this.Nom = nom ;
		this.PU = pu ;
		this.QS =qs ;
		this.NP=np;
	}
	
	
	public void EntreeEnStock(int quantEntree) {
		this.QS+=quantEntree;
	}
	
	public void SortieDuStock(int quantSortie) {
		this.QS-=quantSortie;
	}
	/*retourne la valeure de stocke PU multiplie par QS*/
	public double ValeurEnStock() {
		return this.QS *this.PU;
	}
	
	public float getTR() {
		return 0;
	}
	
	
	public float  getPU() {
		return this.PU;
	}
	
	public int NombreDeProduits() {
		return this.NP;
	}
	
	
	public boolean equals(ProduitEnStock P) {
		return ((this.Code == P.Code)&&(this.Nom.equals(P.Nom))&&(this.PU==P.PU)&&(this.QS==P.QS));
	}
	
	public String toString() {
		
		return this.Code +" "+this.Nom+" "+this.PU;
	}
	
}



