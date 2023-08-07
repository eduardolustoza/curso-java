package exercicios.exercicio5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicados {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(4);
		numbers.add(4);
		numbers.add(5);

		List<Integer> numerosComMaisDeUmaOcorrencia = findDuplicates(numbers);
		System.out.println("Números com mais de uma ocorrência: "+numerosComMaisDeUmaOcorrencia);

	}


	public static List<Integer> findDuplicates(List<Integer> lista) {
		Map<Integer, Integer> ocorrencias = new HashMap<>();
		List<Integer> resultado = new ArrayList<>();

		// Contar as ocorrências de cada número na lista
		for (Integer numero : lista) {
			if (ocorrencias.containsKey(numero)) {
				ocorrencias.put(numero, ocorrencias.get(numero) + 1);
			} else {
				ocorrencias.put(numero, 1);
			}
		}

		// Adicionar os números com mais de uma ocorrência ao resultado
		for (Map.Entry<Integer, Integer> entry : ocorrencias.entrySet()) {
			if (entry.getValue() > 1) {
				resultado.add(entry.getKey());
			}
		}

		return resultado;
	}
}
