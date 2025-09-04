package br.com.edukacode.api.dto;

import br.com.edukacode.api.entities.Lead;

public record DadosListagemLead(
    Long id,
    String nome,
    String email,
    String telefone,
    String cpf
) {
        public DadosListagemLead(Lead lead) {
            this(lead.getId(),lead.getNome(), lead.getEmail(), lead.getTelefone(), lead.getCpf());
        }
}
