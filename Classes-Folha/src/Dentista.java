public class Dentista {
    private String nome;
    private String especializacao;

    public void atenderPaciente() {
        System.out.println("Atendendo paciente na clínica.");
    }

    public void agendarConsulta() {
        System.out.println("Agendando consulta para o paciente.");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
}