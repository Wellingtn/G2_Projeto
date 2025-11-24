package trabalho_g2.model;

public class Veiculo {
    private String placa;
    private String modelo;
    private Motorista motoristaResponsavel;

    public Veiculo(String placa, String modelo, Motorista motoristaResponsavel) {
        this.placa = placa;
        this.modelo = modelo;
        this.motoristaResponsavel = motoristaResponsavel;
    }

    public Motorista getMotoristaResponsavel() {
        return motoristaResponsavel;
    }

    public String getModelo() { return modelo; }
}