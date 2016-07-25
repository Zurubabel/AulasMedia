package principal;

import java.util.ArrayList;
import java.util.List;

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
		// 9
		// Mediana = 4
		calcularMedia(numeros);		
		calcularMediana(numeros);
	}
	
	// Média, mediana e moda
	
	public static void calcularMedia(List<Float> numeros) {
		/* Média
		 * Soma das valores / frequência total
		 */
		
		float resultado = 0.0f;
		
		for (Float numero : numeros) {
			// Passando pela lista de números para somá-los
			resultado += numero;
		}
		
		float resultadoFinal = resultado / numeros.size();
		
		System.out.println("A média dos números citados é " + resultadoFinal);
	}
	
	// Mediana
	public static void calcularMediana(List<Float> numeros) {
		/* Mediana
		 * 
		 *  (Quantidade + 1) / 2
		 *  Se a quantidade de números for ímpar, obtenho o número
		 *  Se for par, somo os dois números e os divido por dois
		 * 
		 */
		
		float resultado = 0.0f;
		
		// x = [1,2,3,4,5,6] = 6 números
		// 0 => 1; 1 => 2; 2 => 3; 3 => 4; 4 => 5; 5 => 6
		// x.get(2) => 3
		
		// Se o número é ímpar
		if (numeros.size() % 2 != 0) {
			int posicaoNumero = ((numeros.size() + 1) / 2) - 1;
			resultado = numeros.get(posicaoNumero); 
		} else {
			// Se for par
			int posicaoNumero = Math.round((numeros.size() + 1) / 2) - 1;
			resultado = (numeros.get(posicaoNumero) + numeros.get(posicaoNumero + 1)) / 2;
		}
		
		System.out.println("A Mediana dos números citados é " + resultado);
	}
	
}
