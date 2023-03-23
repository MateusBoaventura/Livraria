package com.excript.Livro;

public class ComparandoReferencias {
	public static void main(String[] args) {
		Autor autor1 = new Autor();
		autor1.nome = "Mateus";
		autor1.cpf = "000.000.000-12";
		autor1.email = "mateus_boaventura@hotmail.com";
		
		Autor autor2 = new Autor();
		autor2.nome = "Mateus";
		autor2.cpf = "000.000.000-12";
		autor2.email = "mateus_boaventura@hotmail.com";
		
		if(autor1 == autor2) {
			System.out.println("Iguais!");
		}else {
			System.out.println("Diferentes!");
		}
		
		Livro livro = new Livro();
		livro.autor = autor1;
		livro.autor.nome = "Pinguim";
		System.out.println(autor1.nome);
	}
}
