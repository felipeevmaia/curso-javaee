package br.com.casadocodigo.loja.beans;

import br.com.casadocodigo.loja.models.Livro;

public class AdminLivrosBean {
	private Livro livro;
	
	public void salvar() {
		System.out.println("Livro :" + livro + " cadastrado com Sucesso!");
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
}
