package br.com.edukacode.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edukacode.api.entities.Lead;

public interface LeadRepository extends JpaRepository <Lead, Long>{

}
