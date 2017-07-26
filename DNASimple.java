import java.util.*;

public class DNASimple {
	
	private static String findMaxChar(String str) 
	{
		char[] array = str.toCharArray();
	    int countMax = 1;
	    char ch = array[0];
	    for(int i = 0, j = 0; i < str.length() - 1; i = j){
	        int count = 1;
	        while (++j < str.length() && array[i] == array[j]) {
	            count++;
	        }
	        if (count > countMax) {
	        	countMax = count;
	        	ch = array[i];
	        }
	    }
	    return (ch + " " + countMax);
	} 
	
	public static void main(String[] args)
	{
	System.out.println("Enter the DNA Sequencing:");
	Scanner sc=new Scanner(System.in);
	String dna=sc.nextLine();
	String result = findMaxChar(dna);
	System.out.println(result);
	}
	
	

}
