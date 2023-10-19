public class Comprador {
    private String nome;
    private String endereco;

    public void comprar() {
        System.out.println("Realizando compra.");
    }

    public void realizarCompra() {
        System.out.println("Compra realizada com sucesso.");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}