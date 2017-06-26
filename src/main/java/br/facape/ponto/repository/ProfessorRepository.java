package br.facape.ponto.repository;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.facape.ponto.model.Professor;

public class ProfessorRepository extends AbstractRepository<Professor, Long>{

	public ProfessorRepository() {
		super(Professor.class);
	}

	private static final long serialVersionUID = 8126692666104013486L;
	
	
	public Professor autenticar(String login, String senha) {
		try {
			TypedQuery<Professor> query = entityManager.createQuery("FROM Professor p WHERE p.login = :login and p.senha = :senha ", Professor.class);
			query.setParameter("login", login);
			query.setParameter("senha", senha);
			return query.getSingleResult();	
		} catch (NoResultException e) {
			
		}
		return null;
	}
	
}
