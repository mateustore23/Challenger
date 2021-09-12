package br.com.fiap.challenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.challenge.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	List<Usuario> findByNomeIgnoreCase(String nome);
		
	List<Usuario> findByGato_Codigo(int codigo);
	
}
