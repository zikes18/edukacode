package br.com.edukacode.api;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroGenero(@NotBlank String nome) {

}
