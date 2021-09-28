package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
public class O1 {

	public static void main(String[] args) {
		
		
 String tallTxt= showInputDialog("Skriv inn bruttoinntekt");
	int tall = Integer.parseInt(tallTxt);
	
	if(tall<=0 && tall <=184800) { 
		 System.out.print("Ingen Trinnskatt" );
		 }
		 else if(tall>184800 && tall <=260100)	{
			System.out.print ("Kr i trinnskatt =" + (tall*0.017));
		 }
		 else if (tall>260100 && tall <=651250)	 {
			 System.out.print("Kr i trinnskatt =" + (tall*0.04));
			 
		 }
		 else if(tall>651250 && tall <= 1021550) {
			 System.out.print("Kr i trinnskatt =" + (tall*0.132));
			 
		 }
	 else if(tall> 1021050) {
		 System.out.print("Kr i trinnskatt =" + (tall*0.162));
			 
	 }
 
 
		
		

	}

}
