package exemplo;

public class ControleDeFluxoContinue {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if ((i > 50 && i < 60) || (i > 80 && i < 90)) {
				continue;
			}
			System.out.println(i);
		}
	}
}
