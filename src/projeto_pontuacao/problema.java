package projeto_pontuacao;

import java.util.Locale;
import java.util.Scanner;

public class problema {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int totalCompras, inadimplencia, scoreCompras, scoreAtraso, scorePagamento;
		double ticketMedio;
		char formaPagamento;
		
		scoreCompras = 0;
		scoreAtraso = 0;
		scorePagamento = 0;
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		
		System.out.print("\nQuantas compras o cliente fez no último ano? ");
		totalCompras = input.nextInt();
		System.out.print("Qual o ticket médio? ");
		ticketMedio = input.nextDouble();
		
		System.out.print("\nQuantas vezes o cliente atrasou o pagamento? ");
		inadimplencia = input.nextInt();
		System.out.print("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)? ");
		formaPagamento = input.next().charAt(0);
		
		//Score Compras
		if (totalCompras == 0) {
			scoreCompras = 0;
		} else if ((ticketMedio > 0 && ticketMedio <= 3000) && totalCompras >= 1 && totalCompras <= 2) {
			scoreCompras = 20;
		} else if ((ticketMedio > 0 && ticketMedio <= 3000) && totalCompras > 2) {
			scoreCompras = 40;
		} else if (ticketMedio > 3000) {
			scoreCompras = 60;
		}
		
		
		//Score Inadimplência
		if (inadimplencia > 1 || totalCompras == 0) {
			scoreAtraso = 0;
		} else if (totalCompras > 0 && (inadimplencia > 0 && inadimplencia <= 1)) {
			scoreAtraso = 15;
		} else if (totalCompras > 0 && inadimplencia == 0) {
			scoreAtraso = 30;
		}
		
		//Score Pagamento
		if ((formaPagamento == 'C' || formaPagamento == 'c') || (formaPagamento == 'B' || formaPagamento == 'b')) {
			scorePagamento = 10;
		} else {
			scorePagamento = 5;
		}
		
		
		System.out.printf("%nScore de volume de compras = %d pontos%n", scoreCompras);
		
		System.out.printf("%nScore de inadimplência = %d pontos%n", scoreAtraso);
		System.out.printf("Score de forma de pagamento = %d%n", scorePagamento);
		
		input.close();

	}

}
