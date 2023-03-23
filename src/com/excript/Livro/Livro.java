package com.excript.Livro;

public class Livro {
	String nome, descricao, ISBN;
	double valor;
	Autor autor;
	
	void impressaoDados() {
		System.out.println("Nome: "+nome);
		System.out.println("Descricao: "+descricao);
		System.out.println("Valor: "+valor);
		System.out.println("ISBN: "+ISBN);
		autor.impressaoDadosAutor();
	}
	
	public boolean existeAutor() {
		if(autor != null) {
			System.out.println("O autor existe!");
		return true;
		}else {
			System.out.println("O autor nao existe!");
			return false;
		}
	}
	
}
