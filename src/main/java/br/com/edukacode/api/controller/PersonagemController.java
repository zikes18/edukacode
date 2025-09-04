package br.com.edukacode.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.edukacode.api.dto.CadastroPersonagem;
import br.com.edukacode.api.dto.DadosListagemPersonagem;
import br.com.edukacode.api.entities.Personagem;
import br.com.edukacode.api.repository.PersonagemRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@Transactional
@RequestMapping("/personagem")

public class PersonagemController {
    @Autowired
    private PersonagemRepository repository;

    @PostMapping
    public String criarPersonagem(@RequestBody @Valid CadastroPersonagem dados){
        System.out.println("Personagem criado valeu: " + dados);
        repository.save(new Personagem(null,dados.nome(),dados.arquetipo(),dados.historia(),dados.personalidade(),dados.motivacoes(),dados.aparencia()));
        return "Personagem criado com sucesso";
    }

    @GetMapping
    public Page<DadosListagemPersonagem> listarPersonagens(@PageableDefault (size = 15,sort = {"nome"})Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemPersonagem::new);

    }

}
