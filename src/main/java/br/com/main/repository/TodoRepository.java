package br.com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.main.model.Todo;

/**
 * @author Welton Araujo
 * Entidade: Todo
 * Tipo do ID: Long
 */
public interface TodoRepository extends JpaRepository<Todo, Long> {}
