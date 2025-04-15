package br.com.devtech.dtos;

public record ContribuidorDTO(
        Long id,
        String nome,
        String email,
        String githubLink
){// Record's é que é uma forma concisa, imutável e transparente de declarar classes onde acima automaticamente cria: "private final"
}
