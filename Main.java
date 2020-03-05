package tp3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
	
		Commande C = new Commande();
		
	    ProduitEnStock P1 =new ProduitEnStock();
	    LigneDeCommande L1=new LigneDeCommande();
	    
	    
	    ProduitAvecRemise P2=new ProduitAvecRemise();
	    LigneDeCommande L2=new LigneDeCommande(12);
	    
	    
	    
	    L1.connecterProduit(P1);
	    L2.connecterProduit(P2);
	    
	    C.AjouterLigneCommande(L1);
	    C.AjouterLigneCommande(L2);
	    
	    
	    
	    
	    
	    
	    
	    System.out.println(C.toString());
	    
	}
	
	
	

}
