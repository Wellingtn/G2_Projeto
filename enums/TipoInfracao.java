package trabalho_g2.enums;

import trabalho_g2.interfaces.Penalidade;
import java.math.BigDecimal;

public enum TipoInfracao implements Penalidade {
    LEVE(3, new BigDecimal("88.30")),
    MEDIA(4, new BigDecimal("130.16")),
    GRAVE(5, new BigDecimal("195.23")),
    GRAVISSIMA(7, new BigDecimal("293.47"));

    private final int pontos;
    private final BigDecimal valor;

    TipoInfracao(int pontos, BigDecimal valor) {
        this.pontos = pontos;
        this.valor = valor;
    }

    @Override
    public int getPontos() { return pontos; }

    @Override
    public BigDecimal getValor() { return valor; }
}