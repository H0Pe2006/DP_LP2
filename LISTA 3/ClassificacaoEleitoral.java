import java.util.Scanner; // importação do pacote Scanner

public class ClassificacaoEleitoral { // Classe do programa

    // Mecanismo responsável por gerenciar as entradas do teclado e colocar nas variáveis
    final static Scanner LER = new Scanner(System.in);

    // método principal do programa aqui que tudo inicia
    public static void main(String[] args) {

        // Declaração das variáveis
        int idade = 0;
        String classeEleitoral = null;

        // chamada e passagem do parâmetro para o método lerIdade
        idade = lerIdade(idade);

        // chamada e passagem dos parâmetros para o método classificar eleitor
        classeEleitoral = classificarEleitor(idade);

        // chamada e passagem do parâmetro para o método imprimirClasseEleitoral
        imprimirClasseEleitoral(classeEleitoral);

    }

    // Definição do método lerIdade que recebe como parâmetro a variável idade e retorna ela com o valor digitado
    public static int lerIdade(int idade) {

        System.out.println("Idade:"); // Mensagem para o usuário
        idade = LER.nextInt(); // LER pega o próximo int do teclado para colocar na variável idade

        return idade; // retorna para o main devolvendo o valor de idade
    }

    // Definição do método classificarEleitor que recebe como parâmetro a idade e retorna a string classe eleitoral
    public static String classificarEleitor(int idade) {

        String classeEleitoral = null;

        if (idade < 16) {
            classeEleitoral = "não eleitor";
        } else if ((idade >= 16 && idade < 18) || (idade >= 65)) {
            classeEleitoral = "eleitor facultativo";
        } else if(idade >=18 && idade < 65){
            classeEleitoral = "eleitor obrigatório";
        }
        return classeEleitoral; // retorna para o main devolvendo o valor da classe eleitoral
    }

    // Definição do método imprimir que recebe como parâmetro classe eleitoral e não tem retorno (o retorno é void/vazio)
    public static void imprimirClasseEleitoral(String classeEleitoral) {
        System.out.println("Classe Eleitoral = " + classeEleitoral); // Mensagem para o usuário + junta a mensagem com o
                                                                     // valor da variável
    }  
}
