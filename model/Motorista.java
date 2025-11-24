package trabalho_g2.model;

public class Motorista {
    private String nome;
    private String cnh;
    private int pontosAcumulados;

    public Motorista(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
        this.pontosAcumulados = 0;
    }

    public void adicionarPontos(int pontos) {
        if (pontos < 0) throw new IllegalArgumentException("Pontos não podem ser negativos");
        this.pontosAcumulados += pontos;
    }

    public String getNome() { return nome; }
    public int getPontosAcumulados() { return pontosAcumulados; }
}