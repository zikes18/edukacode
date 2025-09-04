package br.com.edukacode.api.dto;

import br.com.edukacode.api.entities.Genero;

public record DadosListagemGenero(String nome) {
    public DadosListagemGenero(Genero genero) {
        this(genero.getNome());
    }
}
