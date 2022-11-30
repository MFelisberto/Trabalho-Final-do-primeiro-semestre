package Hospital;
import java.util.Random;
import entitites.Paciente;
import entitites.Quarto;

public class Hospital { // CONTROLADOR

    private Quarto quartosNorte[] = new Quarto[90];
    private Quarto quartosSul[] = new Quarto[90];
    private String nomesAleatoriosMasculinos[] = new String[10];
    private String nomesAleatoriosFemininos[] = new String[10];
    private String sobrenomesAleatorios[] = new String[20];




    public Hospital() {
    
        // Cria os vetores dos nomes e sobrenomes aleatorios
        criadorDeNomesESobrenomesAleatorios();
    
        // Randomiza os quartos 
        criador();
    }

    public void criador() {
        // Loop para posicao do vetor 
        int posicao = 0;
        Random gerador = new Random();
        int valor = 0;
        int posicaoNomeAleatoria = 0;
        int posicaoSobrenomeAletoria = 0;
        String sexo = "";


        // **ALA NORTE**


        // Loop para o andar
        for(int andar = 1; andar <= 5; andar++) {

            // Loop para o quarto
            for(int quarto = 1; quarto <= 18; quarto++) {
        
                // Gera um estado do quarto aleatorio
                valor = gerador.nextInt(3);
            
                // Se o quarto estiver desocupado 
                if (valor == 0) { 
                quartosNorte[posicao] = new Quarto(valor, andar, quarto , null);
            
                } 
            
                // Se o quarto estiver ocupado 
                else if (valor == 1) {
                // Gera uma posicao aleatoria para os vetores de nome e sobrenome
                posicaoNomeAleatoria = gerador.nextInt(5);
                posicaoSobrenomeAletoria = gerador.nextInt(10);
                
                sexo = geradorDeSexo();
                // Se for masculino
                if(sexo.toString() == "MASCULINO") {
                    quartosNorte[posicao] = new Quarto(valor, andar, quarto, new Paciente(nomesAleatoriosMasculinos[posicaoNomeAleatoria], sobrenomesAleatorios[posicaoSobrenomeAletoria], geradorDeCpf(), geradorAnoDeNascimento() ,sexo));
                
                   
                }
                // Se for feminino
                else { 
                    quartosNorte[posicao] = new Quarto(valor, andar, quarto, new Paciente(nomesAleatoriosFemininos[posicaoNomeAleatoria], sobrenomesAleatorios[posicaoSobrenomeAletoria], geradorDeCpf(), geradorAnoDeNascimento() ,sexo));
                    
                }
                // Se o quarto estiver em manutencao
                } else {
                quartosNorte[posicao] = new Quarto(valor, andar , quarto, null);
                }
                
                  // Soma mais 1 a posicao do vetor
                  posicao++;
                }
        }  
            posicao = 0;
    
        // **ALA SUL**
    
        // Loop para o andar
        for(int andar = 1; andar <= 5; andar++) {
        
            // Loop para o quarto
            for(int quarto = 1; quarto <= 18; quarto++) {
            
                // Gera um estado do quarto aleatorio
                valor = gerador.nextInt(3);
                
                // Se o quarto estiver desocupado 
                if (valor == 0) { 
                    quartosSul[posicao] = new Quarto(valor, andar, quarto , null);
                 
                } 
                
                // Se o quarto estiver ocupado
                else if (valor == 1) {
                // Gera uma posicao aleatoria para os vetores de nome e sobrenome
                posicaoNomeAleatoria = gerador.nextInt(5);
                posicaoSobrenomeAletoria = gerador.nextInt(10);
                    
                sexo = geradorDeSexo();
                // Se for masculino
                if(sexo == "MASCULINO") {
                    quartosSul[posicao] = new Quarto(valor, andar, quarto, new Paciente(nomesAleatoriosMasculinos[posicaoNomeAleatoria], sobrenomesAleatorios[posicaoSobrenomeAletoria], geradorDeCpf(), geradorAnoDeNascimento() ,sexo));
                    
                } 
                // Se for feminino
                else {
                   quartosSul[posicao] = new Quarto(valor, andar, quarto, new Paciente(nomesAleatoriosFemininos[posicaoNomeAleatoria], sobrenomesAleatorios[posicaoSobrenomeAletoria], geradorDeCpf(), geradorAnoDeNascimento() ,sexo));
                
                }
                // Se o quarto estiver em manutencao
                } else {
                    quartosSul[posicao] = new Quarto(valor, andar , quarto, null);
                }
                    // Soma mais 1 a posicao do vetor
                    posicao++;
            }
        }  
    }

