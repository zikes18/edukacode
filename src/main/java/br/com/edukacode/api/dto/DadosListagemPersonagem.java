package br.com.edukacode.api.dto;

import br.com.edukacode.api.entities.Personagem;

public record DadosListagemPersonagem(
    String nome,
    String arquetipo,
    String historia,
    String personalidade,
    String motivacoes,
    String aparencia
) {
    public DadosListagemPersonagem(Personagem lead){
        this(lead.getNome(), lead.getArquetipo(), lead.getHistoria(), lead.getPersonalidade(), lead.getMotivacoes(), lead.getAparencia());
    }
    
}
