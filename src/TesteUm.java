public class Main {
    public static void main(String[] args) {
      Main main = new Main();

      String checkum = "Quero faxina nas locadoras de video: jogue blitz com whisky PM";
      System.out.println("Pangramática: " + main.check(checkum));

      String checkdois = "Hello World";
      System.out.println("Pangramática: " + main.check(checkdois));
    }

    public boolean check(String sentence){
    String letters = "ABCDEFGHIJKLMNOPQRSTUVWYXZ";
    
    for(String letter : letters.split("")) {
			if(!sentence.toUpperCase().contains(letter)) {
				return false;
			}
		}
    
    return true;
  }
}