import java.util.Scanner; // importação do pacote Scanner

public class Aposentadoria {

     // Mecanismo responsável por gerenciar as entradas do teclado e colocar nas variáveis
     final static Scanner LER = new Scanner(System.in);

     // método principal do programa aqui que tudo inicia
     public static void main(String[] args) {
 
         // Declaração das variáveis
         int idade = 0;
         int anoNascimento = 0;
         int numEmpregado = 0;
         int anoIngresso = 0;
         int tempo = 0;
         int anoAtual = 0;
 
         // chamada e passagem do parâmetro para o método lerIdade
         numEmpregado = Codigo(numEmpregado);
         anoNascimento = lerNascimento(anoNascimento);
         anoIngresso = lerIngresso(anoIngresso);
         anoAtual = AnoRecente(anoAtual);
 
         // chamada e passagem dos parâmetros para o método classificar eleitor
         tempo = calcTempo(anoIngresso, anoAtual);
         idade = calcIdade(anoNascimento, anoAtual);
         // chamada e passagem do parâmetro para o método imprimirClasseEleitoral
         DefinirAposent(idade, tempo);
 
     }

     public static int Codigo(int numEmpregado){
        System.out.println("Digite seu código de empregado: ");
        numEmpregado=LER.nextInt();
        return numEmpregado;
     }

     public static int lerNascimento(int anoNascimento) {
        System.out.println("Digite o ano de seu nascimento: ");
        anoNascimento = LER.nextInt();
        return anoNascimento;
     }

     public static int AnoRecente(int anoAtual) {
        System.out.println("Digite o ano atual: ");
        anoAtual = LER.nextInt();
        return anoAtual;
     }

     public static int lerIngresso(int anoIngresso){
        System.out.println("Digite o ano que ingressou na empresa: ");
        anoIngresso = LER.nextInt();
        return anoIngresso;
     }

     public static int calcTempo(int anoIngresso, int anoAtual){
        int tempo = (anoAtual - anoIngresso);
        return tempo;
     }

     public static int calcIdade(int anoNascimento, int anoAtual){
        int idade = (anoAtual - anoNascimento);
        return idade;
     }
    
     public static void DefinirAposent (int idade, int tempo){
        if (idade == 65 && tempo == 30 || idade == 60 && tempo == 25){
            System.out.println("Requerer aposentadoria");
        }else{
            System.out.println("Não requerer aposentadoria");
        }
     }
}
