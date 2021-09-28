package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class O2 {

	public static void main(String[] args) {
		 
		 for (int i=1; i<=10; i++) {
			 String karakterTxt = showInputDialog("Skriv poengsummen din");
	          int tallkar = parseInt(karakterTxt);
          
      
     
       		
		      if (tallkar <= 100 && tallkar >=90) {
		    	System.out.println ("karakter: A") ; 
		      }
		      
		      else if (tallkar <= 89  && tallkar >=80) {
		    	 System.out.println ("karakter: B") ; 
		     }
		      else if (tallkar <= 79  && tallkar >=60) {
		    	 System.out.println ("karakter: C") ; 
		     }
		      else if (tallkar <= 59  && tallkar >=50) {
		    	 System.out.println ("karakter: D") ; 
		     }
		      else if (tallkar <= 49  && tallkar >=40) {
		    	 System.out.println ("karakter: E") ; 
		     }
		      else if (tallkar <= 39  && tallkar >=0) {
		    	 System.out.println ("karakter: F") ; 
		      }
		      else {
		    	  System.out.println ("Ugyldig poengsum");
		    	  i--;
		    	  
		      }
		 }
			 
			
		    	 
		

		 
		
		
		}

	}


