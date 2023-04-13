package com.excript.Livro;

public class CadastroDeLivros {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Lewis Carrol");
		autor.setEmail("lewiscarrol@gmail.com");
		autor.setCpf("492.294.394-92");
		
		Livro livro = new Livro();
		livro.setNome("Alice no País das Maravilhas");
		livro.setDescricao("Um livro sobre drogas");
		livro.setValor(19.99);
		livro.setISBN("342-65-3489-47-1");
		livro.setAutor(autor);
		livro.impressaoDados();
		
		System.out.println("");
		
		Autor autor2 = new Autor();
		autor2.setNome("Jonathan Swift");
		autor2.setEmail("jonathanswift@gmail.com");
		autor2.setCpf("503.090.112-90");
		
		Livro livro2 = new Livro("Mateus");
		livro2.setNome("As Viagens de Gulliver");
		livro2.setDescricao("Um livro sobre um gigante");
		livro2.setValor(19.99);
		livro2.setISBN("656-76-4567-32-2");
		livro2.setAutor(autor2);
		livro2.impressaoDados();
		
	}
}
