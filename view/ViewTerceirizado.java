package view;

import java.util.Scanner;

import controller.ContoleTerceirizado;
import model.Terceirizado;

public class ViewTerceirizado {
	
	public void tlTerceirizado() {
		Scanner sc = new Scanner(System.in);
		MenuPrincipal menu = new MenuPrincipal();
		ContoleTerceirizado cTerceirizado = new ContoleTerceirizado();
		String entrada;
		
		while (true) {
			System.out.println("					[MENU DE TERCEIRIZADO]\n"
					+ "[C] - Cadastrar Terceirizado"
					+ " [L] - Listar Terceirizado"
					+ " [D] - Deletar Terceirizado "
					+ "[V] - Voltar menu principal\n");
			
			Terceirizado terceirizado = new Terceirizado(null, 0, false);
			
			System.out.println("Entrada: ");
			entrada = sc.nextLine().toUpperCase();
			
			
			String c[] = entrada.split(" ");
				
		switch (c[0]) {
		case "C":
			System.out.println("---Castro de Terceirizado---");
			System.out.println("Nome: ");
			terceirizado.setNome(sc.nextLine());
			
			System.out.println("Horas Trabalhadas: ");
			terceirizado.setHorasTrabalhadas(sc.nextInt());
			
			System.out.println("Diaria: ");
			terceirizado.setDiarias(sc.nextInt());
			System.out.println("Insalubre?: ");
			terceirizado.setInsalubre(sc.nextBoolean());
			
			cTerceirizado.salvaTerceirizado(terceirizado);
			break;
		case "L":
			cTerceirizado.listarTerceirizado();
			break;
		case "D":
			System.out.println("Nome do Terceirizado");
			cTerceirizado.deletarTerceirizadoPorNome(sc.nextLine());
			break;
		case "V":
			menu.menu();
			break;
		default:
			System.out.println("");
			break;
		}
		}
	}

}
