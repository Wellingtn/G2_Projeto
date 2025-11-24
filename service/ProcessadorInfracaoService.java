package trabalho_g2.service;

import trabalho_g2.interfaces.AnaliseSituacaoCNH;
import trabalho_g2.interfaces.Notificador;
import trabalho_g2.interfaces.Penalidade;
import trabalho_g2.model.Veiculo;

public class ProcessadorInfracaoService {

    private final AnaliseSituacaoCNH regraCNH;
    private final Notificador notificador;

    public ProcessadorInfracaoService(AnaliseSituacaoCNH regraCNH, Notificador notificador) {
        this.regraCNH = regraCNH;
        this.notificador = notificador;
    }

    public void registrarInfracao(Veiculo veiculo, Penalidade infracao) {
        var motorista = veiculo.getMotoristaResponsavel();
        motorista.adicionarPontos(infracao.getPontos());

        String novaSituacao = regraCNH.analisarSituacao(motorista);

        String mensagem = String.format(
                """
                --- NOVA INFRAÇÃO REGISTRADA ---
                Veículo: %s
                Motorista: %s
                Multa: R$ %s (+%d pontos)
                Status Atual da CNH: %s
                --------------------------------
                """,
                veiculo.getModelo(),
                motorista.getNome(),
                infracao.getValor(),
                infracao.getPontos(),
                novaSituacao
        );

        notificador.notificar(mensagem);
    }
}