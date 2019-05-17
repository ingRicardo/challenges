package Javas;

import java.util.HashMap;

public class Main {
	
	  public static void main(String[] args) {		  		 		 
		    Main.func("Hello world!");
		  }
	
	  public static void func(String str) {
		    HashMap<Object, Object> map = new HashMap<Object, Object>();  
		    for (int i = 0; i < str.length(); i++) {				  
		      map.put(str.charAt(i), str.charAt(i));		      		   
		    }
		   System.out.println("map -> "+ map);
		  }
}
