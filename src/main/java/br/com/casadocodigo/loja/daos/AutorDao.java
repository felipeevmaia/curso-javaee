package br.com.casadocodigo.loja.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.casadocodigo.loja.models.Autor;

public class AutorDao {

	@PersistenceContext
	EntityManager eManager;
	
	
	public List<Autor> getLista(){
		return eManager.createQuery("select * from Autor a", Autor.class).getResultList();
	}
}
