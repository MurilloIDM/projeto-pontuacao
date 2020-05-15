package projeto_pontuacao;

import java.util.Locale;
import java.util.Scanner;

public class problema {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int totalCompras, inadimplencia;
		double ticketMedio;
		char formaPagamento;
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO �LTIMO ANO");
		
		System.out.print("\nQuantas compras o cliente fez no �ltimo ano? ");
		totalCompras = input.nextInt();
		System.out.print("Qual o ticket m�dio? ");
		ticketMedio = input.nextDouble();
		
		System.out.print("\nQuantas vezes o cliente atrasou o pagamento? ");
		inadimplencia = input.nextInt();
		System.out.print("A maioria das compras foi em dinheiro, cart�o, ou boleto (D/C/B)? ");
		formaPagamento = input.next().charAt(0);
		
		input.close();

	}

}
