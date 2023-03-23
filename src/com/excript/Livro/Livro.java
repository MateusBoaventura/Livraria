package com.excript.Livro;

public class Livro {
	String nome, descricao, ISBN;
	double valor;
	Autor autor;
	
	Livro(){
		System.out.println("Livro criado!");
	}
	
	Livro(String nome){
		this.nome = nome;
	}
	
	void impressaoDados() {
		System.out.println("Nome: "+nome);
		System.out.println("Descricao: "+descricao);
		System.out.println("Valor: "+valor);
		System.out.println("ISBN: "+ISBN);
		if(this.temAutor()) {
		autor.impressaoDadosAutor();
		}
	}
	
	public double AplicarDesconto(double porcentagem) {
		this.valor -= valor*porcentagem;
		return valor;
	}
	
	boolean temAutor() {
		return this.autor != null;
	}
	
}
