public class Estrela {
    private String tipo;
    private double temperatura;

    public void emitirLuz() {
        System.out.println("Emitindo luz intensa.");
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}