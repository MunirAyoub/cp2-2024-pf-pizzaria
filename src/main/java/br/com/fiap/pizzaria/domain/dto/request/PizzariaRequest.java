package br.com.fiap.pizzaria.domain.dto.request;

import jakarta.validation.constraints.NotNull;

public record PizzariaRequest(
        @NotNull(message = "O nome não pode ser null")
        String nome
) {
}

