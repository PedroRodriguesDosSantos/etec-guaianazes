import java.util.Scanner;

public class AlgarismoInvertido {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		
		System.out.println("Digite um n�mero de tr�s algarismos");
		String a = ler.next();
		String[] b = a.split("");
			
		for (int i = 2; i != -1; i--) {
			System.out.print(b[i]);
		}
		
		ler.close();
	}
}
