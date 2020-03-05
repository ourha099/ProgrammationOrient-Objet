package tp3;

import java.util.Scanner;

public class ProduitAvecRemise extends ProduitEnStock {

	protected  double TR ;
	
	public ProduitAvecRemise() {
		super();
		
	Scanner S = new Scanner(System.in);
	System.out.println("Donner le taux de remise ");
	this.TR=S.nextDouble();
	}
	
	public  ProduitAvecRemise(String nom ,Float pu,int qs,int np,double tr) {
		
		super(nom , pu, qs, np);
		TR=tr;
	}
	
    public String toString() {
		
		return super.toString()+" "+TR ;
	}
    
    public float getTR() {
    	
    	return (float) (super.getTR()+this.TR);
    }
	
    public float getPU() { return super.getPU()*(1-(float)(this.TR/100));}
    
    public double ValeurEnStock() {
    	
       return getPU()*this.QS ;           	
    }
    
    

	
    
    
    
}
