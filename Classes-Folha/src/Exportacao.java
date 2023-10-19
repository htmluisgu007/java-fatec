public class Exportacao {
    private String transacao;
    private String produto;

    public void venda() {
        System.out.println("Iniciando processo de venda.");
    }

    public void exportar() {
        System.out.println("Exportando produtos.");
    }

    // Getters e Setters
    public String getTransacao() {
        return transacao;
    }

    public void setTransacao(String transacao) {
        this.transacao = transacao;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}