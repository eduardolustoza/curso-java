package exercicios.exercicio1;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int soma = 0;
		for (int i = 1; i <= x; i++ ) {
			soma += i%2==0 ? i : 0;
		}
		System.out.println("A soma de números pares até " + x + " é de: " + soma);
		sc.close();
		
	}
	
}


