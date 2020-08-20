
public class StringDemo {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("baab");
		
		System.out.println("str is "+s);
		
		
	
	for(int i=1;i<s.length();i++) {
		if(s.charAt(i)==s.charAt(i-1)) {
			s.delete(i-1,i+1);
			
		}
	}
	if(s.length() == 0)
		System.out.println("Empty String");
	else 
		System.out.println(s);
	
	System.out.println("changed str is "+s.toString());
	
	String test = "helLo";
	
	char[] ch = test.toCharArray();
	
	for(int i=0;i<ch.length;i++) {
		
	System.out.println("testing upper case" + Character.isUpperCase(ch[i]));
	}
	
	
	StringBuffer testsb = new StringBuffer(test);
	
	String s1 = "testing";
	
	System.out.println(s1);
	
	
	s1 = "string";
	String s2 = s1.concat("concatenating");
	
	
	System.out.println(s2);
	
	

	}

}
