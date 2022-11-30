package aplicacao;
import java.util.Scanner;

import Hospital.Hospital;

public class Programa { 
    
    public static void main(String[] args) {
        String fechar = "";
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();

        // Na primeira execucao o mapa e printado automaticamente
        System.out.println(hospital.mapPrinter());
        System.out.println();

    do {
    
   
    //Menu para o usuário pode mexer no programa
    System.out.println(Hospital.ANSI_FUNDOROXO + "Escolha e digte a opção desejada:" + ANSI_RESETA); 
    System.out.print(ANSI_LetraVermelha + " 1 - Mapa do hospital" + ANSI_RESETA + "\n" + ANSI_LetraAzul  + " 2 - Para desocupar um quarto " + ANSI_RESETA + "\n" + ANSI_LetraVermelha +   " 3 - Para alocar um novo paciente"+ ANSI_RESETA + ANSI_LetraAzul + "\n" +   " 4 - Para localizar um paciente"+ ANSI_RESETA + "\n" + ANSI_LetraVermelha + " 5 - Para estatísticas do hospital"+ ANSI_RESETA + "\n" + ANSI_LetraAzul +  " 6 - Para encerrar o progama\n"+ ANSI_RESETA);
    int escolha = sc.nextInt();

    // impirmi o mapa
    if(escolha == 1) {

        System.out.println(hospital.mapPrinter()); // Imprimir o mapa das alas Norte e sul
        sc.nextLine();

    }

    if(escolha == 2){ // DESOCUPANDO O QUARTO
        sc.nextLine();
        System.out.print("Informe a ala desejada (sul / norte): ");
        String ala = sc.nextLine().toUpperCase();
        System.out.print("informe o número do andar: ");
        int andar = sc.nextInt();
        System.out.print("Informe o número do quarto: ");
        int nroDoQuarto = sc.nextInt();
        
        
        hospital.desocupaQuarto(ala, andar, nroDoQuarto); 
        sc.nextLine();
    }

    if(escolha == 3){ // ALOCANDO PACIENTE
        sc.nextLine();
        System.out.print("Primeiro nome do novo paciente: ");
        String nome = sc.nextLine();
        System.out.print("Sobrenome: ");
        String sobrenome = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Ano de nascimento: ");
        int anoDeNascimento = sc.nextInt();
        sc.nextLine();
        System.out.print("Sexo: ");
        String sexo = sc.nextLine().toUpperCase();
       

        // chama o metodo que ocupa o primeiro quarto disponivel
        hospital.ocupaPrimeiroQaurtoDisponivel(nome, sobrenome, cpf, anoDeNascimento, sexo); 
    }

    if(escolha == 4){ // LOCALIZANDO UM PACIENTE
        System.out.print("Primeiro nome do paciente que deseja localizar: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println(hospital.procuraPaciente(nome));
    }

    if(escolha == 5){ // ESTAÍSTICAS DO HOSPITAL
        hospital.estatisticasHospital();
        sc.nextLine();
    }

    if(escolha == 6){ // ENCERRAR PROGRAMA

        break;

    }
    
    System.out.println();
    System.out.println(ANSI_FUNDOVERDE + ANSI_LETRACROPRETA +  "Aperte a tecla enter para continuar a execucão do programa " + ANSI_RESETA); 
    fechar = sc.nextLine().toUpperCase();
     }while(fechar.equals("")); // Fazendo o menu se repetir pelo tempo que o utilizador quiser
    

     System.out.println(ANSI_FUNDOROXO + "SISTEMA ENCERRADO!!" + ANSI_RESETA); // WE DID IT!! https://www.youtube.com/watch?v=raos5cz4Fgc&ab_channel=FORMULA1
     System.out.println();
     System.out.println(Hospital.ANSI_FUNDOVERDE + "AGRADECIMENTOS ESPECIAL AOS QUE ESCREVERAM ESTE CODIGO: Henrique Zapella, Marcelo Augusto e Arthur Ferreira" + ANSI_RESETA);
    sc.close(); // desaloca o recurso Scanner
    }


    // Adiciona a cor do texto amarela
    public static final String ANSI_LetraAmarelo = "\u001B[33m";
    // Adiciona o fundo roxo
    public static final String ANSI_FUNDOROXO = "\u001B[45m";
    // Adiciona letra preta
    public static final String ANSI_LETRACROPRETA = "\u001B[30m"; 
    // Reseta a cor do texto. Necessario toda vez depois de usar a funcao de cor
    public static final String ANSI_RESETA = "\u001B[0m";
    // Adiciona a letra de cor verde
    public static final String ANSI_LetraVermelha = "\u001B[31m";
    // adiciona fundo de cor verde
    public static final String ANSI_FUNDOVERDE = "\u001B[42m";
    // Adiciona a cor de texto verde 
    public static final String ANSI_LetraVerde = "\u001B[32m";
    // Adiciona a cor de texto azul
    public static final String ANSI_LetraAzul = "\u001B[34m";

}
