package com.excript.Livro;

public class Livro {
	private String nome, descricao, ISBN;
	private double valor;
	private Autor autor;
	
	Livro(){
		System.out.println("Livro criado!");
	}
	
	Livro(String nome){
		this.nome = nome;
	}
	
	Livro(Autor autor) {
		this.autor = autor;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
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
	
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.3) {
			return false;
		}else {
			this.valor -= valor*porcentagem;
			return true;
		}
	}
	
	boolean temAutor() {
		return this.autor != null;
	}
	
}
