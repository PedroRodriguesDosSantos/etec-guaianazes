import java.util.Scanner;

public class PrecoProduto {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		String n = "S";
		
		while(n.equalsIgnoreCase("S")) {
			
			System.out.println("Digite o valor do produto: ");
			double produto = ler.nextInt();
			
			System.out.println("Digite o lucro que você deseja ter (em porcentagem) : ");
			double lucro = ler.nextInt();
			
			System.out.println("Você devera vender o produto por R$"+(produto*lucro/100+produto));
			
			System.out.println("Deseja continuar? 'S' para sim 'N' para nâo");
			n = ler.next();
		}
		
		ler.close();
	}
}