    public String geradorDeCpf() {
    
        String cpf = "";
        Random gerador = new Random();

    
        for(int i = 0; i < 11; i++) {
            cpf += gerador.nextInt(10);
        }
        
        return cpf;
    }

    public String geradorDeSexo() {
        
        String sexo = "";
        Random gerador = new Random();
        int randomizado = 0;
    
        // Randomiza um numero 0 ou 1
        randomizado = gerador.nextInt(2);
        // Dependendo do resultado adiciona um sexo. 50% de chances para ambos lados
        if(randomizado == 0) {
        sexo = "MASCULINO";
        } 
        
        else {
        sexo = "FEMININO";
        }
        
        return sexo;
    }

    public int geradorAnoDeNascimento(){
        int anoDeNascimento;
        Random gerador = new Random();
        int idade = 0;

        // Randomiza um nuemro de 0 a 100
        idade = gerador.nextInt(100);
        // Define o ano de Nascimento de acordo com uma idade aleatoria de 0 a 100 anos
        anoDeNascimento = 2022 - idade;

        return anoDeNascimento;
    }

    public void criadorDeNomesESobrenomesAleatorios() {

        // Adiciona os nomes masculinos ao vetor 
        nomesAleatoriosMasculinos[0] = "Henrique";
        nomesAleatoriosMasculinos[1] = "Lucas";
        nomesAleatoriosMasculinos[2] = "João";
        nomesAleatoriosMasculinos[3] = "Vinicius";
        nomesAleatoriosMasculinos[4] = "Mário";
        nomesAleatoriosMasculinos[5] = "Jailson";
        nomesAleatoriosMasculinos[6] = "Raul";
        nomesAleatoriosMasculinos[7] = "Antonio";
        nomesAleatoriosMasculinos[8] = "Gilberto";
        nomesAleatoriosMasculinos[9] = "Pedro";

        // Adiciona os nomes femininos ao vetor
        nomesAleatoriosFemininos[0] = "Júlia";
        nomesAleatoriosFemininos[1] = "Sabrina";
        nomesAleatoriosFemininos[2] = "Andriele";
        nomesAleatoriosFemininos[3] = "Luiza";
        nomesAleatoriosFemininos[4] = "Mirela";
        nomesAleatoriosFemininos[5] = "Fernanda";
        nomesAleatoriosFemininos[6] = "Maria";
        nomesAleatoriosFemininos[7] = "Augustina";
        nomesAleatoriosFemininos[8] = "Valentina";
        nomesAleatoriosFemininos[9] = "Vitoria";
    

        // Adiciona os sobrenomes ao vetor
        sobrenomesAleatorios[0] = "Zapella";
        sobrenomesAleatorios[1] = "Gomes";
        sobrenomesAleatorios[2] = "Silva";
        sobrenomesAleatorios[3] = "Rocha";
        sobrenomesAleatorios[4] = "Santos";
        sobrenomesAleatorios[5] = "Oliveira";
        sobrenomesAleatorios[6] = "Ferreira";
        sobrenomesAleatorios[7] = "Alves";
        sobrenomesAleatorios[8] = "Souza";
        sobrenomesAleatorios[9] = "Rodirgues";
        sobrenomesAleatorios[10] = "Callegari";
        sobrenomesAleatorios[11] = "Snitch";
        sobrenomesAleatorios[12] = "Lang";
        sobrenomesAleatorios[13] = "Mendes";
        sobrenomesAleatorios[14] = "Martins";
        sobrenomesAleatorios[15] = "Felisberto";
        sobrenomesAleatorios[16] = "Fernandes";
        sobrenomesAleatorios[17] = "Costa";
        sobrenomesAleatorios[18] = "Bîûlüng";
        sobrenomesAleatorios[19] = "Hamilton";


    }


