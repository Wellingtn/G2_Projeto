package trabalho_g2.infra;
import trabalho_g2.interfaces.Notificador;

public class ConsoleNotificador implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println(mensagem);
    }
}