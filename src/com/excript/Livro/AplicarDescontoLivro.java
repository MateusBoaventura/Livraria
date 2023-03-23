package com.excript.Livro;

public class AplicarDescontoLivro {
	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.nome = "Mistborn";
		livro.descricao = "Uma aventura em uma distopia";
		livro.valor = 30;
		livro.ISBN = "3234-221-33-1";
		System.out.println("Aplicando desconto...");
		
		livro.AplicarDesconto(0.10);
		System.out.println(livro.valor);
	}
}
