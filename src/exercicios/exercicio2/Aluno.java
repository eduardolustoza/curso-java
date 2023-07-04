package exercicios.exercicio2;

public class Aluno {
	private String nome;
	private String matricula;
	private String curso;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Aluno() {
		nome = "Eduardo";
		matricula = "0";
		curso = "Ciência da Computação";
	}
	
	public Aluno(String nome, String matricula, String curso) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + "]";
	}
	
	public static void main(String[] args) {
		System.out.println("Gerando construtor padrão sem parâmetros: ");
		System.out.println(new Aluno().toString());
		System.out.println("Gerando construtor padrão com parâmetros: ");
		System.out.println(new Aluno("Eduardo Lustoza", "007", "Espião Britânico").toString());
	}
}
