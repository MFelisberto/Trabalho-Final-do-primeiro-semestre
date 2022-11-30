package entitites;

public class Quarto {
    
    //Atributos do quarto
    private int estadoDoQuarto;
    private int andar;
    private int numeroDoQuarto;
    private Paciente paciente;
    
    public Quarto() { // "criador"
    }

    public Quarto(int estadoDoQuarto, int andar, int numeroDoQuarto, Paciente paciente) {
        this.estadoDoQuarto = estadoDoQuarto;
        this.andar = andar;
        this.numeroDoQuarto = numeroDoQuarto;
        this.paciente = paciente;
    }

    public int getEstadoDoQuarto() { // Pegar o estado do quarto
        return estadoDoQuarto;
    }

    public void setEstadoDoQuarto(int estadoDoQuarto) { // Settar o estado do quarto
        this.estadoDoQuarto = estadoDoQuarto;
    }

    public int getAndar() { // Pegar o andar que o quarto está
        return andar;
    }

    public void setAndar(int andar) { // Settar o andar do quarto
        this.andar = andar;
    }

    public int getNumeroDoQuarto() { // Pegar o número do quarto
        return numeroDoQuarto;
    }

    public void setNumeroDoQuarto(int numeroDoQuarto) { // Settar o número do quarto
        this.numeroDoQuarto = numeroDoQuarto;
    }

    public Paciente getPaciente() { // Pegar o paciente que está no quarto
        return paciente;
    }

    public void setPaciente(Paciente paciente) { // Settar o paciente que está no quarto
        this.paciente = paciente;
    }

    
    

}
