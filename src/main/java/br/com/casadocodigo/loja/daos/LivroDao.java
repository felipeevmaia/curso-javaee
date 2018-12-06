package br.com.casadocodigo.loja.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import br.com.casadocodigo.loja.models.Livro;

public class LivroDao {

	@PersistenceContext
	EntityManager eManager;
	
	@Transactional
	public void salvar(Livro livro) {
		eManager.persist(livro);
	}
}
