package exercicios.exercicio1;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		System.out.println("Digite o possível palíndromo: " );
		Scanner sc = new Scanner(System.in);
		String entrada = sc.next();
		String substring = "";
		for (int i = entrada.length()-1; i >= 0; i--) {
			substring += entrada.charAt(i);
		}
		if(substring.equals(entrada)) {
			System.out.println("Confirmado: é um palíndromo!");
		} else {
			System.out.println("Negativo: não é um palíndromo!");
		}
		sc.close();
		
		
	}
}
