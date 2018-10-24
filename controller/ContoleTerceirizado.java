package controller;

import java.util.ArrayList;
import java.util.List;

import model.Terceirizado;

public class ContoleTerceirizado {

	List<Terceirizado> listaTerceirizado = new ArrayList<Terceirizado>();

	public void salvaTerceirizado(Terceirizado terceirizado) {

		try {

			listaTerceirizado.add(terceirizado);
			System.out.println("Terceirizado salvo com sucesso");

		} catch (Exception e) {
			System.out.println("Não foi possivel salvar");
		}

	}

	public void listarTerceirizado() {
		int i = 0;
		for (Terceirizado terceirizado : listaTerceirizado) {
			System.out.println(terceirizado);
			i++;
		}

	}

	public void deletarTerceirizadoPorNome(String nome) {

		for (int i = 0; i < listaTerceirizado.size(); i++) {
			if (listaTerceirizado.get(i).getNome().equals(nome)) {
				listaTerceirizado.remove(i);
				System.out.println("Terceirizado removido com Sucesso");
			}
		}

	}

}
