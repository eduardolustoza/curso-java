package exercicios;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		System.out.println("Digite o primeiro valor:" );
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.println("Digite o segundo valor:" );
		int n = sc.nextInt();
		int soma = 0;
		if(m > n) {
			System.out.println("Digite o valor menor primeiro!");
		} else {
			for (;m <= n; n-- ) {
				soma += n%2==0 ? n : 0;
				System.out.println("M: " + m + " - N: " + n + " Soma: " + soma);
			}
			System.out.println("A soma de números pares até " + m + " é de: " + soma);
		}
		sc.close();
		
	}
}
