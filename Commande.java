package tp3;

import java.util.Date;
import java.util.Scanner;

public class Commande {

	private static int N;
	private int NC ;
	private Date DC;
	private int NL = 0 ;
	private LigneDeCommande[] TLC ;
	
	
	
	public Commande () {
		
		NC = ++N ;
		DC = new Date();
		TLC = new LigneDeCommande[10];
 		
	}
	
	
	
	public void AjouterLigneCommande(LigneDeCommande L) {
		
		if(NL<10) TLC[NL++] = L;}
		
	
	
	public double getPrixTotalCommande() {
           double PrixTotalCommande = 0 ;
           for(int i=0;i<=this.N;i++) {
        	   PrixTotalCommande+=this.TLC[i].getPrixTotalLigne();
           }
           return PrixTotalCommande;
	}
	
	public String toString() {
		System.out.println("Numero Commande  : " +this.NC );
		System.out.println("Date et Heure Commande :"+this.DC);
		System.out.println("Produits commandés " );
		System.out.println("Code\tNom\tPrix Unitaire\ttauxRemise\tQuantitéCommandée\tPrix total ");
		
		for(int i=0;i<=this.N;i++) {
			System.out.println(this.TLC[i]);
		}
		System.out.print("\t\tPrix Total :");
		return " "+this.getPrixTotalCommande();
		
	}
	
	
	
}
