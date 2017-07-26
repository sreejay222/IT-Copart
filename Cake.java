package mostApproritate;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Cake {
	@SuppressWarnings("resource")
	public static void main(String args[]) throws FileNotFoundException{
        /*int n = 4;*/
		
        Scanner inFile = new Scanner(new File("C:/Users/sreejay/Desktop/inputTestCase.txt")); 
        int n = inFile.nextInt();
        while (inFile.hasNext()){
        
        int A = inFile.nextInt();

if (n > 0 && n<= 100){
	
        	
        	if(A<=500000000){
        		double g= Math.round(Math.sqrt(A));
        		
        		double x = g*n;
        		System.out.println(x);
		}
	}
else {  
	
      System.out.println("provide a valuable input");
      break;
	}
}
}
}
        
    
