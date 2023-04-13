import java.util.Scanner; // importação do pacote Scanner

public class DiaSemana { // Classe do programa

    // Mecanismo responsável por gerenciar as entradas do teclado e colocar nas
    // variáveis/
    final static Scanner LER = new Scanner(System.in);

    // método principal do programa aqui que tudo inicia
    public static void main(String[] args) {

        // Declaração das variáveis
        int dia = 0;
        String diaSemana = null;

        // chamada e passagem do parâmetro para o método lerDia
        dia = lerDia(dia);

        // chamada e passagem do parâmetro para o método classificarDiaSemana
        diaSemana = classificarDiaSemana(dia);

        // chamada e passagem do parâmetro para o método imprimirDiaSemana
        imprimirDiaSemana(dia, diaSemana);

    }

    // Definição do método lerDia que recebe como parâmetro a variável dia e retorna
    // ela com o valor digitado pelo usuário
    public static int lerDia(int dia) {

        System.out.println("Dia:"); // Mensagem para o usuário
        dia = LER.nextInt(); // LER pega o próximo int do teclado para colocar na variável dia

        return dia; // retorna para o main devolvendo o valor de dia
    }

    // Definição do método classificarDiaSemana que recebe como parâmetro o dia e
    // retorna a string DiaSemana
    public static String classificarDiaSemana(int dia) {

        String diaSemana = null;

        switch (dia) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-feira";
                break;
            case 3:
                diaSemana = "Terça-feira";
                break;
            case 4:
                diaSemana = "Quarta-feira";
                break;
            case 5:
                diaSemana = "Quinta-feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Dia inválido";
        }
        return diaSemana; // retorna para o main devolvendo o valor do diaSemana
    }

    // Definição do método imprimir que recebe como parâmetro dia e diaSemana,
    // e não tem retorno (o retorno é void/vazio)
    public static void imprimirDiaSemana(int dia, String diaSemana) {
        System.out.println(dia + " = " + diaSemana); // Mensagem para o usuário + junta a mensagem com o
                                                     // valor da variável
    }
}   