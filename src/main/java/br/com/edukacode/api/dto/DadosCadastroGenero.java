package br.com.edukacode.api.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroGenero(@NotBlank String nome) {

}
