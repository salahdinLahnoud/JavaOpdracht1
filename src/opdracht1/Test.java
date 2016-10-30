package opdracht1;

public class Test {
	
	public static void main(String[] args) {
			
		@SuppressWarnings("unused")
		String achternaam;
		String naam = "Jhon";
	    StringBuilder s = new StringBuilder().append(naam);
	
		System.out.println("Hello  "+ s);
		Test test = new Test();
		System.out.println(Test.add());
		System.out.println();
		test.Totaal();

		
	}
	
	public static int add(){
		
		return Totaal()+1;
	}
	
	
	public static int Totaal(){
		
		return 3;
	}
	
	public static void print(){
		
		
			
			
		
		
		
	}
	
	
	
	
	
	

}
