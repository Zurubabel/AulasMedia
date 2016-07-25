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
		
		System.out.println("A m�dia dos n�meros citados � - " + resultadoFinal);
		
		
	}
	
}
