package br.com.edukacode.api.entities;

import br.com.edukacode.api.dto.DadosAtualizacaoLead;
import br.com.edukacode.api.dto.DadosCadastroLead;
import jakarta.persistence.*;
import lombok.*;


@Table(name="tblead")
@Entity(name="Lead")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Lead {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;

    public Lead(DadosCadastroLead dados){
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.cpf = dados.cpf();
    }

    public void atualizarInformacoes(DadosAtualizacaoLead dados){
        if (dados.nome() !=null) {
            this.nome = dados.nome();
        }
        if (dados.telefone() !=null) {
            this.telefone = dados.telefone();
        }
        if (dados.email() !=null) {
            this.email = dados.email();
        }
        if (dados.cpf() !=null) {
            this.cpf = dados.cpf();
        }
    }
}
