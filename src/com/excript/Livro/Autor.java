package com.excript.Livro;

public class Autor {
	private String nome, email, cpf;
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	void impressaoDadosAutor() {
		System.out.println("Nome Autor: "+nome);
		System.out.println("Email: "+email);
		System.out.println("CPF: "+cpf);
	}
}
