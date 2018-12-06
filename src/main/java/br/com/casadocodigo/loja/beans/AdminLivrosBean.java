package br.com.casadocodigo.loja.beans;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.casadocodigo.loja.daos.AutorDao;
import br.com.casadocodigo.loja.daos.LivroDao;
import br.com.casadocodigo.loja.models.Autor;
import br.com.casadocodigo.loja.models.Livro;

@Named
@RequestScoped
public class AdminLivrosBean {
	private Livro livro = new Livro();
	
	@Inject
	private LivroDao dao;
	
	@Inject
	private AutorDao autorDao;
	
	private List<Integer> autoresId = new ArrayList<>();
	
	public List<Integer> getAutoresId() {
		return autoresId;
	}

	public void setAutoresId(List<Integer> autoresId) {
		this.autoresId = autoresId;
	}

	public void salvar() {
		for (Integer id : autoresId) {
			livro.getAutores().add(new Autor(id));
		}
		dao.salvar(livro);
		System.out.println("Livro :" + livro + " cadastrado com Sucesso!");
	}

	public List<Autor> getAutores(){
		return autorDao.getLista();
	}
	
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
}
