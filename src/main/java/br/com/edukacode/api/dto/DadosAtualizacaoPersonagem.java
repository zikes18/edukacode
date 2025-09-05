package br.com.edukacode.api.dto;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPersonagem(
    @NotNull
    Long id,
    String nome,
    String arquetipo,
    String historia,
    String personalidade,
    String motivacoes,
    String aparencia
) {

}
