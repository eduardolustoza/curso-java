package exercicios;
import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Random random = new Random();
		int x = random.nextInt(100)+1;
		System.out.println("Tente acertar o valor gerado aleatoriamente: " );
		Scanner sc = new Scanner(System.in);
		int entrada = sc.nextInt();
		System.out.println(x);
		while (entrada != x) {
			if (entrada > x) {
				System.out.println("ERROOOOUUUU! O valor digitado é maior que o valor gerado.");
			} else  {
				System.out.println("ERROOOOUUUU! O valor digitado é menor que o valor gerado.");
			} 
			System.out.println("Tente acertar o valor gerado aleatoriamente: " );
			entrada = sc.nextInt();
		}
		System.out.println("Acertou, miserável!");
		sc.close();
		
		
	}
}
