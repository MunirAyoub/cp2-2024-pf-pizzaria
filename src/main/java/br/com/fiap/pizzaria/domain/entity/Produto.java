package br.com.fiap.pizzaria.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "TB_CARDAPIO")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CARDAPIO")
    @SequenceGenerator(
            name = "SQ_CARDAPIO",
            sequenceName = "SQ_CARDAPIO",
            allocationSize = 1
    )
    @Column(name = "ID_CARDAPIO")
    private Long id;

    @Column(name = "NM_CARDAPIO")
    private String nome;

    @ManyToMany
    @JoinColumn(
            name = "SABOR",
            referencedColumnName = "ID_SABOR",
            foreignKey = @ForeignKey(name = "FK_SABOR_PRODUTO")
    )
    private Sabor sabor;

    @Column(name = "PRECO_CARDAPIO")
    private BigDecimal preco;

    @JoinTable(
            name = "TB_PRODUTO_OPCIONAL",
            joinColumns = {
                    @JoinColumn(
                            name = "PRODUTO",
                            referencedColumnName = "ID_PRODUTO",
                            foreignKey = @ForeignKey(name = "FK_PRODUTO_OPCIONAL")
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "OPCIONAL",
                            referencedColumnName = "ID_OPCIONAL",
                            foreignKey = @ForeignKey(name = "FK_OPCIONAL_PRODUTO")
                    )
            }
    )
    private Set<Opcional> opcionais = new LinkedHashSet<>();
}
