package com.excript.Livro;

public class AplicarDescontoLivro {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Maria");
		
		Livro livro = new Livro();
		livro.setNome("O tamandua de Ribeirao Preto");
		livro.setValor(29.90);
		
		Ebook ebook = new Ebook();
		ebook.setNome("As caspas de Joana");
		ebook.setValor(39.90);
		
		livro.aplicaDescontoDe(0.3);
		ebook.aplicaDescontoDe(0.10);
		
		System.out.println(livro.getValor());
		System.out.println(ebook.getValor());
		
	}
}