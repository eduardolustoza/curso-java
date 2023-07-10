package exercicios.exercicio3;

public class ExercicioMetodoFinal {
    public static void main(String[] args) {
        Retangulo1 retangulo = new Retangulo1(5, 10);
        retangulo.exibirInformacoes();
        retangulo.calcularArea();
    }
}

class Forma1 {
	//Removendo o final
    public void exibirInformacoes() {
        System.out.println("Esta é uma forma geométrica.");
    }
}

class Retangulo1 extends Forma1 {
    private int largura;
    private int altura;

    public Retangulo1(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    //Métodos do tipo final não permitem que a subclasse realize um override
    public void exibirInformacoes() {
        System.out.println("Este é um retângulo com largura " + largura + " e altura " + altura + ".");
    }

    public void calcularArea() {
        int area = largura * altura;
        System.out.println("A área do retângulo é: " + area);
    }
}  

