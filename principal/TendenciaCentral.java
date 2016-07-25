package principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TendenciaCentral {
	
	// GitHub - https://github.com/Zurubabel/AulasMedia

	public static void main(String[] args) {
		
		List<Float> numeros = new ArrayList<>();
		
		numeros.add(1.0f);
		numeros.add(3.0f);
		numeros.add(3.0f);
		numeros.add(3.0f);
		numeros.add(5.0f);
		numeros.add(5.0f);
		numeros.add(5.0f);
		numeros.add(8.0f);
		numeros.add(9.0f);
		numeros.add(9.0f);
		numeros.add(9.0f);
		
		
		// 9
		// Mediana = 4
		calcularMedia(numeros);		
		calcularMediana(numeros);
		calcularModa(numeros);
	}
	
	// Calcular Moda
	public static void calcularModa(List<Float> numeros) {
		Map<Float, Integer> frequenciaNumeros = new HashMap<>();
		
		int maiorFrequencia = 0;
		
		for (Float numero : numeros) {
			// Verificar se o n�mero j� est� na lista
			Integer quantidade = frequenciaNumeros.get(numero);
			// Lista de n�meros
			if (quantidade == null) {
				quantidade = 1;
			}  else {
				quantidade += 1;
			}
			frequenciaNumeros.put(numero, quantidade);
			
			if (maiorFrequencia < quantidade) {
				maiorFrequencia = quantidade;
			}
		}
		System.out.print("A(s) moda(s) � (s�o) : ");
		for (Float numeroChave : frequenciaNumeros.keySet()) {
			int quantidade = frequenciaNumeros.get(numeroChave);
			if (maiorFrequencia == quantidade) {
				System.out.print(numeroChave + " ");
			}
		}
		
		
	}
	
	// M�dia, mediana e moda
	
	public static void calcularMedia(List<Float> numeros) {
		/* M�dia
		 * Soma das valores / frequ�ncia total
		 */
		
		float resultado = 0.0f;
		
		for (Float numero : numeros) {
			// Passando pela lista de n�meros para som�-los
			resultado += numero;
		}
		
		float resultadoFinal = resultado / numeros.size();
		
		System.out.println("A m�dia dos n�meros citados � " + resultadoFinal);
	}
	
	// Mediana
	public static void calcularMediana(List<Float> numeros) {
		/* Mediana
		 * 
		 *  (Quantidade + 1) / 2
		 *  Se a quantidade de n�meros for �mpar, obtenho o n�mero
		 *  Se for par, somo os dois n�meros e os divido por dois
		 * 
		 */
		
		float resultado = 0.0f;
		
		// x = [1,2,3,4,5,6] = 6 n�meros
		// 0 => 1; 1 => 2; 2 => 3; 3 => 4; 4 => 5; 5 => 6
		// x.get(2) => 3
		
		// Se o n�mero � �mpar
		if (numeros.size() % 2 != 0) {
			int posicaoNumero = ((numeros.size() + 1) / 2) - 1;
			resultado = numeros.get(posicaoNumero); 
		} else {
			// Se for par
			int posicaoNumero = Math.round((numeros.size() + 1) / 2) - 1;
			resultado = (numeros.get(posicaoNumero) + numeros.get(posicaoNumero + 1)) / 2;
		}
		
		System.out.println("A Mediana dos n�meros citados � " + resultado);
	}
	
}
