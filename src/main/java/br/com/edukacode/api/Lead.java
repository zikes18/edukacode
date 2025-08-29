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
}
