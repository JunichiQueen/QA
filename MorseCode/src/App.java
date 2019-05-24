import java.util.HashMap;

public class App {
	public static void main(String[] args) {
		MorseCode coder = new MorseCode();
		HashMap<String, String> translator = coder.createMorseCode();

		String morsey1 = new String(
				".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--");

		System.out.println(coder.splitter(morsey1));
	}
}
