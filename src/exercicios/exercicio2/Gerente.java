package exercicios.exercicio2;

public class Gerente extends Funcionario {
	private String departamento;
	
	public double calcularBonus() {
		
		return getSalario()*gerarBonusDepartamento();
		
	}
	
	public double gerarBonusDepartamento() {
		if ("STI".equals(departamento)) {
			return 3.0;
		} else {
			return 1.0;
		}
	}
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}