    public Quarto[] getQuartosNorte() { // Pegar os quartos da ala norte
        return quartosNorte;
    }


    public void setQuartosNorte(Quarto[] quartosNorte) { // Settar os quartos da ala norte
        this.quartosNorte = quartosNorte;
    }


    public Quarto[] getQuartosSul() { // Pegar os quartos da ala sul
        return quartosSul;
    }


    public void setQuartosSul(Quarto[] quartosSul) { // Settar os quartos da ala sul
        this.quartosSul = quartosSul;
    }


    // Metodo para printa o mapa da tela no hospital
    public String mapPrinter() {

        String mapaNorte[][] = new String[5][18];
        String mapaSul[][] = new String[5][18];

        for(int i = 0; i < quartosNorte.length; i++) {
            
            // ALA NORTE
            
            // Teste que verifica se o quarto está ocupado, caso esteja passa a letra O para a posição na matriz
            if(quartosNorte[i].getEstadoDoQuarto() == 1) {
            mapaNorte[quartosNorte[i].getAndar()- 1] [quartosNorte[i].getNumeroDoQuarto()- 1] = ANSI_FUNDOVERMELHO +  " O " + ANSI_RESETA;
            } 
            
            // Testa se o quarto esta desocupado, caso esteja passa i valor D para a posição na matriz
            else if (quartosNorte[i].getEstadoDoQuarto() == 0) {
                mapaNorte[quartosNorte[i].getAndar()-1] [quartosNorte[i].getNumeroDoQuarto()- 1] = ANSI_FUNDOVERDE + " D " +  ANSI_RESETA;
            } 
            
            // Teste que verifica se o quarto esta em manutenção, caso esteja passa a letra M para a posicao na matriz
            else {
                mapaNorte[quartosNorte[i].getAndar()-1] [quartosNorte[i].getNumeroDoQuarto()- 1] = ANSI_FUNDOCINZA + ANSI_LETRACROPRETA + " M " +  ANSI_RESETA;
            }
            
            // ALA SUL
            
            // Teste que verifica se o quarto esta ocupado, caso esteja passa a letra O para a posição na matriz
            if(quartosSul[i].getEstadoDoQuarto() == 1) {
                mapaSul[quartosSul[i].getAndar()- 1] [quartosSul[i].getNumeroDoQuarto()- 1] = ANSI_FUNDOVERMELHO + " O " + ANSI_RESETA;
            } 
            
            // Testa se o quarto esta desocupado, caso esteja passa i valor D para a posicao na matriz
            else if (quartosSul[i].getEstadoDoQuarto() == 0) {
                mapaSul[quartosSul[i].getAndar()-1] [quartosSul[i].getNumeroDoQuarto()- 1] = ANSI_FUNDOVERDE +  " D " +  ANSI_RESETA;
            } 
            
            // Teste que verifica se o quarto esta em manutencao, caso esteja passa a letra M para a posicao na matriz
            else {
                mapaSul[quartosSul[i].getAndar()-1] [quartosSul[i].getNumeroDoQuarto()- 1] = ANSI_FUNDOCINZA + ANSI_LETRACROPRETA + " M " +  ANSI_RESETA;
            }
        }


        return converter(mapaNorte, mapaSul);
    }

