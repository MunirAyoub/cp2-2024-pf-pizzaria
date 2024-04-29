package br.com.fiap.pizzaria.domain.dto.request;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProdutoRequest(
        @NotNull(message = "Não pode ser nulo, o nome!")
        String nome,
        @NotNull(message = "Não pode ser nulo!")
        AbstractRequest sabor,
        BigDecimal preco
) {
}
