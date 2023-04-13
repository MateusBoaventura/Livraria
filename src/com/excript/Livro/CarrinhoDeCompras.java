package com.excript.Livro;

public class CarrinhoDeCompras {
	private double total;
	
	public void adicional(Livro livro) {
		livro.aplicaDescontoDe(0.05);
		total += livro.getValor();
	}
	
	public double getTotal() {
		return total;
	}
}
