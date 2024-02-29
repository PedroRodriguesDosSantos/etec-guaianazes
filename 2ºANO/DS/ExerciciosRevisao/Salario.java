import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite o valor da hora aula: ");
		int ha = ler.nextInt();
		
		System.out.println("Digite a quantidade de horas dadas no mês: ");
		double hm = ler.nextInt();
		
		hm = hm*ha;
		
		if(hm<1212) {
			hm = hm-hm*7.5/100;
			
		}else if(hm<2427.35){
			hm = hm-hm*9/100;
			
		}else if(hm<3641.03) {
			hm = hm-hm*12/100;
			
		}else if(hm<7087.22) {
			hm = hm-hm*14/100;
			
		}else if(hm<12136.79) {
			hm = hm-hm*14.5/100;
			
		}else if(hm<24273.57) {
			hm = hm-hm*16.5/100;
			
		}else if(hm<47333.46) {
			hm = hm-hm*19/100;
			
		}else {
			hm = hm-hm*22/100;
		}
		
		System.out.println(hm);
		
		ler.close();
	}
}
