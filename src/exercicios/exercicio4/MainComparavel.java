package exercicios.exercicio4;

import java.util.Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

interface Comparavel {
	public int comparar(Comparavel c);
}

abstract class ObjetoComparavel implements Comparavel {

}

class Aluno extends ObjetoComparavel {

	private String nome;
	private int idade;

	public Aluno() {

	}

	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public int comparar(Comparavel c) {
		if (c instanceof Aluno) {
			Aluno outroAluno = (Aluno) c;
			return this.idade - outroAluno.idade;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + "]";
	}
	

}

public class MainComparavel {
	public static void main(String[] args) {
		Aluno[] alunos = new Aluno[10];
		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = new Aluno("Aluno-"+i, 10+i);
			
		}
		System.out.println(Arrays.toString(alunos));
		System.out.println(maxIdade(alunos).toString());
		System.out.println(minIdade(alunos).toString());
	}

	public static Aluno maxIdade(Aluno[] alunos) {
		Aluno maxIdade = alunos[0];
		for (int i = 0; i < alunos.length; i++) {
			if (maxIdade.comparar(alunos[i])<0) {
				maxIdade = alunos[i];
			}
		}
		return maxIdade;

	}

	public static Aluno minIdade(Aluno[] alunos) {
		Aluno minIdade = alunos[0];
		for (int i = 0; i < alunos.length; i++) {
			if (minIdade.comparar(alunos[i])>0) {
				minIdade = alunos[i];
			}
		}
		return minIdade;

	}
}