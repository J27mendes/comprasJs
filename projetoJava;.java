package Fundamentos;

import java.util.Scanner;

public class teste {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println
		("\nInforme abaixo as caracteristicas da Promoção!\n");
		System.out.println
		("\nDigite a quantidade que você vai comprar.\n");
			int QuantidadeCompra = entrada.nextInt();
			
		System.out.println
		("\nDigite a quantidade que você vai levar.\n");
			int QuantidadeQueLevo = entrada.nextInt();
		
		System.out.println
		("\nInforme a quantidade unitaria de itens do pacote\n");
			int QuantidadePacote = entrada.nextInt();
			
		System.out.println
		("\nInforme agora, o valor do Pacote\n");
			double ValorPacote = entrada.nextDouble();
			
		
			int QtdUnidadeLevarei = QuantidadeQueLevo * QuantidadePacote;
			double ValorUndNormal = ValorPacote / QuantidadePacote;
			double ValorPago = ValorPacote * QuantidadeCompra;
			double ValorUndPago = ValorPago / QtdUnidadeLevarei;
			double PacoteComDesconto = ValorUndPago * QuantidadePacote;
			double EconomiaPorUnd = ValorUndNormal - ValorUndPago;
			double EconomiaPorPacote = ValorPacote - PacoteComDesconto;
			
			
			System.out.println
			("Economia por unidade é: " + EconomiaPorUnd);
			System.out.println
			("Economia por pacote é: " + EconomiaPorPacote);
			System.out.printf
			("O valor final do pacote é R$%.2f: \n",(ValorPacote - EconomiaPorPacote));
			
			entrada.close();
	}

}
 