package br.com.devtech.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(
        name = "SITES",
        uniqueConstraints = {
                @UniqueConstraint(name = "UK_LINKSITE", columnNames = "linkSite")
        }
)
@Getter
@Setter
@ToString
public class SitesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, name= "titulo", length = 150)
    private String titulo;

    @Column(nullable = false, name= "descricao")
    private String descricao;

    @Column(nullable = false, name= "linkSite")
    private String linkSite;

    @Column(nullable = false, name= "stack" )
    private String stack;

    @ManyToOne
    @Column(nullable = false, name= "contribuidor_id")
    private ContribuidorEntity contribuidor ;
}
