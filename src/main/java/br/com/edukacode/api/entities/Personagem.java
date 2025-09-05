package br.com.edukacode.api.entities;

import br.com.edukacode.api.dto.DadosAtualizacaoPersonagem;
import jakarta.persistence.*;
import lombok.*;

@Table(name="personagem")
@Entity(name="Personagem")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Personagem {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String arquetipo;
    @Column(columnDefinition = "TEXT")
    private String historia;
    private String personalidade;
    private String motivacoes;
    @Column(columnDefinition = "TEXT")
    private String aparencia;


    public void atualizarInformacoes(DadosAtualizacaoPersonagem dados){
        if (dados.nome() !=null) {
            this.nome = dados.nome();
        }
        if (dados.arquetipo() !=null) {
            this.arquetipo = dados.arquetipo();
        }
        if (dados.historia() !=null) {
            this.historia = dados.historia();
        }
        if (dados.personalidade() !=null) {
            this.personalidade = dados.personalidade();
        }
        if (dados.motivacoes() !=null) {
            this.motivacoes = dados.motivacoes();
        }
        if (dados.aparencia() !=null) {
            this.aparencia = dados.aparencia();
        }
    }
}
