package controller;

import model.Professor;
import java.util.ArrayList;
import java.util.List;

public class ContoleProfessor {

	List<Professor> listaProfessor = new ArrayList<Professor>();

	public void salvaProfessor(Professor professor) {

		try {

			listaProfessor.add(professor);
			System.out.println("Professor salvo com sucesso");

		} catch (Exception e) {
			System.out.println("Não foi possivel salvar");

		}

	}

	public void listarProfessor() {
		int i = 0;
		for (Professor professor : listaProfessor) {
			System.out.println(professor);
			i++;
		}

	}

	public void deletarProfessorPorNome(String nome) {

		for (int i = 0; i < listaProfessor.size(); i++) {
			if (listaProfessor.get(i).getNome().equals(nome)) {
				listaProfessor.remove(i);
				System.out.println("Professor removido com Sucesso");
			}
		}

	}

}
