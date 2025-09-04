package br.com.edukacode.api.controller;

import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.edukacode.api.dto.DadosAtualizacaoGenero;
import br.com.edukacode.api.dto.DadosAtualizacaoLead;
import br.com.edukacode.api.dto.DadosCadastroGenero;
import br.com.edukacode.api.dto.DadosListagemGenero;
import br.com.edukacode.api.entities.Genero;
import br.com.edukacode.api.repository.GeneroRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@Transactional
@RequestMapping("/generos")
public class GeneroController {
    @Autowired
    private GeneroRepository repository;

    @PostMapping
    public String criarGenero(@RequestBody @Valid DadosCadastroGenero dados) {
        System.out.println("Gênero criado com os dados: " + dados);
        repository.save(new Genero(null,dados.nome()));
        return "Gênero criado com sucesso!";

    }

    @GetMapping
    public Page<DadosListagemGenero> listarGeneros(@PageableDefault (size = 5,sort = {"nome"})Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemGenero::new);
    }

     @PutMapping
    public String atualizarLead(@RequestBody DadosAtualizacaoGenero dados) {
        var lead = repository.getReferenceById(dados.id());
        lead.atualizarGen(dados);
        return "Gênero atualizado com sucesso!";
    }

    @DeleteMapping
    public void excluirLead() {
        // Implementação do método para excluir um lead
    }

}
