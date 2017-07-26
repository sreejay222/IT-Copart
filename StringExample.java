
public class StringExample {
	
	public static void main(String[] args) {
		String h1="hello";
		String h2="hello";
		
		boolean n1=h1.equals(h2);
		System.out.println(n1);
		
		if(h1==h2) 
		{
			System.out.println(true);
		}
		
		System.out.println(h1.hashCode()==h2.hashCode());
			
		
	}

}
