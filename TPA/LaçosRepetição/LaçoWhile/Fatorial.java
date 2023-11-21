import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n,m=1, i=1;
		
		System.out.println("digite um numero");
		n = ler.nextInt();
		
		while(i<n) {
			m=n*i;
			i++;
		}
		System.out.println(m);
	}
}
