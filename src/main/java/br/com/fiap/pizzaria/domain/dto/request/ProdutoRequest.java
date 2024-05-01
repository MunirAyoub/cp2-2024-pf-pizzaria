package br.com.fiap.pizzaria.domain.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record ProdutoRequest(

        @NotNull(message = "Não pode ser nulo!")
        AbstractRequest sabor,

        @Valid
        @NotNull(message = "Não pode ser nulo, o nome!")
        String nome,


        @Positive(message = "o preço não pode ser negativo!")
        @NotNull(message = "o preço não pode ser nulo!")
        BigDecimal preco
) {
}
