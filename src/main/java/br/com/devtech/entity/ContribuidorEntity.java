package br.com.devtech.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(
        name = "CONTRIBUIDOR", //define o nome da tabela.
        uniqueConstraints = {
            @UniqueConstraint(name = "UK_EMAIL", columnNames = "email"), //garante que os campos sejam únicos, não podem se repetir na tabela.
            @UniqueConstraint(name = "UK_LINKGITHUB", columnNames = "link_github")
        }
)
@Getter
@Setter
@ToString
public class ContribuidorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, name = "nome", length = 150)
    private String nome;

    @Column(nullable = false,name = "email", length = 150)
    private String email;

    @Column(nullable = false, name = "link_github", length = 150)
    private String linkGithub;

}