package trabalho_g2.logic;

import trabalho_g2.interfaces.AnaliseSituacaoCNH;
import trabalho_g2.model.Motorista;

public class RegraBrasileiraCNH implements AnaliseSituacaoCNH {
    @Override
    public String analisarSituacao(Motorista motorista) {
        int pontos = motorista.getPontosAcumulados();

        if (pontos >= 20) return "CNH SUSPENSA";
        if (pontos >= 10) return "EM RISCO";
        return "REGULAR";
    }
}