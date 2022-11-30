package entitites;

public class Paciente {

    //Atributos do paciente
    private String nome;
    private String sobrenome;
    private String cpf;
    private int anoDeNascimento;
    private String sexo;

    public Paciente() { // "Criador"
    }

    public Paciente(String nome, String sobrenome, String cpf, int anoDeNascimento, String sexo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.anoDeNascimento = anoDeNascimento;
        this.sexo = sexo;
    }

    public String getNome() { // Pegar o nome
        return nome;
    }

    
    public String getSobrenome() { // Pegar o sobrenome
        return sobrenome;
    }

    
    public String getCpf() { // Pegar o cpf
        return cpf;
    }

    
    public int getAnoDeNascimento() { // Pegar o ano de nascimento
        return anoDeNascimento;
    }

    
    public String getSexo() { // Pegar o "sexo" do paciente
        return sexo;
    }

}
