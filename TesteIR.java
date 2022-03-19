
public class TesteIR {
	public static void main(String[] args) {
		double impostoDeRenda = 1900.0;
		double aliquota;

		if (impostoDeRenda >= 1900.0 && impostoDeRenda <= 2800.0) {
			aliquota = impostoDeRenda - 142.0;
			System.out.println("O valor da aliquota é igual a R$" + aliquota);
		} else {
			if (impostoDeRenda >= 2800.1 && impostoDeRenda <= 3751.0) {
				aliquota = impostoDeRenda - 350.0;
				System.out.println("O valor da aliquota é igual a R$" + aliquota);
			} else {
				if (impostoDeRenda >= 3751.01 && impostoDeRenda <= 4666.00) {
					aliquota = impostoDeRenda - 636.0;
					System.out.println("O valor da aliquota é igual a R$" + aliquota);
				}
			}
		}
	}
}
