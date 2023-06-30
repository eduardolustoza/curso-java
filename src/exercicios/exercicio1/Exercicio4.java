package exercicios.exercicio1;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		System.out.println("Digite o e-mail completo: " );
		Scanner sc = new Scanner(System.in);
		String entrada = sc.next();
		String substring = null;
		if(entrada.indexOf("@") != -1 && entrada.indexOf("@") == entrada.lastIndexOf("@")) {
			substring= entrada.substring(entrada.indexOf("@") +1, entrada.length());
			System.out.println("O domínio do e-mail é: " + substring);
		} else {
			System.out.println("Favor digitar um e-mail válido: Exemplo: joao@mail.com");
		}
		sc.close();
		
		
	}
}
