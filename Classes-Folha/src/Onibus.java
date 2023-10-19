public class Onibus {
    private int numeroIdentificacao;
    private int capacidadePassageiros;

    public void transportarPassageiros() {
        System.out.println("Transportando passageiros.");
    }

    // Getters e Setters
    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(int numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }
}