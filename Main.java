package Javas;

import java.util.HashMap;

public class Main {
	
	
	  public static void main(String[] args) {
		  
		 
		  
		    Main.func("Hello world!");
		  }
	
	  public static void func(String str) {
		    String output = "";
		    HashMap<Object, Object> map = new HashMap<Object, Object>();
		  	
		  int j =0;  
		    for (int i = 0; i < str.length(); i++) {
		      char character = str.charAt(i);		  
		      map.put(character, character);
		     
		/*     if (output.indexOf(character) == -1){
		        output += character;
		     //   map.put(character, character);
		      }*/
		      
		      j++;
		    }
		    System.out.println(output);
		    System.out.println("map size "+map.size());
		   System.out.println("map -> "+ map);
		    	
		    	
		   
		    System.out.println("only one loop -> "+ j);
		  }

}
