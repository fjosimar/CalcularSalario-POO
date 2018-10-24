package view;

import java.util.Scanner;

public class MenuPrincipal {
	
	ViewProfessor viewProfessor = new ViewProfessor();
	ViewSTA viewSTA = new ViewSTA();
	ViewTerceirizado viewTerceirizado = new ViewTerceirizado();
	
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		
		int entrada;
			System.out.println("			[MENU PRINCIPAL]\n"
					+ "		[1] - Cadastro de Professor\n"
					+ "		[2] - Cadastro de STA\n"
					+ "		[3] - Cadastro de Terceirizado \n");
			
			System.out.println("Entrada: "); 
			entrada = sc.nextInt();
				
		switch (entrada) {
		case 1:
			viewProfessor.tlProfessor();
			break;
		case 2:
			viewSTA.tlSTA();
			break;
		case 3:
			viewTerceirizado.tlTerceirizado();
			break;
		default:
			break;
		}
		}
		
	
	

}
