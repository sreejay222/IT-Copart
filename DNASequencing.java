import java.util.*;
import java.util.Map.Entry;

public class DNASequencing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the DNA Sequence:");
		String dnaMolecule = sc.nextLine();
		char[] dna=new char[dnaMolecule.length()];
		
		HashMap<String,Integer> counter=new HashMap<>();
		int maxValueInMap;
		
		//Converting the string into a character array
		for(int i=0;i< dna.length-1; i++)
		{
			dna[i]=dnaMolecule.charAt(i);
		}
		
		
		for(int i=0;i< dna.length-1; i++)
		{
			int charCount=0;
			if(dna[i]==dna[i+1])
				{
					if(counter.containsKey(dna[i]))
					{
						charCount= counter.get(Character.toString(dna[i]))+1;
						counter.put(Character.toString(dna[i]), charCount);
						//System.out.println(counter);
					}
					else
					{
						counter.put(Character.toString(dna[i]), 1);
					}
				
				}
			
		}
		
		maxValueInMap=(Collections.max(counter.values()));
		//System.out.println(maxValueInMap);
		//System.out.println(counter);
		for (Entry<String, Integer> entry : counter.entrySet()) 
		{  
            if (entry.getValue()==maxValueInMap) 
            {
                System.out.println(entry.getKey()+" "+entry.getValue());     
            }
        }
	}

}
