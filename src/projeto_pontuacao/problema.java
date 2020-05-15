package projeto_pontuacao;

import java.util.Locale;
import java.util.Scanner;

public class problema {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int totalCompras;
		double ticketMedio;
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		
		System.out.print("\nQuantas compras o cliente fez no último ano? ");
		totalCompras = input.nextInt();
		System.out.print("Qual o ticket médio? ");
		ticketMedio = input.nextDouble();
		
		input.close();

	}

}
