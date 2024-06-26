package br.com.fiap.pizzaria.domain.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record OpcionalRequest(
       Long id,

        String nome,

        @Valid
        AbstractRequest sabor,

        @Positive(message = "O preço não pode ser negativo!")
        BigDecimal preco
) {
}
