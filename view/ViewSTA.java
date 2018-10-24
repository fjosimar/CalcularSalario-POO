package view;

import java.util.Scanner;

import controller.ContoleSTA;
import model.STA;

public class ViewSTA {
	
	public void tlSTA() {
		Scanner sc = new Scanner(System.in);
		MenuPrincipal menu = new MenuPrincipal();
		ContoleSTA cSTA = new ContoleSTA();
		String entrada;
		
		while (true) {
			STA sta = new STA(null, 0);
			
			
			System.out.println("					[MENU DE STA]\n"
					+ "[C] - Cadastrar STA"
					+ " [L] - Listar STA"
					+ " [D] - Deletar STA "
					+ "[V] - Voltar menu principal\n");
			
			System.out.println("Entrada: ");
			entrada = sc.nextLine().toUpperCase();
			
			
			String c[] = entrada.split(" ");
				
		switch (c[0]) {
		case "C":
			System.out.println("---Castro de STA---");
			System.out.println("Nome: ");
			sta.setNome(sc.nextLine());
			
			System.out.println("Nivel: ");
			sta.setNivel(sc.nextInt());
			
			System.out.println("Diaria: ");
			sta.setDiarias(sc.nextInt());
			
			cSTA.salvaSTA(sta);
			break;
		case "L":
			cSTA.listarSTA();
			break;
		case "D":
			System.out.println("Nome do STA");
			cSTA.deletarSTAPorNome(sc.nextLine());
			break;
		case "V":
			menu.menu();
			break;
		default:
			break;
		}
		}
	}

}
