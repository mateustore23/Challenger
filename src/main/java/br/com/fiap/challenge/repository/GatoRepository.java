package br.com.fiap.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.challenge.model.Gato;

public interface GatoRepository extends JpaRepository<Gato, Integer>{

}
