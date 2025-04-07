package br.com.devtech.dtos.response;

public record SitesResponseDTO(
        Long id,
        String titulo,
        String descricao,
        String linkSite
) {}
