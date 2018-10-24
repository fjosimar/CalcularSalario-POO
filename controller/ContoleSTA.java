package controller;

import model.STA;

import java.util.ArrayList;
import java.util.List;

public class ContoleSTA {

	List<STA> listaSTA = new ArrayList<STA>();

	public void salvaSTA(STA sta) {

		try {

			listaSTA.add(sta);
			System.out.println("STA salvo com sucesso");

		} catch (Exception e) {
			System.out.println("Não foi possivel salvar");

		}

	}

	public void listarSTA() {
		int i = 0;
		for (STA sta : listaSTA) {
			System.out.println(sta);
			i++;
		}

	}

	public void deletarSTAPorNome(String nome) {

		for (int i = 0; i < listaSTA.size(); i++) {
			if (listaSTA.get(i).getNome().equals(nome)) {
				listaSTA.remove(i);
				System.out.println("STA removido com Sucesso");
			}
		}

	}

}
