public class Planeta {
    private String nome;
    private double diametro;

    public void rotacionar() {
        System.out.println("O planeta está rotacionando.");
    }

    public void habitar() {
        System.out.println("Habitando o planeta.");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
}