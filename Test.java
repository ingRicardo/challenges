/**
 * 
 */
package javas;

/**
 * @author alfredo
 *
 */
public class Test {

	/**
	 * 
	 */


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func("rrricarrdoo");
	//	func2("rrricarrdoo");
	}
	
	public static void func(String str) {
		int j=0;
		String tmp = "";
		String tmp2 = "";
		
		do {
		
		tmp =String.valueOf(str.charAt(j));
		
		//System.out.println(tmp+ ":: "+ tmp2);
		 if (!tmp2.equals(tmp)) 
			for (int i=1; i < str.length(); i++) {
				System.out.println(str.charAt(j) +":"+str.charAt(i));
				if (str.charAt(j) != str.charAt(i)) {
					
					tmp =  tmp +str.charAt(i);
					System.out.println("tmp -> "+tmp);
				
					//something here
					
				}
			}
		//tmp2 = String.valueOf(str.charAt(j));
		System.out.println("");
		j++;
	//	System.out.println(tmp);
		}while(j<str.length());
		System.out.println(tmp);
	}
	
	public static void func2( String str) {
		int tmp,c=0;
		
		for (int j=0; j< str.length(); j++) {
			tmp =str.indexOf(str.charAt(j));
			c =0;
			for (int i=1; i< str.length(); i++) {
				if(tmp == str.indexOf(str.charAt(i))) {
					c++;
					if(c>1)
						System.out.println(str.indexOf(str.charAt(i)));
				}
		}
			
			System.out.println("");
		}
		
	}

}
