package com.excript.Livro;

public class LivroFisico extends Livro {
	
	public LivroFisico() {
		super();
	}
	
	public LivroFisico(Autor autor) {
		super(autor);
	}
	
	public double getTaxaImpressao() {
		return this.getValor() * 0.05;
	}
}
