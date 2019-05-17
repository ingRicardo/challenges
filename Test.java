package javas;

class Main {
  public static void main(String[] args) {
    Main.func("Hello world!");
  }
  	
  public static void func(String str) {
    String output = "";
    for (int i = 0; i < str.length(); i++) {
      char character = str.charAt(i);
      if (output.indexOf(character) == -1){
        output += character;
      }
    }
    System.out.println(output);
  }
}
