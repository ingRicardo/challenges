package Javas;

import java.util.HashMap;

public class Main {
	
	  public static void main(String[] args) {		  		 		 
		   System.out.println(Main.func("Hello world!")); 
		  }
	
	  public static String func(String str) {
		    HashMap<Object, Object> map = new HashMap<Object, Object>();
		    String output = "";
		    for (int i = 0; i < str.length(); i++) {		    			    	
		    	if (!map.containsKey(str.charAt(i))) {
		    		map.put(str.charAt(i), str.charAt(i));
		    		output += str.charAt(i);
		    	}		    				      		      		   
		    }   
		   return output;
		  }
}
