package com.empresa.gerenciador;

class Carro extends Veiculo implements Manutencao {
	private int numeroPortas;
	
	public Carro(String placa, int ano, int numeroPortas) {
		super(placa, ano);
		this.numeroPortas = numeroPortas;
	}
	
	@Override
	public double calcularValorSeguro() {
		return 500 + (numeroPortas * 50);
	}
	
	@Override
	public String realizarManutencao() {
		return "Manutenção realizada no carro de placa: " + getPlaca();
	}
	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Número de portas: " + numeroPortas);
	}
}
