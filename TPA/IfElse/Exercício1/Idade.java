import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a1, a2, r;
		
		System.out.println("Digite o Ano Atual");
		a1 = ler.nextInt();
		
		System.out.println("Digite seu Ano de Nascimento");
		a2 = ler.nextInt();
		
		r = a1-a2;
		
		System.out.println("Voce tem "+r+" anos de idade");		
		if(r<18) {
			System.out.println("Voce e Menor de Idade");
		}else {
			System.out.println("Voce e Maior de Idade");			
		}

		ler.close();}
}

