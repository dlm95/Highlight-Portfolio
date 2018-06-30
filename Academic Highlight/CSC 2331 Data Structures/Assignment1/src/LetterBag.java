
public class LetterBag {
	public static void main (String args[]){
		
		BagInterface<String> letters = new ArrayBag<String>();
		String[] lets = {"a","b","c","d","e","f","g","h","i","j","k"};

		BagInterface<String> vowels = new ArrayBag<String>();
		vowels.a("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
		
		for(int x=0; x < lets.length; x++){
			letters.add(lets[x]);
			}
		
		for(int x=1;x<vowels.getCurrentSize();x++){
			
			if(vowels.contains()){
				
			}
		}
	}

}
