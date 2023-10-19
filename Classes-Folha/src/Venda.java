public class Venda {
    private double valorTotal;
    private String produto;

    public void realizarVenda() {
        System.out.println("Venda realizada com sucesso.");
    }

    public void ofertamento() {
        System.out.println("Ofertando produtos para venda.");
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
