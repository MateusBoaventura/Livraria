package com.excript.Livro;

public class CadastroDeLivros {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.nome = "Lewis Carrol";
		autor.email = "lewiscarrol@gmail.com";
		autor.cpf = "492.294.394-92";
		
		Livro livro = new Livro();
		livro.nome = "Alice no País das Maravilhas";
		livro.descricao = "Um livro sobre drogas";
		livro.valor = 19.99;
		livro.ISBN = "342-65-3489-47-1";
		livro.autor = autor;
		livro.existeAutor();
		livro.impressaoDados();
		
		System.out.println("");
		
		Autor autor2 = new Autor();
		autor2.nome = "Jonathan Swift";
		autor2.email = "jonathanswift@gmail.com";
		autor2.cpf = "503.090.112-90";
		
		Livro livro2 = new Livro();
		livro2.nome = "As Viagens de Gulliver";
		livro2.descricao = "Um livro sobre um gigante";
		livro2.valor = 19.99;
		livro2.ISBN = "656-76-4567-32-2";
		livro2.autor = autor2;
		livro2.existeAutor();
		livro2.impressaoDados();
		
	}
}
