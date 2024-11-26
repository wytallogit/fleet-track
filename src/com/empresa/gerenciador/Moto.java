package com.empresa.gerenciador;

public class Moto extends Veiculo implements Manutencao {
	private int cilindrada;
	
	public Moto(String placa, int ano, int cilidrada) {
		super(placa, ano);
		this.cilindrada = cilindrada;
	}
	
	@Override
	public double calcularValorSeguro() {
		return 300 + (cilindrada * 0.1);
	}
	
	@Override
	public String realizarManutencao() {
		return "Manutenção realizada na moto de placa: " + getPlaca();
	}
	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Cilindrada: " + cilindrada);
	}
}
