package logica.exercicios.revisao;

public class Exercicio04 {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			if ((i >= 50) && (i <= 75)) {
				continue;
			}
			System.out.println(i);
		}

	}

}
