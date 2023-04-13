import java.util.Scanner; // importação do pacote Scanner

public class Carro { // Classe do programa

    // Mecanismo responsável por gerenciar as entradas do teclado e colocar nas variáveis
    final static Scanner LER = new Scanner(System.in);

    // método principal do programa aqui que tudo inicia
    public static void main(String[] args) {

        // Declaração das constantes
        final float TAXA_DISTRIBUIDOR = 0.28f;
        final float TAXA_IMPOSTO = 0.45f;

        // Declaração das variáveis
        float custoFabrica = 0;
        float valorTaxaDistribuidor = 0;
        float valorTaxaImposto = 0;
        float valorFinalCarro = 0;

        // chamada e passagem do parâmetro para o método lerCustoFabrica
        custoFabrica = lerCustoFabrica(custoFabrica);

        // chamada e passagem do parâmetro para o método calcularValorTaxaDistribuidor
        valorTaxaDistribuidor = calcularValorTaxaDistribuidor(custoFabrica, TAXA_DISTRIBUIDOR);

        // chamada e passagem do parâmetro para o método calcularValorTaxaImposto
        valorTaxaImposto = calcularValorTaxaImposto(custoFabrica, TAXA_IMPOSTO);

        // chamada e passagem do parâmetro para o método calcularValorFinalCarro
        valorFinalCarro = calcularValorFinalCarro(valorTaxaDistribuidor, valorTaxaImposto, custoFabrica);

        // chamada e passagem do parâmetro para o método imprimirRelatorioVenda
        imprimirRelatorioVenda(valorTaxaDistribuidor, valorTaxaImposto, valorFinalCarro);

    }

    // Definição do método lerCustoFabrica que recebe como parâmetro a variável dia e retorna ela com o valor digitado pelo usuário
    public static float lerCustoFabrica(float custoFabrica) {

        System.out.println("Custo de Fabricação:"); // Mensagem para o usuário
        custoFabrica = LER.nextFloat(); // LER pega o próximo float do teclado para colocar na variável custoFabrica

        return custoFabrica; // retorna para o main devolvendo o valor de custoFabrica
    }

    // Definição do método calcularValorTaxaDistribuidor que recebe como parâmetro o float custoFabrica e TAXA_DISTRIBUIDOR e retorna o valorTaxaDistribuidor
    public static float calcularValorTaxaDistribuidor(float custoFabrica, final float TAXA_DISTRIBUIDOR) {

        float valorTaxaDistribuidor = 0;

        valorTaxaDistribuidor = (custoFabrica * TAXA_DISTRIBUIDOR);

        return valorTaxaDistribuidor; // retorna para o main devolvendo o valor do valorTaxaDistribuidor
    }

    // Definição do método calcularValorTaxaImposto que recebe como parâmetro o float custoFabrica e TAXA_IMPOSTO e retorna o valorTaxaImposto
    public static float calcularValorTaxaImposto(float custoFabrica, final float TAXA_IMPOSTO) {

        float valorTaxaImposto = 0;

        valorTaxaImposto = (custoFabrica * TAXA_IMPOSTO);

        return valorTaxaImposto; // retorna para o main devolvendo o valor do valorTaxaImposto
    }

    // Definição do método calcularValorFinalCarro que recebe como parâmetro o valorTaxaDistribuidor, valorTaxaImposto, custoFabrica e retorna o valorFinalCarro
    public static float calcularValorFinalCarro(float valorTaxaDistribuidor, float valorTaxaImposto, float custoFabrica) {

        float valorFinalCarro = 0;

        valorFinalCarro = custoFabrica + valorTaxaDistribuidor + valorTaxaImposto;

        return valorFinalCarro; // retorna para o main devolvendo o valor do valorFinalCarro
    }

    // Definição do método imprimir um pequeno relatório de venda que recebe como parâmetro valorTaxaDistribuidor, valorTaxaImposto e valorFinalCarro, e não tem retorno (o retorno é void/vazio)
    public static void imprimirRelatorioVenda(float valorTaxaDistribuidor, float valorTaxaImposto, float valorFinalCarro) {
        System.out.println("RELATÓRIO DE VENDA");
        System.out.printf("\tValor taxa distribuidor: R$ %.2f\n" , valorTaxaDistribuidor);
        System.out.printf("\tValor taxa impostos: R$ %.2f\n" , valorTaxaImposto);
        System.out.printf("\tValor final: R$ %.2f\n" , valorFinalCarro);
    }
}