package teste01;
import java.util.Scanner;


public class CalculoMedia {
	public static void main(String[] args) {
		
		Scanner pergunta = new Scanner(System.in);
		
		System.out.println("Digite o seu primeiro nome:");
		String primeiroNome =  pergunta.next();
		
		System.out.println("Digite a sua primeira nota: ");
		String primeiraNota = pergunta.next();
		
		System.out.println("Digite a sua segunda nota: ");
		String segundaNota = pergunta.next();
		
		double nota1 = Double.parseDouble(primeiraNota);
		double nota2 = Double.parseDouble(segundaNota);
		double media = (nota1 + nota2) / 2;
		
		
		System.out.println("Olá " +primeiroNome+ ", a sua média é igual a " + media);
	}
}
