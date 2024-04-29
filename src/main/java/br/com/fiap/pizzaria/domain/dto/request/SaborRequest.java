package br.com.fiap.pizzaria.domain.dto.request;

import jakarta.validation.constraints.NotNull;

public record SaborRequest(
        String descricao,
        @NotNull(message = "Não pode ser nulo, o sabor!")
        String nome
) {

}