    // Transforma as matrizes em uma string. *Nunca* chame este metodo, ele e apenas chamado pelo meotod mapPrinter.
    public String converter(String mapaNorte[][], String mapaSul[][]) {
        
        // Cria uma string para converter a matiz da ala norte
        String alaNorte = "                     " + ANSI_AMARELO + ANSI_LETRACROPRETA +  "MAPA ALA NORTE" + ANSI_RESETA + "\n";
        // Cria uma string para converter a matiz da ala sul
        String alaSul =  "\n\n                      " + ANSI_AMARELO + ANSI_LETRACROPRETA + "MAPA ALA SUL" + ANSI_RESETA + "\n";
        // Cria a String principal que somatiza as string da ala norte e ala sul
        String hospital = "";

        // Loop dos andares
        for(int i = 0; i < 5; i++) {
            
            // Adiciona os andares para cada linha
            alaNorte += ANSI_FUNDOROXO + (i + 1) + " " + ANSI_RESETA;
            
            // Loop do nro dos quartos
            for (int k = 0; k < 18; k++) {
                
                // Adiciona a string a situacao do quarto
                alaNorte +=  mapaNorte[i] [k] ;
                
            }

            alaNorte += "\n"; // Quebra de linha

        }

        alaNorte += "  " + ANSI_FUNDOAZUL + " 1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 " + ANSI_RESETA; // adiciona os andares na string na 
                                                                                                                    // parte de baixo

        hospital += alaNorte; // Somatiza a ala norte a strign pricnicpal do hospital

        hospital += alaSul;

        for(int i = 0; i < 5; i++) {
            hospital += ANSI_FUNDOROXO + (i + 1) + " " + ANSI_RESETA;
                for (int k = 0; k < 18; k++) {
                hospital +=  mapaSul[i] [k] ;
                    
                }
                hospital += "\n";
            }
            hospital += "  " + ANSI_FUNDOAZUL + " 1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 " + ANSI_RESETA;

        return hospital;
    }

    // Adiciona a cor do texto amarela
    public static final String ANSI_LETRAAMARELO = "\u001B[33m";
    // Adiciona a cor vermelha de texto
    public static final String ANSI_FUNDOVERMELHO = "\u001B[41m";
    // Adiciona a cor azul de fundo
    public static final String ANSI_FUNDOAZUL = "\u001B[44m";
    // Adiciona o fundo amarelo
    public static final String ANSI_AMARELO = "\u001B[43m";
    // Adiciona o fundo roxo
    public static final String ANSI_FUNDOROXO = "\u001B[45m";
    // Adiciona o fundo verde 
    public static final String ANSI_FUNDOVERDE = "\u001B[42m";
    // Adiciona a cor cinza de fundo 
    public static final String ANSI_FUNDOCINZA = "\u001B[47m";
    // Adiciona letra preta
    public static final String ANSI_LETRACROPRETA = "\u001B[30m"; 
    // Reseta a cor do texto. Necessario toda vez depois de usar a funcao de cor
    public static final String ANSI_RESETA = "\u001B[0m";


