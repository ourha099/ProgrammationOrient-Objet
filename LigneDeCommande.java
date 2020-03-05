package tp3;

import java.util.Scanner;

public class LigneDeCommande {
	
	ProduitEnStock PR;
	int QC ;

	
	
	public LigneDeCommande() {
		
		Scanner scanne = new Scanner(System.in);
		
		System.out.println("saisir la qauntité commander");
		
		this.QC =scanne.nextInt();
		}
	
	
	public LigneDeCommande(int QC) {
		
		this.QC =QC  ;
	}
	  
	
	public void connecterProduit(ProduitEnStock pr) {
	this.PR =pr;
	}
	
	
	
	public float getPrixTotalLigne() {
		return this.QC * this.PR.PU ;
		
	}
	
    public String toString() {
    	
		
		 return (this.PR.Code+"\t"+ this.PR.Nom+"\t"+this.PR.PU+"\t\t"+this.PR.getTR()+"\t\t"+this.QC+"\t\t\t"+ this.getPrixTotalLigne()+"\t" );
		               
	}
    
    
}