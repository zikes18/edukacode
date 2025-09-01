package br.com.edukacode.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroLead(

@NotBlank
String nome, 

@NotBlank
@Email
String email, 

@NotBlank
@Pattern(regexp = "\\d{11,12}")
String telefone) {}
