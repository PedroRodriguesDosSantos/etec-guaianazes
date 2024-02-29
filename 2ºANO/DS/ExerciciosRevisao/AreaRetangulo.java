import java.util.Scanner;

public class AreaRetangulo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int base, altura, area, perimetro;
		
		System.out.println("Digite a base");
		base = ler.nextInt();
		
		System.out.println("Digite a altura");
		altura = ler.nextInt();
		
		area = base*altura;
		
		perimetro = base*2+altura*2;
		
		System.out.println("A area do retangulo é igual a: "+area+"\nO perimetro do retangulo é igual a: "+perimetro);
		ler.close();
	}
}
