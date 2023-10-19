public class Serpente {
    private String cor;
    private double tamanho;

    public void trocarPele() {
        System.out.println("A serpente está trocando de pele.");
    }

    public void rastejar() {
        System.out.println("A serpente está rastejando.");
    }

    // Getters e Setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}