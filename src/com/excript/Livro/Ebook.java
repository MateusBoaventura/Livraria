package com.excript.Livro;

public class Ebook extends Livro{
	private String waterMark;
	
	public String getwaterMark() {
		return waterMark;
	}
	
	public void setWaterMarker(String waterMark) {
		this.waterMark = waterMark;
	}
	
	public Ebook() {
		super();
		System.out.println("Ebook criado!");
	}
	
	public Ebook(Autor autor) {
		super(autor);
	}
	
	@Override
	public boolean AplicarDescontoDe(double porcentagem) {
		if(porcentagem > 0.15 || porcentagem < 0) {
			return false;
		}else {
			this.setValor(this.getValor() - (this.getValor() * porcentagem));
			return true;
		}
	}
}
