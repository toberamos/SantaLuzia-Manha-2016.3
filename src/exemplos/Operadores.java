package exemplos;

public class Operadores {
	public static void main(String[] args) {
		
		int x = 5;
		int y;
		
		y = x++; // y = 5, x = 6
		y = ++x; // x = 7, y = 7
		System.out.println("Saidas: \nx: " + x + "\ny: " + y);
	}
}
