package Lista2;
import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		int ni = 0;
		long nl = 0;
		float nf = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("digite o numero inteiro");
		ni = ler.nextInt();
		
		System.out.println("digite o numero long");
		nl = ler.nextInt();
		
		System.out.println("digite o numero float");
		nf = ler.nextInt();
		
		System.out.println("o numero intero foi" + ni);
		System.out.println("o numero long foi" + nl);
		System.out.println("o numero float foi" + nf);
	}
}
