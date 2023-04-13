package com.excript.Livro;

public class RegistroDeVendas {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("William Willians");
		
		LivroFisico livro = new LivroFisico(autor);
		livro.setNome("Loucurinha Vegana");
		livro.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Java Construcao");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicional(livro);
		carrinho.adicional(ebook);
		
		System.out.println("Total: " + carrinho.getTotal());
	}
}
