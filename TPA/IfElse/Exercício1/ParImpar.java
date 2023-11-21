import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n;
		
		System.out.println("Digite um Numero: ");
		n = ler.nextDouble();
		
		if(n%2==0) {
			System.out.println("Seu numero e Par");
		}else{
			System.out.println("Seu numero e Impar");
			
		}
		ler.close();}
}
