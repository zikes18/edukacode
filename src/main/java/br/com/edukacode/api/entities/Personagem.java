package br.com.edukacode.api.entities;

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

}
