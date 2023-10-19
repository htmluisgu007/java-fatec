public class Impressora {
    private String modelo;
    private int nivelTinta;

    public void imprimir() {
        System.out.println("Imprimindo...");
    }

    public void armazenarFolhas() {
        System.out.println("Armazenando folhas na impressora.");
    }

    public void ligar() {
        System.out.println("Ligando a impressora.");
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setNivelTinta(int nivelTinta) {
        this.nivelTinta = nivelTinta;
    }

    public int getNivelTinta() {
        return nivelTinta;
    }
}