    // Ao escolher a opcao 2 que desocupa um quarto este meotodo e chamado
    public void desocupaQuarto(String ala, int andar, int nroDoQuarto) {
        
        // se o quarto está na ala sul
        if(ala.equals("SUL")) {
            for(int i = 0; i < quartosSul.length - 1; i++) {
                if(andar == quartosSul[i].getAndar() && nroDoQuarto == quartosSul[i].getNumeroDoQuarto()){
                    // altera o estado do quarto de ocupado para desocupado
                    quartosSul[i].setEstadoDoQuarto(0);
                    // passa o valor null para o paciente na dada posicao
                    quartosSul[i].setPaciente(null);
                }
            }
        }
        // Se o quarto está na ala norte
        if(ala.equals("NORTE")) {
            for(int i = 0; i < quartosSul.length - 1; i++) {
                if(andar == quartosNorte[i].getAndar() && nroDoQuarto == quartosNorte[i].getNumeroDoQuarto()){
                    quartosNorte[i].setEstadoDoQuarto(0);
                    quartosNorte[i].setPaciente(null);
                }
            }
        }
    }
      
    
    // Ao escolher a opcao 4 que pede as estatisticas do hospital este metodo e chamado
    public void estatisticasHospital(){
        //O programa procura quantos quartos disponiveis, ocupados ou em manutencao tem no hospital
        int quartosOcupados = 0;
        int quartosDisponiveis = 0;
        int quartosManutencao = 0;

        for(int i = 0; i < quartosNorte.length -1; i++) {
            if(quartosNorte[i].getEstadoDoQuarto() == 0){
                quartosDisponiveis++;
            }
            if(quartosNorte[i].getEstadoDoQuarto() == 1){
                quartosOcupados++;
            }
            if(quartosNorte[i].getEstadoDoQuarto() == 2){
                quartosManutencao++;
            }
        }
        for(int i = 0; i < quartosSul.length -1; i++) {
            if(quartosSul[i].getEstadoDoQuarto() == 0){
                quartosDisponiveis++;
            }
            if(quartosSul[i].getEstadoDoQuarto() == 1){
                quartosOcupados++;
            }
            if(quartosSul[i].getEstadoDoQuarto() == 2){
                quartosManutencao++;
            }
        }

        System.out.println("=================ESTATISTICAS DO HOSPITAL=================");
        System.out.println("Quartos disponíveis: " + quartosDisponiveis + " quartos disponíveis"+" / "+(quartosDisponiveis*100)/180+"%");
        System.out.println("QuartosOcupados: "+quartosOcupados+" quartos ocupados"+" / "+(quartosOcupados*100)/180+"%");
        System.out.println("Quartos em Manutencao: "+quartosManutencao+" quartos em manutencao"+" / "+(quartosManutencao*100)/180+"%");
        System.out.println("==========================================================");
    
        //O programa divide os pacientes em crianca, adolescente, adulto e idoso
        int quantidadeCrianca = 0;
        int quantidadeAdolescente = 0;
        int quantidadeAdulto = 0;
        int quantidadeIdoso = 0;
        int quantidadeMasculino = 0;
        int quantidadeFeminino = 0;
        int quantidadeDePacientes = 0;

        for(int i = 0; i < quartosNorte.length -1; i++) {
            //Se o quarto estiver ocupado continue o programa
            if(quartosNorte[i].getEstadoDoQuarto() == 1){
                quantidadeDePacientes++;
                    if(quartosNorte[i].getPaciente().getSexo().equals("MASCULINO")){
                        quantidadeMasculino++;
                    }
                    else if(quartosNorte[i].getPaciente().getSexo().equals("FEMININO")){
                        quantidadeFeminino++;
                    }

                    int anoDeNascimento = quartosNorte[i].getPaciente().getAnoDeNascimento();
                    int idade = 2022 - anoDeNascimento;
                    if(idade >= 0 && idade <= 11){
                        quantidadeCrianca++;
                    }
                    if(idade > 11 && idade <= 17){
                        quantidadeAdolescente++;
                    }
                    if(idade >= 18 && idade <= 59){
                        quantidadeAdulto++;
                    }
                    if(idade >= 60){
                        quantidadeIdoso++;
                    }
                    
            }

        }   

        for(int i = 0; i < quartosSul.length -1; i++) {
            //Se o quarto estiver ocupado continue o programa
            if(quartosSul[i].getEstadoDoQuarto() == 1){
                quantidadeDePacientes++;
                    if(quartosSul[i].getPaciente().getSexo().equals("MASCULINO")){
                        quantidadeMasculino++;
                    }
                    else if(quartosSul[i].getPaciente().getSexo().equals("FEMININO")){
                        quantidadeFeminino++;
                    }

                    int anoDeNascimento = quartosSul[i].getPaciente().getAnoDeNascimento();
                    int idade = 2022 - anoDeNascimento;
                    if(idade >= 0 && idade <= 11){
                        quantidadeCrianca++;
                    }
                    if(idade > 11 && idade <= 17){
                        quantidadeAdolescente++;
                    }
                    if(idade >= 18 && idade <= 59){
                        quantidadeAdulto++;
                    }
                    if(idade >= 60){
                        quantidadeIdoso++;
                    }
                    
            }

        }   
        
        System.out.println("Quantidade de criancas até 11 anos: "+quantidadeCrianca);
        System.out.println("Quantidade de adolescentes até 17 anos: "+quantidadeAdolescente);
        System.out.println("Quantidade de adultos até 59 anos: "+quantidadeAdulto);
        System.out.println("Quantidade de idosos de 60 anos ou mais: "+quantidadeIdoso);
        System.out.println("Quantidade % de pessoas de genero masculino: "+((quantidadeMasculino * 100)/quantidadeDePacientes));
        System.out.println("Quantidade % de pessoas de genero feminino: "+((quantidadeFeminino * 100)/quantidadeDePacientes));
        System.out.println("==========================================================");

    }

