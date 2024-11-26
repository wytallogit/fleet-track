package com.empresa.gerenciador;

import java.util.ArrayList;

public class GerenciadorVeiculos {

	public static void main(String[] args) {
		ArrayList<Veiculo> frota = new ArrayList<>();
		
		frota.add(new Carro("KDS4930", 2020, 4));
		frota.add(new Moto("CTS0302", 2022, 160));
		
		for (Veiculo veiculo : frota) {
			veiculo.exibirDetalhes();
			System.out.println("Valor do Seguro: R$ " + veiculo.calcularValorSeguro());
			if (veiculo instanceof Manutencao) {
				Manutencao manutencao = (Manutencao) veiculo;
				System.out.println(manutencao.realizarManutencao());
			}
			System.out.println();
		}
		
	}

}
