public class Demolidor {
    private String nome;
    private String advogado;

    public void lutar() {
        System.out.println("Lutando como um demolidor.");
    }

    public void detectarPerigo() {
        System.out.println("Detectando perigo.");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAdvogado() {
        return advogado;
    }

    public void setAdvogado(String advogado) {
        this.advogado = advogado;
    }
}