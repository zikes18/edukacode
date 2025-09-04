package br.com.edukacode.api.entities;

import br.com.edukacode.api.dto.DadosAtualizacaoGenero;
import br.com.edukacode.api.dto.DadosAtualizacaoLead;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name="genero")
@Entity(name="Genero")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Genero {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public void atualizarGen(DadosAtualizacaoGenero dados){
        if (dados.nome() !=null) {
            this.nome = dados.nome();
        }
    }
}
