package desafio;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppEnvioBrinde {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Transportadora BoaDex = new Transportadora(10, 0.05, "BoaDex");
		Transportadora BoaLog = new Transportadora(4.30, 0.12, "BoaLog");
		Transportadora TransBoa5 = new Transportadora(2.10, 1.10, "TransBoa5");
		Transportadora TransBoa5up = new Transportadora(10, 0.01, "TransBoa5up");
		
		List<Brinde> listBrinde = new ArrayList<>();

		System.out.println("Digite 1 para calcular frete / Digite 2 para sair do sistema: ");
		int menu = entrada.nextInt();

		switch (menu) {
			case 1:
				System.out.println("Informe o nome do brinde: ");
				entrada.nextLine();
				String nome = entrada.nextLine();
				System.out.println("Informe o peso do brinde: ");
				int peso = entrada.nextInt();
				System.out.println("Informe a distância para envio:");
				int distancia = entrada.nextInt();

				Brinde brinde = new Brinde(nome, peso, distancia);
			
				listBrinde.add(brinde);
								
					if(peso > 5) {
						System.out.println("----Informações do Brinde----" + "\nNome: " + nome + "\nPeso: " + peso + "\nDistância: " + distancia);
						System.out.println("----Informações do Frete----");
						System.out.println("Transportadora " + BoaDex.getNome() + " - custo de R$ " + BoaDex.calculaFrete(distancia, peso));
						System.out.println("Transportadora " + BoaLog.getNome() + " - custo de R$ " + BoaLog.calculaFrete(distancia, peso));
						System.out.println("Transportadora " + TransBoa5up.getNome() + " - custo de R$ " + TransBoa5up.calculaFrete(distancia, peso));
					}else {
						System.out.println("----Informações do Brinde----" + "\nNome: " + nome + "\nPeso: " + peso + "\nDistância: " + distancia);
						System.out.println("----Informações do Frete----");
						System.out.println("Transportadora " + BoaDex.getNome() + " - custo de R$ " + BoaDex.calculaFrete(distancia, peso));
						System.out.println("Transportadora " + BoaLog.getNome() + " - custo de R$ " + BoaLog.calculaFrete(distancia, peso));
						System.out.println("Transportadora " + TransBoa5.getNome() + " - custo de R$ " + TransBoa5.calculaFrete(distancia, peso));
					}
								
			case 2:
				System.out.println("\nSaindo do sistema.");

				break;
			default:
				System.out.println("Opção de Menu Inválida!");
				
		}
		entrada.close();

	}

}

