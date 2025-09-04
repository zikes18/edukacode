package br.com.edukacode.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edukacode.api.entities.Personagem;

public interface PersonagemRepository extends JpaRepository <Personagem, Long>{

}
