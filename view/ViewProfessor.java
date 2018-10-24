package view;

import java.util.Scanner;

import controller.ContoleProfessor;
import model.Professor;

public class ViewProfessor {
	
	
	public void tlProfessor() {
		Scanner sc = new Scanner(System.in);
		MenuPrincipal principal = new MenuPrincipal();
		ContoleProfessor cprof = new ContoleProfessor();
		String entrada;
		
		while (true) {
			Professor professor = new Professor(null, null);
			
			System.out.println("					[MENU DE PROFESSOR]\n"
					+ "[C] - Cadastrar Professor"
					+ " [L] - Listar Professor"
					+ " [D] - Deletar Professor "
					+ "[V] - Voltar menu principal\n");
			
			System.out.println("Entrada: ");
			entrada = sc.nextLine().toUpperCase();
			
			
			String c[] = entrada.split(" ");
			
			
				
		switch (c[0]) {
		case "C":
			System.out.println("---Cadastro de Porfessor---");
			System.out.println("Nome: ");
			professor.setNome(sc.nextLine());
			
			System.out.println("Classe: ");
			professor.setClasse(sc.nextLine());
			
			System.out.println("Diaria: ");
			professor.setDiarias(sc.nextInt());
			
			cprof.salvaProfessor(professor);
			break;
		case "L":
			cprof.listarProfessor();
			break;
		case "D":
			System.out.println("Nome do Porfessor: ");
			cprof.deletarProfessorPorNome(sc.nextLine());
			break;
		case "V":
			principal.menu();
			break;
		default:
			break;
		}
		
		}
	}

}
