package principal;

import java.util.ArrayList;
import java.util.List;

public class TendenciaCentral {

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
		
		calcularMedia(numeros);		
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
		
		System.out.println("A média dos números citados é - " + resultadoFinal);
		
		
	}
	
}
