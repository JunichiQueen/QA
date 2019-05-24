import java.util.HashMap;

public class MorseCode {

	public HashMap<String, String> createMorseCode() {
		HashMap<String, String> morsecode = new HashMap<String, String>();
		morsecode.put(".-", "A");
		morsecode.put("-...", "B");
		morsecode.put("-.-.", "C");
		morsecode.put("-..", "D");
		morsecode.put(".", "E");
		morsecode.put("..-.", "F");
		morsecode.put("--.", "G");
		morsecode.put("....", "H");
		morsecode.put("..", "I");
		morsecode.put(".---", "J");
		morsecode.put("-.-", "K");
		morsecode.put(".-..", "L");
		morsecode.put("--", "M");
		morsecode.put("-.", "N");
		morsecode.put("---", "O");
		morsecode.put(".--.", "P");
		morsecode.put("--.-", "Q");
		morsecode.put(".-.", "R");
		morsecode.put("...", "S");
		morsecode.put("-", "T");
		morsecode.put("..-", "U");
		morsecode.put("...-", "V");
		morsecode.put(".--", "W");
		morsecode.put("-..-", "X");
		morsecode.put("-.--", "Y");
		morsecode.put("--..", "Z");
		return morsecode;
	}

	public String splitter(String morsecode) {
		HashMap<String, String> code = createMorseCode();
		String phrase = "";
		String[] array1 = morsecode.split(" / ");
		for (int i = 0; i < array1.length; i++) {
			String[] letter = array1[i].split(" ");
			for (int j = 0; j < letter.length; j++) {
				phrase += code.get(letter[j]);
			}
			phrase = phrase + " ";
		}
		return phrase;
	}

	public void printMorseCode(String[] string1, HashMap<String, String> translator) {
		for (int i = 0; i < string1.length; i++) {

			System.out.println(translator.get(string1[i]));

		}

	}

}
//
// for(
//
// int p = 0;p<27;p++)
// {
// if (string1[i].equals(translator.get(p))) {
// System.out.println(string1[i]);
// }