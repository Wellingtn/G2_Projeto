package trabalho_g2;

import trabalho_g2.enums.TipoInfracao;
import trabalho_g2.infra.ConsoleNotificador;
import trabalho_g2.logic.RegraBrasileiraCNH;
import trabalho_g2.model.Motorista;
import trabalho_g2.model.Veiculo;
import trabalho_g2.service.ProcessadorInfracaoService;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE MULTAS (SOLID) - Trabalho G2 ===\n");

        // 1. Injeção de Dependências
        var regra = new RegraBrasileiraCNH();
        var notificador = new ConsoleNotificador();
        var service = new ProcessadorInfracaoService(regra, notificador);

        // 2. Dados
        var motorista = new Motorista("Wellington Juan", "111222333");
        var veiculo = new Veiculo("IPO-9999", "Fiat Uno", motorista);

        // 3. Execução
        System.out.println("> Multa 1 (Grave):");
        service.registrarInfracao(veiculo, TipoInfracao.GRAVE);

        System.out.println("> Multa 2 (Gravíssima):");
        service.registrarInfracao(veiculo, TipoInfracao.GRAVISSIMA);

        System.out.println("> Multa 3 (Gravíssima - Deve Suspender):");
        service.registrarInfracao(veiculo, TipoInfracao.GRAVISSIMA);
    }
}