package com.excript.Livro;

public class ComparandoReferencias {
	public static void main(String[] args) {
		Autor autor1 = new Autor();
		autor1.setNome("Mateus");
		autor1.setCpf("000.000.000-12");
		autor1.setEmail("mateus_boaventura@hotmail.com");
		
		Autor autor2 = new Autor();
		autor2.setNome("Mateus");
		autor2.setCpf("000.000.000-12");
		autor2.setEmail("mateus_boaventura@hotmail.com");
		
		if(autor1 == autor2) {
			System.out.println("Iguais!");
		}else {
			System.out.println("Diferentes!");
		}
		
		Livro livro = new Livro();
		livro.setAutor(autor1);
		livro.setNome("Pinguim");
		System.out.println(autor1.getNome());
		System.out.println(livro.getNome());
	}
}
