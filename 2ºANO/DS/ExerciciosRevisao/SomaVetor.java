import java.util.Scanner;
public class SomaVetor {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i, a[], b[];
		
		a = new int [10];
		
		b = new int [10];
		
		for(i = 0; i<a.length; i++) {
			System.out.println("Digite o "+(i+1)+"° valor de A: ");
			a[i] = ler.nextInt();
		}
		
		
		for(i = 0; i<a.length; i++) {
			System.out.println("Digite o "+(i+1)+"° valor de B: ");
			b[i] = ler.nextInt();
		}
		 System.out.print("C: [");
		for(i=0; i<a.length; i++) {
			System.out.print(a[i]+b[i]+", ");
		}
		System.out.print("]");
		
		ler.close();
	}

}