    // metodo que ocupa o primeiro quarto disponivel
    public void ocupaPrimeiroQaurtoDisponivel(String nome, String sobrenome, String cpf, int anoDeNascimento, String sexo ) {
    // Transforma a primeira letra em maiuscula
    nome = nome.substring(0,1).toUpperCase().concat(nome.substring(1));
    
    for(int i = 0; i < 90; i++) {
        if(quartosNorte[i].getEstadoDoQuarto() == 0) {
            quartosNorte[i].setEstadoDoQuarto(1); // transforma o estado do quarto para ocupado
            quartosNorte[i].setPaciente(new Paciente(nome, sobrenome, cpf, anoDeNascimento, sexo)); // adiciuona um paciente a posicao
            break; // se achar o quarto termina o loop

        } else if(quartosSul[i].getEstadoDoQuarto() == 0) {
            quartosSul[i].setEstadoDoQuarto(1); // transforma o estado do quarto para ocupado
            quartosSul[i].setPaciente(new Paciente(nome, sobrenome, cpf, anoDeNascimento, sexo)); // adiciuona um paciente a posicao
            break; // se achar o quarto termina o loop
        }
    }

    }

    public String procuraPaciente(String nome) {
    // Transforma a primeira letra em maiuscula
    nome = nome.substring(0,1).toUpperCase().concat(nome.substring(1));
    // String que guardara os pacientes
    String pacientesComONomeEscolhido = "";
    // para identificar se e a primeira vez que uma condicao acontece dentro do loop
    Boolean primeiraVez = true;

    // loop para os paciente na ala norte
    for(int i = 0; i < quartosNorte.length; i++) {
    // verifica se na posiucao o quarto esta desocupado
    if(quartosNorte[i].getEstadoDoQuarto() == 1){
        if(quartosNorte[i].getPaciente().getNome().equals(nome)) {
            if(primeiraVez == true) {
            pacientesComONomeEscolhido += "=================================================================================\n                               NOMES NA ALA NORTE\n=================================================================================\n";
            primeiraVez = false;
            }
        pacientesComONomeEscolhido +="Nome completo: "+  quartosNorte[i].getPaciente().getNome() + " " + quartosNorte[i].getPaciente().getSobrenome() + ", idade " + (2022 - quartosNorte[i].getPaciente().getAnoDeNascimento()) + " Anos" + ", Andar: " + quartosNorte[i].getAndar() + ", Numero do quarto: " + quartosNorte[i].getNumeroDoQuarto()+ "\n";    
        }
    }
    }

    // para reutilizar no loop para a ala sul
    primeiraVez = true;

     // loop para os paciente na ala norte
     for(int i = 0; i < quartosSul.length; i++) {
    // verifica se na posiucao o quarto esta desocupado
    if(quartosSul[i].getEstadoDoQuarto() == 1) {
        if(quartosSul[i].getPaciente().getNome().equals(nome)) {
            if(primeiraVez == true) {
            pacientesComONomeEscolhido += "=================================================================================\n                               NOMES NA ALA SUL\n=================================================================================\n";
            primeiraVez = false;
            }
        pacientesComONomeEscolhido +="Nome completo: "+  quartosSul[i].getPaciente().getNome() + " " + quartosSul[i].getPaciente().getSobrenome() + ", Idade: " + (2022 - quartosSul[i].getPaciente().getAnoDeNascimento()) + " Anos" + ", Andar: " + quartosSul[i].getAndar() + ", Numero do quarto: " + quartosSul[i].getNumeroDoQuarto() + "\n";    
        }
    }
}
        return pacientesComONomeEscolhido;
    }

}


