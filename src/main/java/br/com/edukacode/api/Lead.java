package br.com.edukacode.api;

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

    public Lead(DadosCadastroLead dados){
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
    }
}
