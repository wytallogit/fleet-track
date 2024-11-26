package com.empresa.gerenciador;

abstract class Veiculo {
	private String placa;
	private int ano;
	
	public Veiculo(String placa, int ano) {
		this.placa = placa;
		this.ano = ano;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void exibirDetalhes() {
		System.out.println("Placa: " + ", Ano " + ano);
	}
	
	public abstract double calcularValorSeguro();
}
